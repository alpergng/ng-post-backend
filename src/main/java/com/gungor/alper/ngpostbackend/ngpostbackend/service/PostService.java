package com.gungor.alper.ngpostbackend.ngpostbackend.service;

import com.gungor.alper.ngpostbackend.ngpostbackend.dto.PostDto;
import com.gungor.alper.ngpostbackend.ngpostbackend.exception.PostNotFoundException;
import com.gungor.alper.ngpostbackend.ngpostbackend.model.Post;
import com.gungor.alper.ngpostbackend.ngpostbackend.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by Ag on 22.12.2019
 */
@Service
public class PostService {


    @Autowired
    private AuthService authService;
    @Autowired
    private PostRepository postRepository;

    public void createPost(PostDto postDto){
        Post post = mapFromDtoToPost(postDto);
        postRepository.save(post);
    }



    public List<PostDto> showAllPosts() {
        // List<Post> posts = postRepository.findAll();
        User username =  authService.getCurrentUser().orElseThrow(()-> new IllegalArgumentException("No User Logged In"));
        List<Post> posts = postRepository.findByUsername(username.getUsername());
        return posts.stream().map(this::mapFromPosToDto).collect(toList());
    }

    private PostDto mapFromPosToDto(Post post) {
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setPicUrl(post.getPicUrl());
        postDto.setContent(post.getContent());
        postDto.setUsername(post.getUsername());
        return postDto;
    }
    private Post mapFromDtoToPost(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setPicUrl(postDto.getPicUrl());
        post.setContent(postDto.getContent());
        User username =  authService.getCurrentUser().orElseThrow(()-> new IllegalArgumentException("No User Logged In"));
        post.setUsername(username.getUsername());
        post.setCreatedOn(Instant.now());
        return post;
    }

    public PostDto readSinglePost(Long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new PostNotFoundException("For id " + id));

        return mapFromPosToDto(post);
    }

    public void deleteSinglePost(Long id){
        Post post = postRepository.findById(id).orElseThrow(() -> new PostNotFoundException("For id " + id));
        postRepository.delete(post);
    }
}
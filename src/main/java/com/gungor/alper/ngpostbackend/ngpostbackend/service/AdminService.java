package com.gungor.alper.ngpostbackend.ngpostbackend.service;


import com.gungor.alper.ngpostbackend.ngpostbackend.dto.AdminResponse;
import com.gungor.alper.ngpostbackend.ngpostbackend.model.Post;
import com.gungor.alper.ngpostbackend.ngpostbackend.model.User;
import com.gungor.alper.ngpostbackend.ngpostbackend.repository.PostRepository;
import com.gungor.alper.ngpostbackend.ngpostbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Ag on 24.12.2019
 */
@Service
@Transactional
public class AdminService {
    @Autowired
    private AuthService authService;
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;

    public AdminResponse getAdminResponse(){
        AdminResponse adminResponse = new AdminResponse(getUserNumberByUserType(),getPostNumber());
        return adminResponse;
    }


    public String getPostNumber() {
        org.springframework.security.core.userdetails.User username = authService.getCurrentUser().orElseThrow(() -> new IllegalArgumentException("No User Logged In"));
        Optional<User> connectedAdmin = userRepository.findByUsername(username.getUsername());
        String responsibleUserType = connectedAdmin.get().getUserType().replace("admin","user");
        return String.valueOf(postRepository.findByUserType(responsibleUserType).size());

    }

    public String getUserNumberByUserType() {
        org.springframework.security.core.userdetails.User username = authService.getCurrentUser().orElseThrow(() -> new IllegalArgumentException("No User Logged In"));
        Optional<User> connectedAdmin = userRepository.findByUsername(username.getUsername());
        String responsibleUserType = connectedAdmin.get().getUserType().replace("admin","user");
        return String.valueOf(userRepository.findByUserType(responsibleUserType).size());
    }

    public void deleteByUserName(String username) {
        userRepository.removeByUsername(username);
    }

    public boolean isAdmin() {
        org.springframework.security.core.userdetails.User username = authService.getCurrentUser().orElseThrow(() -> new IllegalArgumentException("No User Logged In"));
        return userRepository.findByUsername(username.getUsername()).get().getUserType().startsWith("admin");
    }


}

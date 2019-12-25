package com.gungor.alper.ngpostbackend.ngpostbackend.repository;


import com.gungor.alper.ngpostbackend.ngpostbackend.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

/**
 * Created by Ag on 22.12.2019
 */
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByUsername(String username);

    //@Query("SELECT * FROM ngpost.post p JOIN ngpost.user u ON p.username = u.username AND u.user_type = ?1")
    @Query("FROM Post p JOIN User u ON u.username = p.username AND u.userType = ?1")
    List<Object> findByUserType(String userType);


}

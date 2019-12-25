package com.gungor.alper.ngpostbackend.ngpostbackend.repository;

import com.gungor.alper.ngpostbackend.ngpostbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Ag on 22.12.2019
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

   List<User> findByUserType(String userType);

    Long removeByUsername(String name);

}

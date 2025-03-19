package com.blogsbackend.blogs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blogsbackend.blogs.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
    User findByEmail(String email);

}

package com.tencorners.demospringsecurity.repository;

import com.tencorners.demospringsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

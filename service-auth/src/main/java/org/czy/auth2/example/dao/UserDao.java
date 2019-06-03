package org.czy.auth2.example.dao;

import org.czy.auth2.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);


}

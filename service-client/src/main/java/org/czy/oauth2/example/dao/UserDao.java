package org.czy.oauth2.example.dao;

import org.czy.oauth2.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chenzhiyuan
 * @date 2019/5/31
 * @Description
 */
public interface UserDao extends JpaRepository<User, Long> {
}

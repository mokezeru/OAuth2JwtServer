package com.charter.oAuth2JWTServer.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.charter.oAuth2JWTServer.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

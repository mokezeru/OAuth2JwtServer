package com.charter.oAuth2JWTServer.service;

import com.charter.oAuth2JWTServer.model.User;
import java.util.List;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(Long id);
}
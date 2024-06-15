package com.digitalesweb.services;

import com.digitalesweb.entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<User> findAll();
    Optional<User> findById(Long id);
    void save(User user);
    void deleteById(Long id);

}

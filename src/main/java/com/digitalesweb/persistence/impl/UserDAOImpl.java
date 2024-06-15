package com.digitalesweb.persistence.impl;

import com.digitalesweb.entities.User;

import com.digitalesweb.persistence.IUserDAO;
import com.digitalesweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserDAOImpl implements IUserDAO {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);

    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);

    }
}

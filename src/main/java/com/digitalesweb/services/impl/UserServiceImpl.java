package com.digitalesweb.services.impl;

import com.digitalesweb.entities.User;
import com.digitalesweb.persistence.IUserDAO;
import com.digitalesweb.repository.UserRepository;
import com.digitalesweb.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDAO iUserDAO;


    @Override
    public List<User> findAll() {
        return iUserDAO.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return iUserDAO.findById(id);
    }

    @Override
    public void save(User user) {
        iUserDAO.save(user);
    }

    @Override
    public void deleteById(Long id) {
        iUserDAO.deleteById(id);

    }
}

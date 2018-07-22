package com.dgrabchak.service;

import com.dgrabchak.dao.UserDao;
import com.dgrabchak.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private MailService mailService;
    
    @Override
    public User addUser(User user) {
        String hashedPassword = hashPassword(user.getPassword());
        user.setPassword(hashedPassword);
        user.setToken(generateToken());
        User u = userDao.addUser(user);
        mailService.notify(user);
        return u;
    }

    @Override
    public User getByEmail(User user) {
        return userDao.getByEmail(user);
    }

    private String hashPassword (String password) {
        return String.valueOf(Objects.hash(password));
    }

    private String generateToken() {
        return UUID.randomUUID().toString();
    }
}

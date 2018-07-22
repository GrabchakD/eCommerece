package com.dgrabchak.service;

import com.dgrabchak.model.User;

public interface UserService {

    User addUser(User user);

    User getByEmail(User user);
}

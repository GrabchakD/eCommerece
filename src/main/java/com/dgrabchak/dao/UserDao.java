package com.dgrabchak.dao;

import com.dgrabchak.model.User;

public interface UserDao {

    User addUser(User user);

    User getByEmail(User user);
}

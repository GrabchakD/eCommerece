package com.dgrabchak.service;

import com.dgrabchak.model.User;

public interface MailService {

    void notify(User user);
}

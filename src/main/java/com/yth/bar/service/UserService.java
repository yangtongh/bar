package com.yth.bar.service;

import com.yth.bar.pojo.User;

public interface UserService {

    String login(String username, String password);

    String register(User user);
}

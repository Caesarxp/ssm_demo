package com.engle.service.impl;

import com.engle.dao.UserDao;
import com.engle.service.UserService;
import com.engle.vo.User;

/**
 * Created by engle on 16-5-19.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User selectOne() {
        User user = userDao.SelectOne(1);
        return user;
    }
}

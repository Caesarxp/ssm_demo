package com.engle.dao;

import com.engle.vo.User;

/**
 * Created by engle on 16-5-19.
 */
public interface UserDao {
    User SelectOne(int id);
}

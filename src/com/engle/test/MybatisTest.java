package com.engle.test;

import com.engle.dao.UserDao;
import com.engle.utils.MybatisUtils;
import com.engle.vo.User;
import org.junit.Test;

/**
 * Created by engle on 16-5-19.
 */
public class MybatisTest {

    @Test
    public void selectOne(){
        UserDao userDao = MybatisUtils.getUserDao();
        User user = userDao.SelectOne(2);
        System.out.println(user);
    }

}

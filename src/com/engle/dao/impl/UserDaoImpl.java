package com.engle.dao.impl;

import com.engle.dao.UserDao;
import com.engle.utils.MybatisUtils;
import com.engle.vo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by engle on 16-5-19.
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {


    public User SelectOne(int id) {
        String statement = "com.engle.vo.UserMapper.selectOne";
       return getSqlSession().selectOne(statement,1);
    }
}

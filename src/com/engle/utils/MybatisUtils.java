package com.engle.utils;

import com.engle.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by engle on 16-5-19.
 */
public class MybatisUtils {
    public static UserDao getUserDao(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        return (UserDao) context.getBean("userDao");
    }
}

package com.engle.action;

import com.engle.service.UserService;
import com.engle.vo.User;

/**
 * Created by engle on 16-5-19.
 */
public class UserAction {
    private User user;
    private UserService service;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getService() {
        return service;
    }

    public void setService(UserService service) {
        this.service = service;
    }


    public String getOneUser() throws Exception {
        user = service.selectOne();
        System.out.println(user);
        return "success";
    }
}


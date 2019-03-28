package com.yan.action;

import com.opensymphony.xwork2.ActionSupport;
import com.yan.bean.User;
import com.yan.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class UserAction extends ActionSupport {

    private int userId;
    private String userName;
    private String userPhone;

    @Autowired
    private UserServiceImpl userService;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String add(){
        User user = new User();
        user.setUserId(getUserId());
        user.setName(getUserName());
        user.setPhone(getUserPhone());
        userService.add(user);
        return SUCCESS;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
}

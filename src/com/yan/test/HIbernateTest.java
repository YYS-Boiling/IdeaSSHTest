package com.yan.test;

import com.yan.bean.User;
import com.yan.service.UserService;
import com.yan.service.serviceImpl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HIbernateTest {

    public static void main(String[] args) {

        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");

        UserService userService = (UserServiceImpl)ac.getBean("user");

        User user = new User();
        user.setUserId(1);
        user.setName("yan");
        user.setPhone("23123123");

        userService.add(user);
    }

}

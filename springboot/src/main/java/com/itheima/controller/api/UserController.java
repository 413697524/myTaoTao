package com.itheima.controller.api;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lemon on 2018/8/27.
 *
 * @author: lemon
 * @Description:
 * @Modified By:
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/api/user")
    public User getUserInfo() {
        User user = new User();
        userService.showMsg();
        return user;
    }
}

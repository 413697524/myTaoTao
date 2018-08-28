package com.itheima.controller;


import com.itheima.entity.TbUser;
import com.itheima.service.impl.TbUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author Yanghu
 * @since 2018-08-28
 */
@RestController
public class TbUserController {

    @Autowired
    TbUserServiceImpl tbUserService;

    @RequestMapping("/tbUser")
    public String addTbUser() {
//        TbUser tbUser = new TbUser();
//        tbUser.setUsername("马化腾");
//        tbUser.setPhone("13631057423");
//        tbUser.setEmail("413697524@qq.com");
//        tbUserService.insert(tbUser);
//        TbUser tbUser = tbUserService.selectById(7);
//        ObjectMapper mapper = new ObjectMapper();
//        try {
//            String string = mapper.writeValueAsString(tbUser);
//            System.out.println("==============string:" + string);
//            return string;
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
        TbUser user = new TbUser();
        user.setUsername("杨洋");
        user.setPassword("123456");
        user.setId(null);
        LocalDateTime date = LocalDateTime.now();
        user.setCreated(date);
        user.setUpdated(date);
        tbUserService.insert(user);
        return null;
    }

}

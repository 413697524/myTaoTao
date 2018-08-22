package com.taotao.controller;

import com.taotao.pojo.TbUser;
import com.taotao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lemon on 2018/8/22.
 *
 * @author: lemon
 * @Description:
 * @Modified By:
 */
@Controller
public class TestController {

    @Autowired
    IUserService userService;


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public TbUser getUser() {
        TbUser tbUser = userService.showMsg();
        return tbUser;
    }
}

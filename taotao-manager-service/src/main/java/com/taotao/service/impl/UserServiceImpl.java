package com.taotao.service.impl;

import com.taotao.pojo.TbUser;
import com.taotao.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by lemon on 2018/8/22.
 *
 * @author: lemon
 * @Description:
 * @Modified By:
 */
@Service
public class UserServiceImpl implements IUserService {


    @Override
    public TbUser showMsg() {
        System.out.println("我是调用的service");
        TbUser tbUser = new TbUser();
        tbUser.setId((long) 1);
        tbUser.setCreated(new Date());
        return tbUser;
    }
}

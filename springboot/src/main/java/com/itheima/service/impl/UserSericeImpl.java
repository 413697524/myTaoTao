package com.itheima.service.impl;

import com.itheima.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by lemon on 2018/8/27.
 *
 * @author: lemon
 * @Description:
 * @Modified By:
 */
@Service
public class UserSericeImpl implements UserService {
    @Override
    public void showMsg() {
        System.out.println("=========showMsg");
    }
}

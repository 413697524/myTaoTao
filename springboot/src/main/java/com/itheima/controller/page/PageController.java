package com.itheima.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lemon on 2018/8/27.
 *
 * @author: lemon
 * @Description:
 * @Modified By:
 */
@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

}

package com.lh.spring;

import com.lh.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@RestController
@Controller
public class BeanController {

    @RequestMapping("/")
    public String name() {
        System.out.println("aaa");
        return "index";
    }

    @RequestMapping(value="/aaa")
    @ResponseBody
    public User name2() {
        User user=new User();
        user.setId(1);
        user.setName("近几年");
        user.setPwd("1212");

        return user;
    }
    @RequestMapping(value="/aa")
    @ResponseBody
    public String name3() {
        return "法国方法";
    }

}
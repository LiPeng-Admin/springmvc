package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lipeng
 * @version 1.0
 * @description: TODO
 * @date 2022/10/15 17:12
 */
@Controller
public class UserController {
    /**
     * @description: 使用RESTful模拟用户资源的增删改查
     * @param:
     * @param n
     * @return:
     * @author lipeng
     * @date: 2022/10/15 17:13
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("查询用户所有信息");
        return "success";

    }
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUserById(){
        System.out.println("根据用户id查询用户信息");
        return "success";
    }
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    //通过控制器方法的形参获取请求参数
    public String insertUser(String username, String password){
        System.out.println("添加用户信息："+username+","+password);
        return "success";


    }
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String updateUser(String username, String password){
        System.out.println("修改用户信息:"+username+":"+password);
        return "success";
    }

}

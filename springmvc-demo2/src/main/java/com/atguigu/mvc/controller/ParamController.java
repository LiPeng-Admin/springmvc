package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author lipeng
 * @version 1.0
 * @description: TODO
 * @date 2022/10/10 22:47
 */
@Controller
public class ParamController {
    @RequestMapping("/testServeltAPI")
    public String getParameter(HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username: " + username + " password: " + password);
        return "success";

    }
    @RequestMapping("/testParam")
    public String testParam(@RequestParam(value="user_name",required = false,defaultValue = "admin") String username,
                            String password,
                            String hobby,
                            @RequestHeader(value = "Host",required = true,defaultValue = "localhost")String host,
                            @CookieValue(value = "JSESSIONID",required = false,defaultValue = "123456")String cookie) {
        System.out.println("username: " + username + " password: " + password+",hobby"+hobby);
        System.out.println("host: " + host);
        System.out.println("cookie: " + cookie);
        return "success";
    }
    @RequestMapping("/testpojo")
    public String testPojo(User user){
        System.out.println("user"+user);
        return "success";
    }
}

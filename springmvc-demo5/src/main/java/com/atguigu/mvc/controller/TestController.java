package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lipeng
 * @version 1.0
 * @description: TODO
 * @date 2022/10/20 22:43
 */
@Controller
public class TestController {
    @RequestMapping("/**/testInterceptor")
    public String testInterceptor(){
        return "success";
    }
    @RequestMapping("/testExceptionHandler")
    public String testExceptionHandler(){
        System.out.println(10/0);
        return "success";
    }

}

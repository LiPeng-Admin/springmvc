package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lipeng
 * @version 1.0
 * @description: TODO
 * @date 2022/10/13 23:44
 */
@Controller
public class TestController {
//    @RequestMapping(value = "/")
//    public String index(){
//        return "index";
//    }
    @RequestMapping( "/test_view")
    public String testView(){
        return "test_view";
    }
    @RequestMapping("/test_rest")
    public String testRest(){
        return "test_rest";
    }
}

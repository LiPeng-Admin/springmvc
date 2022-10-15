package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lipeng
 * @version 1.0
 * @description: TODO
 * @date 2022/10/15 16:30
 */
@Controller
public class JSPController {
    @RequestMapping("/success")
    public String getSuccess(){
        return "success";
    }
}

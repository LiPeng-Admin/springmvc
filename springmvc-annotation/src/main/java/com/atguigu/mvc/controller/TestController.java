package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lipeng
 * @version 1.0
 * @description: TODO
 * @date 2022/10/22 15:39
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String getIndex() {
        return "index";
    }
}

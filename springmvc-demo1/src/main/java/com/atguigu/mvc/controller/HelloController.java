package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.sun.imageio.plugins.jpeg.JPEG.version;

/**
 * @author lipeng
 * @version 1.0
 * @description: TODO
 * @date 2022/9/25 19:37
 */
@Controller
public class HelloController {
    @RequestMapping( "/")
    public String index() {
        //返回视图名称
        return "index";
    }
    @RequestMapping( "/target")
    public String toTarget() {
        return "target";
    }
}

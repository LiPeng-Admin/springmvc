package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lipeng
 * @version 1.0
 * @description: TODO
 * @date 2022/9/25 22:59
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {
    @RequestMapping(
            value={"testRequestMapping","test"}
    )
    public String getSuccess(){
        return "success";
    }
}

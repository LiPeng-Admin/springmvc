package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
            value = {"testRequestMapping", "test"},
            method = {RequestMethod.GET, RequestMethod.POST}
    )
    public String getSuccess() {
        return "success";
    }

    @GetMapping("/testGetMapping")
    public String getMapping() {
        return "success";
    }

    @RequestMapping(value = "/testPut", method = {RequestMethod.PUT})
    public String testPut() {
        return "success";
    }

    @RequestMapping(value = "/testParamesAndHeaders", params = {"username", "password=123456"}, headers = {"Host=localhost:8080"})
    public String testParamesAndHeaders() {
        return "success";
    }

    //    @RequestMapping("/a?a/testAnt")
//    @RequestMapping("/a*a/testAnt")
    @RequestMapping("/**/testAnt")
    public String testAnt() {
        return "success";
    }
    @RequestMapping("/testPath/{id}/{username}")
    public String testPath(@PathVariable("id")Integer id,@PathVariable("username")String username) {
        System.out.println("id: " + id+" username: " + username);
        return "success";
    }
}

package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author lipeng
 * @version 1.0
 * @description: TODO
 * @date 2022/10/14 20:40
 */
@Controller
public class ScopeController {
    //使用ServletAPI向request域对象共享数据
    @RequestMapping("/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request) {
        request.setAttribute("testRequestScope", "hello,servletAPI");

        return "success";

    }

    //
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView model = new ModelAndView();
        //处理模型数据，即向请求域request共享数据
        model.addObject("testRequestScope", "hello,ModelAndView");
        //设置视图名称
        model.setViewName("success");
        return model;
    }

    @RequestMapping("/testModel")
    public String testModel(Model model) {
        model.addAttribute("testRequestScope", "hello,Model");
        return "success";

    }

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        map.put("testRequestScope", "hello,Map");
        return "success";


    }

    @RequestMapping("/testModelMap")

    public String testModelMap(ModelMap model) {
        model.addAttribute("testRequestScope", "hello,ModelMap");
        return "success";

    }

    @RequestMapping("/testSession")
    public String testSession(HttpSession session) {

        session.setAttribute("testSessionScope", "hello,Session");
        return "success";
    }
    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session) {
        ServletContext application = session.getServletContext();
        application.setAttribute("testApplicationScope", "hello,Application");
        return "success";
    }
}

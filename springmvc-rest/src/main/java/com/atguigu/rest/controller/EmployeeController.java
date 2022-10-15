package com.atguigu.rest.controller;

import com.atguigu.rest.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author lipeng
 * @version 1.0
 * @description: TODO
 * @date 2022/10/15 23:06
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
}

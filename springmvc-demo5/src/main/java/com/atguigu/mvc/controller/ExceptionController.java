package com.atguigu.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author lipeng
 * @version 1.0
 * @description: 异常处理
 * @date 2022/10/22 11:03
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    public String getExceptionMessage(Exception exception, Model model) {
        model.addAttribute("exception",exception);
        return "error";

    }
}

package com.duming.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //ModelAndView 视图和模型
        ModelAndView mv = new ModelAndView();

        //调用业务层

        //封装对象放到ModelAndView中。
        mv.addObject("msg", "HelloSpringMVC!");

        //封装要跳转的视图，放到ModelAndView中
        mv.setViewName("hello");

        return mv;
    }
}

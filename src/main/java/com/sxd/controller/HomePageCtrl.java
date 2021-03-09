package com.sxd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("")
public class HomePageCtrl {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String home(HttpServletRequest request){
        request.setAttribute("sysName","后台服务系统");
        return "home";
    }
}

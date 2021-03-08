package com.sxd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/index")
public class IndexCtrl {

    @GetMapping("/")
    public String index(HttpServletRequest request){
        request.setAttribute("sysName","后台服务系统");
        return "index.html";
    }
}

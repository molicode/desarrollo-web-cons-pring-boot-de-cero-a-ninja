package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example4")
public class Example4Controller {

    private static final String ERROR_404 = "404";
    private static final String ERROR_500 = "500";

    @GetMapping("/show404")
    public String show404(){
        return ERROR_404;
    }

    @GetMapping("/show500")
    public String show500(){
        return ERROR_500;
    }

}

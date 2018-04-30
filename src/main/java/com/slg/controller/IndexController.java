package com.slg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
public class IndexController {

    @RequestMapping("/index")
    public String index() {

        int s = "asdf";
        return "index";
    }
}
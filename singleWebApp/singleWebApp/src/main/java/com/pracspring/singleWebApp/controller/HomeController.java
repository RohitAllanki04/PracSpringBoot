package com.pracspring.singleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    //inseated restcontroller used contorller ,used @ResponseBoby
    public String greet()
    {

        return "Hello World!";
    }
    @RequestMapping("/about")
    public String about()
    {
        return "we don't teach,we Educate!!";
    }
}

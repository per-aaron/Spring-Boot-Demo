package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoController {

    @GetMapping("/")
    public ModelAndView index(){
        return new ModelAndView("home");
    }

    @GetMapping("/links")
    public ModelAndView links(){
        return new ModelAndView("links");
    }

    @GetMapping("/quotes")
    public ModelAndView quotes(){
        return new ModelAndView("quotes");
    }
}

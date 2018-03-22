package com.law.collage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home() {
        return "index";
    }

    @RequestMapping("/index")
    public String lawHome() {
        return "law_home";
    }


    @RequestMapping("/links-scripts")
    public String links() {
        return "links-scripts";
    }

    @RequestMapping("/about-us")
    public String about() {
        return "about-us";
    }

    @RequestMapping("/ask")
    public String ask() {
        return "ask";
    }

    @RequestMapping("/contact-us")
    public String contact() {
        return "contact-us";
    }

    @RequestMapping("/gallary")
    public String gallary() {
        return "gallary";
    }

    @RequestMapping("/services")
    public String services() {
        return "services";
    }

    @RequestMapping("/team")
    public String team() {
        return "team";
    }

    @RequestMapping("/header")
    public String header() {
        return "header";
    }
}

package com.sapiens.springmvc.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controllers {
    @RequestMapping("/contact")
    public String Contact(){
        return "Hello this is Contact details pages";
    }

    @RequestMapping("/About")
    public String About(){
        return "This is a about company details page ";
    }
    @RequestMapping("/")
    public String home(){
        return "This is a home page";
    }
    @RequestMapping("/gallery")
    public String gallery(){
        return "This is a pgoto's page";
    }
}
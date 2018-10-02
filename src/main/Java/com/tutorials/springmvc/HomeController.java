package com.tutorials.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/home1", method = RequestMethod.GET)
    public String showhome() {
        return "home";
    }

    @RequestMapping(value = "/home1", method = RequestMethod.POST)
            public String homepage(){
            return "home";
        }
}

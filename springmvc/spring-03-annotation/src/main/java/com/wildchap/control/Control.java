package com.wildchap.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {

    @RequestMapping("/h1")
    public String index(Model model){
        model.addAttribute("msg", "hellow, springmvc");
        return "test";
    }


}

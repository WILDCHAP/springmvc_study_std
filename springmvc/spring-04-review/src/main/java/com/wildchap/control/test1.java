package com.wildchap.control;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test1 {

    @RequestMapping("/t1")
    public String index(Model model){
        model.addAttribute("msg", "hellow springmvc");
        return "test";
    }

    @RequestMapping("/t2/{a}/{b}")
    public String index2(@PathVariable int a,@PathVariable int b, Model model){
        int c = a + b;
        model.addAttribute("msg", "a + b = " + c);
        return "test";
    }

}

package com.wildchap.control;

import com.wildchap.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Control {

    @RequestMapping("/h1")
    public String test1(@RequestParam("username") String name, Model model){
        model.addAttribute("msg", name);
        return "forward:/WEB-INF/jsp/test.jsp";
    }

    @RequestMapping("/h1/t2")
    public String test2(User user, Model model){
        System.out.println(user);
        return "redirect:/WEB-INF/jsp/test.jsp";
    }

}

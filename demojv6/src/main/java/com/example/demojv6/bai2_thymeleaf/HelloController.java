package com.example.demojv6.bai2_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("hello")
    public String index(Model model){
        model.addAttribute("message","<b>Polytechnic</b>");
        return "index";
    }
}

package com.example.money;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class servlet {
    @GetMapping("/view")
    public String alo(){
        return "index";
    }
    @PostMapping("/usd")
    public String usd(@RequestParam double usd, double rate, Model model){
        double rs= usd*rate;
        model.addAttribute("result",rs);
        return "index";
    }
}

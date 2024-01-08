package srl.neotech.Test01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class HomeController {

    @GetMapping("/")
    public String parametri (@RequestParam("numero")Integer num, @RequestParam("stringa")String str,Model model){
        model.addAttribute("str", str);
        model.addAttribute("num", num);
        
        return "test-01";
    }

}

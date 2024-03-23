package srl.neotech.meteo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String homeMeteo(){
        return "/meteo";
    }
}

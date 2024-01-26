package srl.neotech.autosalone.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import srl.neotech.autosalone.model.AggiungiAutoRequest;
import srl.neotech.autosalone.model.Automobile;
import srl.neotech.autosalone.model.CercaAutoRequest;
import srl.neotech.autosalone.services.AutomobileService;
import srl.neotech.autosalone.services.HomeService;

@Controller
public class HomeController {
    
    @Autowired
    HomeService homeservice;

    @Autowired
    AutomobileService automobileService;

    
    
    @GetMapping("/")
    public String homepage(Model model ){
        String immaginecasuale1=homeservice.randomimg1();
        String immaginecasuale2=homeservice.randomimg2();
        String immaginecasuale3=homeservice.randomimg3();
        model.addAttribute("img1random", immaginecasuale1);
        model.addAttribute("img2random", immaginecasuale2);
        model.addAttribute("img3random", immaginecasuale3);
        return "homepage"; 
    }
     @GetMapping("/automobili")
    public String automobili(Model model){
        automobileService.tabellaAuto();
      model.addAttribute("tabAuto", automobileService.getAutomobileDao().getListaAutomobili());
        return "automobili";
    }

     
    @PostMapping("/aggiungiauto")
    public String aggiungiautoPost(@ModelAttribute AggiungiAutoRequest request, Model model){
        System.out.println(request);
        automobileService.aggiungiauto(request);
        model.addAttribute("message", "auto aggiunta correttamente");
        return "redirect:/automobili";

    }

    @GetMapping("/aggiungiauto")
    public String aggiungiauto(){
        
        return "aggiungiauto";
    }

    @GetMapping("cancellaAuto")
    public String cancellaAuto(@RequestParam("targa")String idDaCancellare , Model model){
        automobileService.cancellaAuto(idDaCancellare);
        ArrayList<Automobile>listaAutomobili=automobileService.getAutomobileDao().getListaAutomobili();
        model.addAttribute("automobile", listaAutomobili);
        return "automobili";
    }


  

    @GetMapping("/dettagliauto")
    public String dettagliauto(@RequestParam("targa")String idTrovaAuto , Model model){
        Automobile automobileDettaglio=automobileService.trovaAuto(idTrovaAuto);
        model.addAttribute("auto",automobileDettaglio);
        return "dettagliauto";
    }
    
    @PostMapping("/cerca")
    public String cercaAutoPost(@ModelAttribute CercaAutoRequest request,Model model){
       ArrayList<Automobile> autotrovate = automobileService.cercaAuto(request);
       model.addAttribute("autocercata", autotrovate);
        return "cerca";

    }

    @GetMapping("/cerca")
    public String cerca(){
        return "cerca";
    }

   


}

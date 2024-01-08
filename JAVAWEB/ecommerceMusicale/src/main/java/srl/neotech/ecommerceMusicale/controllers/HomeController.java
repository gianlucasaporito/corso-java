package srl.neotech.ecommerceMusicale.controllers;

import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import srl.neotech.ecommerceMusicale.model.AcquistoRequest;
import srl.neotech.ecommerceMusicale.model.Canzone;


@Controller
public class HomeController {

@GetMapping("/")
public String ritornocanzoni(@RequestParam("idCanzone") Optional<Integer> idCanzone, Model model){
    Integer  risBinding;
    Random r= new Random();
    risBinding=r.nextInt(2);
    
    
    if(risBinding==1){
     Canzone song1=new Canzone();
    song1.setCantante("ArticMonkeys");
    song1.setTitolo("Why'd you only call me when you're high");
    song1.setImmagine("https://e.snmc.io/i/600/s/d0a763a7f577f00bdd57b2f6e5d5bed6/5155217/arctic-monkeys-am-Cover-Art.jpg");
    model.addAttribute("canzone1", song1);
    Canzone song2=new Canzone();
        song2.setCantante("Eminem");
        song2.setTitolo("Stan");
        song2.setImmagine("https://e.snmc.io/i/600/s/d0a763a7f577f00bdd57b2f6e5d5bed6/5155217/arctic-monkeys-am-Cover-Art.jpg");
        model.addAttribute("canzone2", song2);
    }
    else  {
       Canzone song1=new Canzone();
        song1.setCantante("Eminem");
        song1.setTitolo("Stan");
        song1.setImmagine("https://e.snmc.io/i/600/s/d0a763a7f577f00bdd57b2f6e5d5bed6/5155217/arctic-monkeys-am-Cover-Art.jpg");
        model.addAttribute("canzone1", song1);
        Canzone song2=new Canzone();
    song2.setCantante("ArticMonkeys");
    song2.setTitolo("Why'd you only call me when you're high");
    song2.setImmagine("https://e.snmc.io/i/600/s/d0a763a7f577f00bdd57b2f6e5d5bed6/5155217/arctic-monkeys-am-Cover-Art.jpg");
    model.addAttribute("canzone2", song2);
    }
       
    return "listacanzoni";
}
@GetMapping("/acquista")
public String acquista(){
    return "acquistaPage";
}
@PostMapping("/acquistaForm")

public String acquistaForm(@ModelAttribute AcquistoRequest parametri){
    System.out.println(parametri.getLname());
    System.out.println(parametri.getDettaglio().getDescrizione());
    return "acquistosucces";
}
}

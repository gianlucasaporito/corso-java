package srl.neotech.meteo.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import srl.neotech.meteo.model.ResponseBase;
import srl.neotech.meteo.services.MeteoService;

@RestController

public class MeteoController {

@Autowired
MeteoService meteoService;
    
   
    
    @GetMapping("/getListaRegioni")
    public @ResponseBody ResponseBase  getListaRegioni(){
        ResponseBase response= new ResponseBase();
        response.setReturnCode("OK");
        response.setReturVale(meteoService.getListaRegioni());
        return response;
    }

    @GetMapping("/getListaProvince/{regione_id}")
    public @ResponseBody ResponseBase getListaProvince(@PathVariable ("regione_id") Integer regione_id){
        ResponseBase response = new ResponseBase();
        response.setReturVale(meteoService.getListaProvincia(regione_id));
        response.setReturnCode("OK");
        return response;
    }

    @GetMapping("/getListaCitta/{provincia_id}")
    public @ResponseBody ResponseBase getListaCitta(@PathVariable ("provincia_id") String provincia ){
        ResponseBase response = new ResponseBase();
        response.setReturnCode("oK");
        response.setReturVale(meteoService.getListaCitta(provincia));
        return response;
    }

    @GetMapping("/getMeteo/{istat}")
    public @ResponseBody ResponseBase getGeoloc(@PathVariable("istat") String istat){
        ResponseBase response= new ResponseBase();
        response.setReturnCode("ok");
        response.setReturVale(meteoService.getGeoloc(istat));
        return response;

    }

}

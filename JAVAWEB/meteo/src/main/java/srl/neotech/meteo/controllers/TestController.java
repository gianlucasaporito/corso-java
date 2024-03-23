package srl.neotech.meteo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import srl.neotech.meteo.model.ResponseBase;
import srl.neotech.meteo.model.UpdateClienteRequest;
import srl.neotech.meteo.services.TestService;



@RestController
public class TestController {

@Autowired
TestService testService;

@GetMapping("/test")
public @ResponseBody ResponseBase update(@RequestBody UpdateClienteRequest req ){
 ResponseBase response = new ResponseBase();
testService.updateCliente(req);
response.setReturnCode("ok");
return response;
}

}

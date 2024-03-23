package srl.neotech.meteo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.meteo.dao.ClienteDao;
import srl.neotech.meteo.model.UpdateClienteRequest;

@Service
public class TestService {
    @Autowired
    ClienteDao ClienteDao;

    public void updateCliente(UpdateClienteRequest req){
        ClienteDao.updateCliente(req);
    }

}

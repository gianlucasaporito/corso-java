package srl.neotech.autosalone.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import srl.neotech.autosalone.model.Automobile;

@Component
public class AutomobileDao {
    ArrayList<Automobile> listaAutomobili=new ArrayList<>();

    public ArrayList<Automobile> getListaAutomobili() {
        return listaAutomobili;
    }

    public void setListaAutomobili(ArrayList<Automobile> listaAutomobili) {
        this.listaAutomobili = listaAutomobili;
    }

    
   

}

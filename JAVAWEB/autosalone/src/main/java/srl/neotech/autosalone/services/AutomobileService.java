package srl.neotech.autosalone.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.autosalone.dao.AutomobileDao;
import srl.neotech.autosalone.model.AggiungiAutoRequest;
import srl.neotech.autosalone.model.Automobile;
import srl.neotech.autosalone.model.CercaAutoRequest;





@Service
public class AutomobileService {
    @Autowired
    AutomobileDao automobileDao;
    
    public void tabellaAuto(){
        for(int i=0;i<automobileDao.getListaAutomobili().size();i++){
        
         automobileDao.getListaAutomobili().get(i);}
        }
    

    public AutomobileDao getAutomobileDao() {
        return automobileDao;
    }

    public void setAutomobileDao(AutomobileDao automobileDao) {
        this.automobileDao = automobileDao;
    }


    public void aggiungiauto(AggiungiAutoRequest request){
        Automobile auto= new Automobile();
        auto.setTarga(request.getInputTarga());
        auto.setCostruttore(request.getInputCostruttore());
        auto.setModello(request.getInputModello());
        auto.setAlimentazione(request.getInputAlimentazione());
        auto.setCosto(request.getInputCosto());
        automobileDao.getListaAutomobili().add(auto);

    };


    public void cancellaAuto(String id){
        for(int i=0;i<automobileDao.getListaAutomobili().size();i++){
            if(automobileDao.getListaAutomobili().get(i).getTarga().equals(id)){
                automobileDao.getListaAutomobili().remove(i);
            }
        }
    }

   public Automobile trovaAuto(String idDaTrovare){
    for(int i=0;i<automobileDao.getListaAutomobili().size();i++){
        if(automobileDao.getListaAutomobili().get(i).getTarga().equals(idDaTrovare)){
            return automobileDao.getListaAutomobili().get(i);
        }
    }
    return null;
   }
    
   public ArrayList<Automobile> cercaAuto(CercaAutoRequest request){
    ArrayList<Automobile> autotrovate=new ArrayList<>();
    for(int i=0 ;i<automobileDao.getListaAutomobili().size();i++){
        if (request.getCercaAlimentazione()!="--" && automobileDao.getListaAutomobili().get(i).getAlimentazione().equals(request.getCercaAlimentazione())){
           autotrovate.add(automobileDao.getListaAutomobili().get(i));
           continue;
        }
        if (request.getCercaCosto()!=null && automobileDao.getListaAutomobili().get(i).getCosto().equals(request.getCercaCosto())){
            autotrovate.add(automobileDao.getListaAutomobili().get(i));
            continue;
         }
         if (request.getCercaCostruttore()!=null && automobileDao.getListaAutomobili().get(i).getCostruttore().equals(request.getCercaCostruttore())){
            autotrovate.add(automobileDao.getListaAutomobili().get(i));
            continue;
         }
         if (request.getCercaModello()!=null && automobileDao.getListaAutomobili().get(i).getModello().equals(request.getCercaModello())){
            autotrovate.add(automobileDao.getListaAutomobili().get(i));
            continue;
         }
         if (request.getCercaTarga()!=null && automobileDao.getListaAutomobili().get(i).getTarga().equals(request.getCercaTarga())){
            autotrovate.add(automobileDao.getListaAutomobili().get(i));
            continue;
         }
    }
    return autotrovate;
   }


}

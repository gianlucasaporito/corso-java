package srl.neotech.meteo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import srl.neotech.meteo.dao.CittaDao;
import srl.neotech.meteo.dao.GeolocDao;
import srl.neotech.meteo.dao.ProvinciaDao;
import srl.neotech.meteo.dao.RegioneDao;
import srl.neotech.meteo.dto.T_CITTA;
import srl.neotech.meteo.dto.T_GEOLOC;
import srl.neotech.meteo.dto.T_PROVINCIA;
import srl.neotech.meteo.dto.T_REGIONE;
import srl.neotech.meteo.model.MeteoGiorno;
import srl.neotech.meteo.model.ResponseMeteo;


@Service
public class MeteoService {

    @Autowired
    RegioneDao regioneDao;

    @Autowired
    ProvinciaDao provinciaDao;

    @Autowired
    CittaDao cittaDao;

    @Autowired
    GeolocDao geolocDao;


    private String datiMeteo(String lat ,String lng){
        WebClient webClient=null;
        webClient = WebClient.builder().baseUrl("https://api.open-meteo.com").build();
        String response = webClient.get().uri("/v1/forecast?latitude={lat}&longitude={lng}&daily=weather_code,sunrise,sunset&timezone=Europe/Berlin",lat,lng)
        .exchange()
        .block()
        .bodyToMono(String.class)
        .block();
        return response;
    }

    
     public List<T_REGIONE> getListaRegioni(){
        return regioneDao.getListaRegioni();    
     }

     public List<T_PROVINCIA> getListaProvincia(Integer regione_id){
        return provinciaDao.getListaProvince(regione_id);
     }

     public List<T_CITTA> getListaCitta(String provincia){
      return cittaDao.getListaCitta(provincia);
     }

     public String getGeoloc(String istat){
      T_GEOLOC geoloc =  geolocDao.getGeoloc(istat);
      String rispostaMeteo= datiMeteo(geoloc.getLat() , geoloc.getLng());
      
      return rispostaMeteo;
     }

}

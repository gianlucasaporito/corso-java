package srl.neotech.meteo.model;

import java.util.ArrayList;
import java.util.List;

public class ResponseMeteo {
    private List<MeteoGiorno> meteosettimana= new ArrayList<>();

    

    @Override
    public String toString() {
        return "ResponseMeteo [meteosettimana=" + meteosettimana + "]";
    }

    public List<MeteoGiorno> getMeteosettimana() {
        return meteosettimana;
    }

    public void setMeteosettimana(List<MeteoGiorno> meteosettimana) {
        this.meteosettimana = meteosettimana;
    }
    

}

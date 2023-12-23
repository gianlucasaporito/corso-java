package srl.neotech.aereoporto;

import java.util.ArrayList;

public class Aereo {
    private String costruttore;
    private String modello;
    private Integer capienzaPassegeri;
    private Integer velocita;
    private Integer distanzaAereoporto;
    private EstatoAereo statoAereo;
    ArrayList<Passeggero> passegeriABordo=new ArrayList<>();
    public String getCostruttore() {
        return costruttore;
    }
    public void setCostruttore(String costruttore) {
        this.costruttore = costruttore;
    }
    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public Integer getCapienzaPassegeri() {
        return capienzaPassegeri;
    }
    public void setCapienzaPassegeri(Integer capienzaPassegeri) {
        this.capienzaPassegeri = capienzaPassegeri;
    }
    public Integer getVelocita() {
        return velocita;
    }
    public void setVelocita(Integer velocita) {
        this.velocita = velocita;
    }
    public Integer getDistanzaAereoporto() {
        return distanzaAereoporto;
    }
    public void setDistanzaAereoporto(Integer distanzaAereoporto) {
        this.distanzaAereoporto = distanzaAereoporto;
    }
    public EstatoAereo getStatoAereo() {
        return statoAereo;
    }
    public void setStatoAereo(EstatoAereo statoAereo) {
        this.statoAereo = statoAereo;
    }
    public ArrayList<Passeggero> getPassegeriABordo() {
        return passegeriABordo;
    }
    public void setPassegeriABordo(ArrayList<Passeggero> passegeriABordo) {
        this.passegeriABordo = passegeriABordo;
    }

   

}

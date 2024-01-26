package srl.neotech.autosalone.model;


public class Automobile {
  private String targa;
  private String id;
  private String modello;
  private Integer costo;
  private String costruttore;
  private String alimentazione;
  

  public String getTarga() {
    return targa;
}
public void setTarga(String targa) {
    this.targa = targa;
}
public String getModello() {
    return modello;
}
public void setModello(String modello) {
    this.modello = modello;
}
public Integer getCosto() {
    return costo;
}
public void setCosto(Integer costo) {
    this.costo = costo;
}
public String getCostruttore() {
    return costruttore;
}
public void setCostruttore(String costruttore) {
    this.costruttore = costruttore;
}
public String getAlimentazione() {
    return alimentazione;
}
public void setAlimentazione(String alimentazione) {
    this.alimentazione = alimentazione;
}
public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}


}

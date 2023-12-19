package srl.neotech.aereoporto;

import java.util.ArrayList;

public class Aereoporto {
    private String nome;
    private String citta;
    private Integer spazioAereo;
    ArrayList <Aereo> aereiInPartenza=new ArrayList<>();
    ArrayList <Aereo> aereiInArrivo =new ArrayList<>();
    ArrayList <Passeggero> passegeriInpartenza=new ArrayList<>();

public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getCitta() {
    return citta;
}
public void setCitta(String citta) {
    this.citta = citta;
}
public Integer getSpazioAereo() {
    return spazioAereo;
}
public void setSpazioAereo(Integer spazioAereo) {
    this.spazioAereo = spazioAereo;
}
public ArrayList<Aereo> getAereiInPartenza() {
    return aereiInPartenza;
}
public void setAereiInPartenza(ArrayList<Aereo> aereiInPartenza) {
    this.aereiInPartenza = aereiInPartenza;
}
public ArrayList<Aereo> getAereiInArrivo() {
    return aereiInArrivo;
}
public void setAereiInArrivo(ArrayList<Aereo> aereiInArrivo) {
    this.aereiInArrivo = aereiInArrivo;
}
public ArrayList<Passeggero> getPassegeriInpartenza() {
    return passegeriInpartenza;
}
public void setPassegeriInpartenza(ArrayList<Passeggero> passegeriInpartenza) {
    this.passegeriInpartenza = passegeriInpartenza;
}

}

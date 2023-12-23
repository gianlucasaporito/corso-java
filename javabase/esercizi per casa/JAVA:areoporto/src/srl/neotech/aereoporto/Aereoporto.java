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

// ____metodi Arrrivo aerei____
public void transizioneInArrivo(Aereo aereoInArr){
    while (aereoInArr.getDistanzaAereoporto()<=0){
        aereoInArr.setDistanzaAereoporto(aereoInArr.getDistanzaAereoporto()-aereoInArr.getVelocita());
    }
}
// ____metodi Partenza aerei____
public void transizineInPartenza(Aereo aereoInPar){
    while(aereoInPar.getDistanzaAereoporto()>=getSpazioAereo()){
        aereoInPar.setDistanzaAereoporto(aereoInPar.getDistanzaAereoporto()+aereoInPar.getVelocita());
    }
}
 // _____checkout____
public void checkout(Passeggero passeggero){
    if (passeggero instanceof PasseggeroBusiness) {
        ((PasseggeroBusiness)passeggero).setHasChampagne(true);
    }
    if (passeggero instanceof PasseggeroTurista){
        ((PasseggeroTurista)passeggero).setHasGiornale(true);
    }
    if (passeggero instanceof PasseggeroFamiliare) {
        ((PasseggeroFamiliare)passeggero).setHasSnack(true);
    }
    if (passeggero.equals(Esesso.FEMMINA)) {
        passeggero.setHasFiore(true);
    }
  }
//_________checkin______
public void checkin (Passeggero passeggero){
    if (passeggero instanceof PasseggeroBusiness) {
        ((PasseggeroBusiness)passeggero).setHasChampagne(true);
    }
    if (passeggero instanceof PasseggeroTurista){
        ((PasseggeroTurista)passeggero).setHasGiornale(true);
    }
    if (passeggero instanceof PasseggeroFamiliare) {
        ((PasseggeroFamiliare)passeggero).setHasSnack(true);
    }
    if (passeggero.equals(Esesso.FEMMINA)) {
        passeggero.setHasFiore(true);
    }

}
}




package srl.neotech.ecommerceMusicale.model;

public class AcquistoDettaglioRequest {
private String descrizione;
private Integer quantità;

public Integer getQuantità() {
    return quantità;
}

public void setQuantità(Integer quantità) {
    this.quantità = quantità;
}

public String getDescrizione() {
    return descrizione;
}

public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
}
}

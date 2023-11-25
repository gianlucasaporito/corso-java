package srl.neotech.gestionezoo;

import java.util.ArrayList;

public class Gabbia {
    private Boolean isPulita;
    private Boolean isChiusa;
    
    public Boolean getIsPulita() {
        return isPulita;
    }
    public void setIsPulita(Boolean isPulita) {
        this.isPulita = isPulita;
    }
    public Boolean getIsChiusa() {
        return isChiusa;
    }
    public void setIsChiusa(Boolean isChiusa) {
        this.isChiusa = isChiusa;
    }
    ArrayList <Animali> animaliingabbia= new ArrayList<>();
}

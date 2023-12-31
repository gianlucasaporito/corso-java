package srl.neotech.aereoporto;

public class Passeggero {
    private Integer eta;
    private Boolean hasGiocattolo;
    private Boolean hasFiore;
    private Esesso sesso;
    private EstatoPassegero statopassegero;
    public Integer getEta() {
        return eta;
    }
    public void setEta(Integer eta) {
        this.eta = eta;
    }
    public Boolean getHasGiocattolo() {
        return hasGiocattolo;
    }
    public void setHasGiocattolo(Boolean hasGiocattolo) {
        this.hasGiocattolo = hasGiocattolo;
    }
    public Esesso getSesso(Esesso femmina) {
        return sesso;
    }
    public void setSesso(Esesso sesso) {
        this.sesso = sesso;
    }
    public EstatoPassegero getStatopassegero() {
        return statopassegero;
    }
    public void setStatopassegero(EstatoPassegero statopassegero) {
        this.statopassegero = statopassegero;
    }
    public Boolean getHasFiore() {
        return hasFiore;
    }
    public void setHasFiore(Boolean hasFiore) {
        this.hasFiore = hasFiore;
    }
}

package srl.neotech.citta;

public class Squadra extends Citta{
    private String nomeSquadra;
    private Integer tifosi;
    private String coloreMaglia;
    private Stadio Stadio;
    public String getNomeSquadra() {
        return nomeSquadra;
    }
    public void setNomeSquadra(String nomeSquadra) {
        this.nomeSquadra = nomeSquadra;
    }
    public Integer getTifosi() {
        return tifosi;
    }
    public void setTifosi(Integer tifosi) {
        this.tifosi = tifosi;
    }
    public String getColoreMaglia() {
        return coloreMaglia;
    }
    public void setColoreMaglia(String coloreMaglia) {
        this.coloreMaglia = coloreMaglia;
    }
    public Stadio getStadio() {
        return Stadio;
    }
    public void setStadio(Stadio stadio) {
        Stadio = stadio;
    }

    
}

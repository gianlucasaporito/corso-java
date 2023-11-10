package srl.neotech.citta;

public class Citta {
    private String nome;
    private Integer popolazione;
    private Squadra Squadra;
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getPopolazione() {
        return popolazione;
    }
    public void setPopolazione(Integer popolazione) {
        this.popolazione = popolazione;
    }
    public Squadra getSquadra() {
        return Squadra;
    }
    public void setSquadra(Squadra squadra) {
        Squadra = squadra;
    }
    
}

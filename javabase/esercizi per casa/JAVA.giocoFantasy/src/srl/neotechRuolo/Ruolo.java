package srl.neotechRuolo;

public class Ruolo {
    
    
    private Double forzaAttacco;
    private Double forzaDifesa;
    private Double stamina;
    
    
    public Double getForzaAttacco() {
        return forzaAttacco;
    }
    public void setForzaAttacco(Double forzaAttacco) {
        this.forzaAttacco = forzaAttacco;
    }
    public Double getForzaDifesa() {
        return forzaDifesa;
    }
    public void setForzaDifesa(Double forzaDifesa) {
        this.forzaDifesa = forzaDifesa;
    }
    public Double getStamina() {
        return stamina;
    }
    public void setStamina(Double stamina) {
        this.stamina = stamina;
    }


    public void attacca(Ruolo nemico){

    };
    protected void difendi(Double attacco){
        
    };

}

package srl.neotechRuolo;

public class Orco extends Ruolo{

    protected Double molDifesa=0.2;
    
    @Override
    public void attacca(Ruolo nemico){
        Double attacco = getForzaAttacco();
        System.out.println(getForzaAttacco()+"attacco dell'orco ");
        nemico.difendi(attacco);
    };

    @Override
    protected void difendi(Double attacco){
        Double difesa =getForzaDifesa()*molDifesa;
        System.out.println(difesa+"difesa dell'orco");   
        setStamina(getStamina()-(attacco));
        System.out.println("all'orco resta"+getStamina()+"di stamina");
    
};
}

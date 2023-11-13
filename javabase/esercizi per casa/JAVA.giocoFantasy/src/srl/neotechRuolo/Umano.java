package srl.neotechRuolo;

public class Umano extends Ruolo{
    
    protected Double molDifesa=0.8;
    
    @Override
    public void attacca(Ruolo nemico){
        Double attacco= getForzaAttacco();
        System.out.println(getForzaAttacco()+"attacco dell'umano ");
        nemico.difendi(attacco);
    }

    @Override
    protected void difendi(Double attacco){
        Double difesa =getForzaDifesa()*molDifesa;
        System.out.println(difesa+"difesa dell'umano");   
        setStamina(getStamina()-(attacco));
        System.out.println("all'umano resta"+getStamina()+"di stamina");
 };
}
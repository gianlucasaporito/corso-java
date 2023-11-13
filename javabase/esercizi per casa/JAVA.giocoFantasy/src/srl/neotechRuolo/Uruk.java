package srl.neotechRuolo;

public class Uruk extends Orco{

    protected Double molAttacco=1.9;

    @Override
    public void attacca(Ruolo nemico){
        Double attacco = getForzaAttacco()*molAttacco;
        System.out.println(attacco+"attacco dell' uruk");
        nemico.difendi(attacco);
    };

    @Override
    protected void difendi(Double attacco){
        Double difesa =getForzaDifesa()*molDifesa;
        System.out.println(difesa+"difesa dell' uruk");
        setStamina(getStamina()-(attacco));
        System.out.println("all'uruk resta"+getStamina()+"di stamina");
        
    };
}

package srl.neotechRuolo;

public class Mago extends Umano{

    protected Double molAttacco=1.6;

    @Override
    public void attacca(Ruolo nemico){
        Double attacco =getForzaAttacco()*molAttacco;
        System.out.println(attacco+"attacco del mago");
        nemico.difendi(attacco);
    };

    @Override
    protected void difendi(Double attacco){
        Double difesa =getForzaDifesa()*molDifesa;
        System.out.println(difesa+"difesa del mago");   
        setStamina(getStamina()-(attacco));
        System.out.println("al mago resta"+getStamina()+"di stamina");
        
    };
}

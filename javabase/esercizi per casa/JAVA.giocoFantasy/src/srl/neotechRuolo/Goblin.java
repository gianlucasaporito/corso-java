package srl.neotechRuolo;

public class Goblin extends Orco {

    protected Double molAttacco=1.3;

    @Override
    public void attacca(Ruolo nemico){
        Double attacco =getForzaAttacco()*molAttacco;
        System.out.println(attacco+"attacco del goblin");
        nemico.difendi(attacco);
    };

    @Override
    protected void difendi(Double attacco){
        Double difesa =getForzaDifesa()*molDifesa;
        System.out.println(difesa+"difesa del goblin");
        setStamina(getStamina()-(attacco));
        System.out.println("al goblin resta"+getStamina()+"di stamina");
        
    };
    
}

package srl.neotechRuolo;

public class NonMorto extends Ruolo {
    
    protected Double molDifesa=0.4;
   
    @Override
    public void attacca(Ruolo nemico){
        Double attacco =getForzaAttacco();
        System.out.println(getForzaAttacco()+"attacco del non morto ");
        nemico.difendi(attacco);
    };

    @Override
    protected void difendi(Double attacco){
        Double difesa =getForzaDifesa()*molDifesa;
        System.out.println(difesa+"difesa del non morto");   
        setStamina(getStamina()-(attacco));
        System.out.println("al non morto resta"+getStamina()+"di stamina");
};
}
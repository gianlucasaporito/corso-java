package srl.neotech.giocofantasy;

public class Guerriero extends Umano{

    protected Double molAttacco=1.8;

    @Override
    public void attacca(Ruolo nemico){
        Double attacco = getForzaAttacco()*molAttacco;
        System.out.println(attacco+"attacco del guerriero");
        nemico.difendi(attacco);
    };

    @Override
    protected void difendi(Double attacco){
        Double difesa =getForzaDifesa()*molDifesa;
        System.out.println(difesa+"difesa del guerriero");
        Double danno= difesa-attacco;
        setStamina(getStamina()-(danno));
        System.out.println("al guerriero resta"+getStamina()+"di stamina");

    };
}

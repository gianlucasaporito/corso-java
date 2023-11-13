package srl.neotech.giocofantasy;

public class Zombie extends NonMorto {
    
    protected Double molAttacco=1.5;

    @Override
    public void attacca(Ruolo nemico){
        Double attacco = getForzaAttacco()*molAttacco;
        System.out.println(attacco+"attacco dello zombie");
        nemico.difendi(attacco);
    };

    @Override
    protected void difendi(Double attacco){
        Double difesa =getForzaDifesa()*molDifesa;
        System.out.println(difesa+"difesa dello zombie");
        Double danno= difesa-attacco;
        setStamina(getStamina()-danno);
        System.out.println("allo zombie resta"+getStamina()+"di stamina");
        
    };
}

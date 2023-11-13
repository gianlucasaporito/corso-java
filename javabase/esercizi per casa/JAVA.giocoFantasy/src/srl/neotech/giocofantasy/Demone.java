package srl.neotech.giocofantasy;

public class Demone extends NonMorto {
    
    protected Double molAttacco=2.5;


    @Override
    public void attacca(Ruolo nemico){
        Double attacco = getForzaAttacco()*molAttacco;
        System.out.println(attacco+"attacco del demone");
        nemico.difendi(attacco);
    };

    @Override
    protected void difendi(Double attacco){
        Double difesa =getForzaDifesa()*molDifesa;
        System.out.println(difesa+"difesa del demone");
        Double danno= difesa-attacco;
        setStamina(getStamina()-danno);
        System.out.println("al demone resta"+getStamina()+"di stamina");
        
    };
}

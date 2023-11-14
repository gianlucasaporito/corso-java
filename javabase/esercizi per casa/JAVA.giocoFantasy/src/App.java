import srl.neotech.giocofantasy.Guerriero;
import srl.neotech.giocofantasy.Ruolo;
import srl.neotech.giocofantasy.Uruk;

public class App {
    
    public static void main(String[] args) throws Exception {
    
        Ruolo g=new Guerriero();
        g.setForzaAttacco(30.00);
        g.setForzaDifesa(60.00);
        g.setStamina(7000.00);

        Ruolo u=new Uruk();
        u.setForzaAttacco(25.00);
        u.setForzaDifesa(100.00);
        u.setStamina(4000.00);

        while(g.getStamina()>0 && u.getStamina()>0){
            g.attacca(u);
            u.attacca(g);
        };
        if(g.getStamina()<=0){
            System.out.println("il guerriero é morto");
        }
        else if (u.getStamina()<=0) {
            System.out.println("l'uruk è morto");
        };
        
    };

}

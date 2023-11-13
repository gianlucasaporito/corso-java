import srl.neotechRuolo.Guerriero;
import srl.neotechRuolo.Uruk;

public class App {
    public static void main(String[] args) throws Exception {
    
        Guerriero g=new Guerriero();
        g.setForzaAttacco(30.00);
        g.setForzaDifesa(60.00);
        g.setStamina(100.00);

        Uruk u=new Uruk();
        u.setForzaAttacco(25.00);
        u.setForzaDifesa(100.00);
        u.setStamina(150.00);

        
    }
}

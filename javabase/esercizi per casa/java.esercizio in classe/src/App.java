import srl.neotech.citta.Citta;
import srl.neotech.citta.Squadra;
import srl.neotech.citta.Stadio;

public class App {
    public static void main(String[] args) throws Exception {

        Stadio  olimpico =new Stadio();
        Squadra atalanta =new Squadra();
        Citta citta01 =new Citta();
        citta01.setNome("Bergamo");
        citta01.setPopolazione(300000);
        citta01.setSquadra(atalanta);
        citta01.getSquadra().setColoreMaglia("neroBlu");
        citta01.getSquadra().setNome("atalanta");
        citta01.getSquadra().setTifosi(30000);
        citta01.getSquadra().setStadio(olimpico);
        citta01.getSquadra().getStadio().setNomeStadio("olimpico");
        citta01.getSquadra().getStadio().setNumerPosti(50000);
        citta01.getSquadra().getStadio().setIndirizzo("via garibaldi");

        Citta citta02=new Citta();
        citta02.setSquadra(new Squadra());
        citta02.getSquadra().setStadio(new Stadio());

        
    }
}

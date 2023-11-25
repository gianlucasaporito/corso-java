import java.util.ArrayList;
import java.util.Random;

import srl.neotech.gestionezoo.Animali;
import srl.neotech.gestionezoo.Gabbia;
import srl.neotech.gestionezoo.Leoni;
import srl.neotech.gestionezoo.Zoo;

public class App {
    public static void main(String[] args) throws Exception {
       
        Random r=new Random();
       
        Zoo park =new Zoo();
        park.setNome("bioparco");
        ArrayList<Gabbia> tipiGabbie= new ArrayList<>();
        
        for(int i=0;i<7;i++){
        if (i==1) {
          Gabbia gLeoni =new Gabbia();
          ArrayList<Animali> listaLeoni =new ArrayList<>();
            gLeoni.setIsChiusa(r.nextBoolean());
            gLeoni.setIsPulita(r.nextBoolean());
            tipiGabbie.add(gLeoni);
            
        } else if (i==2) {
            Gabbia gTigri= new Gabbia();
            ArrayList<Animali> listaTigri =new ArrayList<>();
            gTigri.setIsChiusa(r.nextBoolean());
            gTigri.setIsPulita(r.nextBoolean());
            tipiGabbie.add(gTigri);
        }
        else if (i==3) {
        Gabbia gcoccodrilli = new Gabbia();
        ArrayList<Animali> listacoccodrilli =new ArrayList<>();
        gcoccodrilli.setIsChiusa(r.nextBoolean());
        gcoccodrilli.setIsPulita(r.nextBoolean());
        tipiGabbie.add(gcoccodrilli);
        }
        else if (i==4){
            Gabbia gSerpenti =new Gabbia();
        ArrayList<Animali> listaSerpenti=new ArrayList<>();
            gSerpenti.setIsChiusa(r.nextBoolean());
            gSerpenti.setIsPulita(r.nextBoolean());
            tipiGabbie.add(gSerpenti);
        }
        else if(i==5){
            Gabbia gMantidi = new Gabbia();
            ArrayList<Animali> listaMantidi =new ArrayList<>();
            gMantidi.setIsChiusa(r.nextBoolean());
            gMantidi.setIsPulita(r.nextBoolean());
            tipiGabbie.add(gMantidi);
        }
        else if(i==6){
            Gabbia gTarantole = new Gabbia();
            ArrayList<Animali> listaTigri =new ArrayList<>();
            gTarantole.setIsChiusa(r.nextBoolean());
            gTarantole.setIsPulita(r.nextBoolean());
            tipiGabbie.add(gTarantole);
        }
        else if(i==7){
            Gabbia gIppopotami = new Gabbia();
            ArrayList<Animali> listaTigri =new ArrayList<>();
            gIppopotami.setIsChiusa(r.nextBoolean());
            gIppopotami.setIsPulita(r.nextBoolean());
            tipiGabbie.add(gIppopotami);
        }

     }
     
      
        

    
    }
}

import java.util.ArrayList;
import java.util.StringTokenizer;

import srl.neotech.marsrover.Passo;
import srl.neotech.marsrover.Rover;

public class App {
    public static void main(String[] args) throws Exception {
        
        String passiPercorso= "A:1;S;A:7;D;A:3;S;A:1;D;A:1;S;A:1";

        StringTokenizer passiPercorsoToken = new StringTokenizer(passiPercorso,";");
        
        ArrayList<Passo> listaPassi= new ArrayList<>();
 
        Rover macchina1=new Rover();

        while (passiPercorsoToken.hasMoreTokens()) {
            String istruzioniPercorso= passiPercorsoToken.nextToken();
            if (istruzioniPercorso.startsWith("S")) {
                Passo ruotaSx = new  Passo();
                ruotaSx.setTipo("S");
                listaPassi.add(ruotaSx);
            }
            if (istruzioniPercorso.startsWith("D")) {
                Passo ruotaDx = new  Passo();
                ruotaDx.setTipo("D");
                listaPassi.add(ruotaDx);
            }
            if (istruzioniPercorso.startsWith("A")) {
                String[] valoriA= istruzioniPercorso.split(":");
                Passo avanza = new  Passo();
                avanza.setTipo("A");
                avanza.setNumeroStep(Integer.valueOf(valoriA[1]));
                listaPassi.add(avanza);
            }
            
           for (Passo passo : listaPassi) {
            if (passo.getTipo().equals("S")) {
                macchina1.ruotaSx();
                
            }
            if (passo.getTipo().equals("D")) {
                macchina1.ruotaDx();
            }
            if (passo.getTipo().equals("A")) {
                for(int i=0;i<passo.getNumeroStep();i++){
                    macchina1.avanza();
                }
                
            } 
           }
            System.out.println(macchina1);
        }
       
        
    }
}

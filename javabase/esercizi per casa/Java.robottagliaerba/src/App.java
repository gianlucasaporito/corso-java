import java.util.StringTokenizer;

import srl.neotech.robot.Robot;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        

        String percorsoRobot="A:100;S;A:100;D;A:100;S;A:100;D;A:100;S;A:100;D;A:100;S;A:100;D;A:100;S;A:100;D;A:100;";
        StringTokenizer percorsoRobotToken=new StringTokenizer(percorsoRobot, ";");


        while (percorsoRobotToken.hasMoreTokens()) {
            String istruzioniPercorso=percorsoRobotToken.nextToken();
            if (istruzioniPercorso.startsWith("S")) {
                Robot rotazioneSx= new Robot();
                rotazioneSx.setDirezzioneAttuale("direzione a sinistra");
                rotazioneSx.setAltezzaDellelame(4);
             System.out.println("il taglia erba cambia "+rotazioneSx.getDirezzioneAttuale()+" e l'altezza delle lame è impostata su "+rotazioneSx.getAltezzaDellelame()+"cm");
                
            }
            else if (istruzioniPercorso.startsWith("D")) {
                Robot rotazioneDx=new Robot();
                rotazioneDx.setDirezzioneAttuale("direzione a destra");
                rotazioneDx.setAltezzaDellelame(2);
              System.out.println("il taglia erba cambia "+rotazioneDx.getDirezzioneAttuale()+" e l'altezza delle lame è impostata su "+rotazioneDx.getAltezzaDellelame()+"cm");
            } 
            else if (istruzioniPercorso.startsWith("A")) {
                String[] movimento= istruzioniPercorso.split(":");
                Robot avanza = new Robot();
                avanza.setNumeroStep(Integer.valueOf(movimento[1]));
                for(int i=0;i<avanza.getNumeroStep();i++){
                    System.out.println("il taglia erba avanza di un passo");
                }
            }
            
        }
        
    }   
}

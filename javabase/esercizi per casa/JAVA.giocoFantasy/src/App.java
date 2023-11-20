import java.util.ArrayList;
import java.util.Random;

import srl.neotech.giocofantasy.Demone;
import srl.neotech.giocofantasy.Goblin;
import srl.neotech.giocofantasy.Guerriero;
import srl.neotech.giocofantasy.Mago;
import srl.neotech.giocofantasy.Ruolo;
import srl.neotech.giocofantasy.Uruk;
import srl.neotech.giocofantasy.Zombie;

public class App {
    
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        Random r= new Random();
       
         Integer tipoRuolo =r.nextInt(6-1+1)+1;
         Integer tipoRuolo2 = r.nextInt(6-1+1)+1;

        while (tipoRuolo==tipoRuolo2) {
           tipoRuolo2= r.nextInt(6 - 1 + 1)+1;
        };
        
        ArrayList<Ruolo>listaDinamicaArmata1=new ArrayList<>();
        for (int i=0;i<1000;i++){
        if(tipoRuolo==1){
            Ruolo armataMago =new Mago();
            armataMago.setForzaAttacco(r.nextDouble(250.00));
            armataMago.setForzaDifesa(r.nextDouble(30.00));
            armataMago.setStamina(r.nextDouble(150.00));
            listaDinamicaArmata1.add(armataMago);
        }
         else if (tipoRuolo==2){
            Ruolo armataGuerriero= new Guerriero();
            armataGuerriero.setForzaAttacco(r.nextDouble(180.00));
            armataGuerriero.setForzaDifesa(r.nextDouble(50.00));
            armataGuerriero.setStamina(r.nextDouble(200.00));
            listaDinamicaArmata1.add(armataGuerriero);
        }
        else if(tipoRuolo==3){
            Ruolo armataGoblin= new Goblin();
            armataGoblin.setForzaAttacco(r.nextDouble(160.00));
            armataGoblin.setForzaDifesa(r.nextDouble(25.00));
            armataGoblin.setStamina(r.nextDouble(180.00));
            listaDinamicaArmata1.add(armataGoblin);
        }
         else if (tipoRuolo==4) {
            Ruolo armataUruk=new Uruk();
            armataUruk.setForzaAttacco(r.nextDouble(120.00));
            armataUruk.setForzaDifesa(r.nextDouble(34.00));
            armataUruk.setStamina(r.nextDouble(300.00));
            listaDinamicaArmata1.add(armataUruk);
         }
          else if (tipoRuolo==5) {
            Ruolo armataZombie=new Zombie();
            armataZombie.setForzaAttacco(r.nextDouble(120.00));
            armataZombie.setForzaDifesa(r.nextDouble(34.00));
            armataZombie.setStamina(r.nextDouble(300.00));
            listaDinamicaArmata1.add(armataZombie);
         } 
         else if (tipoRuolo==6) {
            Ruolo armataDemone=new Demone();
            armataDemone.setForzaAttacco(r.nextDouble(120.00));
            armataDemone.setForzaDifesa(r.nextDouble(34.00));
            armataDemone.setStamina(r.nextDouble(300.00));
            listaDinamicaArmata1.add(armataDemone);
         }
        
    }  
          ArrayList<Ruolo>listaDinamicaArmata2=new ArrayList<>();
        for (int i=0;i<1000;i++){
        if(tipoRuolo2==1){
            Ruolo armataMago =new Mago();
            armataMago.setForzaAttacco(r.nextDouble(250.00));
            armataMago.setForzaDifesa(r.nextDouble(30.00));
            armataMago.setStamina(r.nextDouble(150.00));
            listaDinamicaArmata2.add(armataMago);
        }
         else if (tipoRuolo2==2){
            Ruolo armataGuerriero= new Guerriero();
            armataGuerriero.setForzaAttacco(r.nextDouble(180.00));
            armataGuerriero.setForzaDifesa(r.nextDouble(50.00));
            armataGuerriero.setStamina(r.nextDouble(200.00));
            listaDinamicaArmata2.add(armataGuerriero);
        }
        else if(tipoRuolo2==3){
            Ruolo armataGoblin= new Goblin();
            armataGoblin.setForzaAttacco(r.nextDouble(160.00));
            armataGoblin.setForzaDifesa(r.nextDouble(25.00));
            armataGoblin.setStamina(r.nextDouble(180.00));
            listaDinamicaArmata2.add(armataGoblin);
        }
         else if (tipoRuolo2==4) {
            Ruolo armataUruk=new Uruk();
            armataUruk.setForzaAttacco(r.nextDouble(120.00));
            armataUruk.setForzaDifesa(r.nextDouble(34.00));
            armataUruk.setStamina(r.nextDouble(300.00));
            listaDinamicaArmata2.add(armataUruk);
         }
          else if (tipoRuolo2==5) {
            Ruolo armataZombie=new Zombie();
            armataZombie.setForzaAttacco(r.nextDouble(120.00));
            armataZombie.setForzaDifesa(r.nextDouble(34.00));
            armataZombie.setStamina(r.nextDouble(300.00));
            listaDinamicaArmata2.add(armataZombie);
         } 
         else if (tipoRuolo2==6) {
            Ruolo armataDemone=new Demone();
            armataDemone.setForzaAttacco(r.nextDouble(120.00));
            armataDemone.setForzaDifesa(r.nextDouble(34.00));
            armataDemone.setStamina(r.nextDouble(300.00));
            listaDinamicaArmata2.add(armataDemone);
         }
    }
    
    for(int i=0;i<1000;i++){
        System.out.println("------Scontro numero "+i+"------");
        while (listaDinamicaArmata1.get(i).getStamina()>0 && listaDinamicaArmata2.get(i).getStamina()>0) {
         listaDinamicaArmata1.get(i).attacca(listaDinamicaArmata2.get(i));
         System.out.println("------------");
         listaDinamicaArmata2.get(i).attacca(listaDinamicaArmata1.get(i));
         System.out.println("------------");
        }
    }
    }

}

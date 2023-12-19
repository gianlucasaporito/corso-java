import java.util.Random;
import srl.neotech.aereoporto.Aereo;
import srl.neotech.aereoporto.Aereoporto;
import srl.neotech.aereoporto.Esesso;
import srl.neotech.aereoporto.EstatoAereo;
import srl.neotech.aereoporto.EstatoPassegero;
import srl.neotech.aereoporto.PasseggeroBusiness;
import srl.neotech.aereoporto.PasseggeroFamiliare;
import srl.neotech.aereoporto.PasseggeroTurista;

public class App {
    public static void main(String[] args) throws Exception {
        Random r=new Random();
        
       
        Aereoporto fiumicino=new Aereoporto();
        fiumicino.setCitta("Roma");
        fiumicino.setNome("fiumicino");
        fiumicino.setSpazioAereo(50);
        
            //---------AEREI IN PARTENZA---------
        for (int i=0;i<50;i++){
            Aereo aereoInPar = new Aereo();
            aereoInPar.setCapienzaPassegeri(r.nextInt(500));
            aereoInPar.setDistanzaAereoporto(0);
            aereoInPar.setVelocita(r.nextInt(5));
            aereoInPar.setCostruttore(null);
            aereoInPar.setModello(null);
            fiumicino.getAereiInPartenza().add(aereoInPar);
        }
           //--------PASSEGERI NELL'AEREOPORTO-----------
        for(int i=0;i<8000;i++){
            System.out.println("_______passeggero numero "+i+" _______");
            Integer tipoPassegero=r.nextInt(6-1+1)+1;
            if(tipoPassegero==1){
                PasseggeroTurista passegero1=new PasseggeroTurista();
                passegero1.setEta(r.nextInt(100-1+1)+1);
                passegero1.setSesso(Esesso.MASCHIO);
                passegero1.setStatopassegero(EstatoPassegero.DA_IMBARCARE);
                passegero1.setHasGiocattolo(false);
                passegero1.setHasGiornale(false);
                fiumicino.getPassegeriInpartenza().add(passegero1);
            } 
            else if(tipoPassegero==2){
                PasseggeroTurista passegero2=new PasseggeroTurista();
                passegero2.setEta(r.nextInt(100-1+1)+1);
                passegero2.setSesso(Esesso.FEMMINA);
                passegero2.setStatopassegero(EstatoPassegero.DA_IMBARCARE);
                passegero2.setHasGiocattolo(false);
                passegero2.setHasGiornale(false);
                fiumicino.getPassegeriInpartenza().add(passegero2);
            }
            else if(tipoPassegero==3){
                PasseggeroFamiliare passegero3=new PasseggeroFamiliare();
                passegero3.setEta(r.nextInt(100-1+1)+1);
                passegero3.setSesso(Esesso.FEMMINA);
                passegero3.setStatopassegero(EstatoPassegero.DA_IMBARCARE);
                passegero3.setHasGiocattolo(false);
                passegero3.setHasSnack(false);
                fiumicino.getPassegeriInpartenza().add(passegero3);
            }
            else if(tipoPassegero==4){
                PasseggeroFamiliare passegero4=new PasseggeroFamiliare();
                passegero4.setEta(r.nextInt(100-1+1)+1);
                passegero4.setSesso(Esesso.MASCHIO);
                passegero4.setStatopassegero(EstatoPassegero.DA_IMBARCARE);
                passegero4.setHasGiocattolo(false);
                passegero4.setHasSnack(false);
                fiumicino.getPassegeriInpartenza().add(passegero4);
            }
            else if(tipoPassegero==5){
                PasseggeroBusiness passegero5=new PasseggeroBusiness();
                passegero5.setEta(r.nextInt(100-1+1)+1);
                passegero5.setSesso(Esesso.MASCHIO);
                passegero5.setStatopassegero(EstatoPassegero.DA_IMBARCARE);
                passegero5.setHasGiocattolo(false);
                passegero5.setHasChampagne(false);
                fiumicino.getPassegeriInpartenza().add(passegero5);
            }
             else if(tipoPassegero==6){
                PasseggeroBusiness passegero6=new PasseggeroBusiness();
                passegero6.setEta(r.nextInt(100-1+1)+1);
                passegero6.setSesso(Esesso.FEMMINA);
                passegero6.setStatopassegero(EstatoPassegero.DA_IMBARCARE);
                passegero6.setHasGiocattolo(false);
                passegero6.setHasChampagne(false);
                fiumicino.getPassegeriInpartenza().add(passegero6);
            }
        }
                 //---------AEREI IN ARRIVO---------
            for(int k=0;k<200;k++){
                Aereo aereoInArr =new Aereo();
                aereoInArr.setCostruttore(null);
                aereoInArr.setModello(null);
                aereoInArr.setVelocita(r.nextInt(5));
                aereoInArr.setStatoAereo(EstatoAereo.IN_ARRIVO);
                aereoInArr.setCapienzaPassegeri(r.nextInt(500));

                    //----------PASSEGERI AEREO IN ARRIVO --------
                for (int j=0;j<aereoInArr.getCapienzaPassegeri();j++){
                    Integer randomPasseggero=r.nextInt(6-1+1)+1;
                    if(randomPasseggero==1){
                PasseggeroTurista passegero1=new PasseggeroTurista();
                passegero1.setEta(r.nextInt(100-1+1)+1);
                passegero1.setSesso(Esesso.MASCHIO);
                passegero1.setStatopassegero(EstatoPassegero.DA_IMBARCARE);
                passegero1.setHasGiocattolo(false);
                passegero1.setHasGiornale(false);
                aereoInArr.getPassegeriABordo().add(passegero1);
            } 
            else if(randomPasseggero==2){
                PasseggeroTurista passegero2=new PasseggeroTurista();
                passegero2.setEta(r.nextInt(100-1+1)+1);
                passegero2.setSesso(Esesso.FEMMINA);
                passegero2.setStatopassegero(EstatoPassegero.DA_IMBARCARE);
                passegero2.setHasGiocattolo(false);
                passegero2.setHasGiornale(false);
                aereoInArr.getPassegeriABordo().add(passegero2);
            }
            else if(randomPasseggero==3){
                PasseggeroFamiliare passegero3=new PasseggeroFamiliare();
                passegero3.setEta(r.nextInt(100-1+1)+1);
                passegero3.setSesso(Esesso.FEMMINA);
                passegero3.setStatopassegero(EstatoPassegero.DA_IMBARCARE);
                passegero3.setHasGiocattolo(false);
                passegero3.setHasSnack(false);
                 aereoInArr.getPassegeriABordo().add(passegero3);
            }
            else if(randomPasseggero==4){
                PasseggeroFamiliare passegero4=new PasseggeroFamiliare();
                passegero4.setEta(r.nextInt(100-1+1)+1);
                passegero4.setSesso(Esesso.MASCHIO);
                passegero4.setStatopassegero(EstatoPassegero.DA_IMBARCARE);
                passegero4.setHasGiocattolo(false);
                passegero4.setHasSnack(false);
                 aereoInArr.getPassegeriABordo().add(passegero4);
            }
            else if(randomPasseggero==5){
                PasseggeroBusiness passegero5=new PasseggeroBusiness();
                passegero5.setEta(r.nextInt(100-1+1)+1);
                passegero5.setSesso(Esesso.MASCHIO);
                passegero5.setStatopassegero(EstatoPassegero.DA_IMBARCARE);
                passegero5.setHasGiocattolo(false);
                passegero5.setHasChampagne(false);
                 aereoInArr.getPassegeriABordo().add(passegero5);
            }
             else if(randomPasseggero==6){
                PasseggeroBusiness passegero6=new PasseggeroBusiness();
                passegero6.setEta(r.nextInt(100-1+1)+1);
                passegero6.setSesso(Esesso.FEMMINA);
                passegero6.setStatopassegero(EstatoPassegero.DA_IMBARCARE);
                passegero6.setHasGiocattolo(false);
                passegero6.setHasChampagne(false);
                 aereoInArr.getPassegeriABordo().add(passegero6);
            }
            fiumicino.getAereiInArrivo().add(aereoInArr);
                }
            }
        
                
    }
}

public class App {
    public static void main(String[] args) throws Exception {   ;
     Automobile auto= new Automobile();
      auto.marca="Fiat";
      auto.modello="Topolino";
      auto.colore="nero";
      auto.cilindrata=369;
        
    Automobile auto2= new Automobile();
      auto2.marca="Dacia";
      auto2.modello="Duster";
      auto2.colore="biando";
      auto2.cilindrata=1400;

      
       System.out.println(auto2);
       System.out.println(auto);
    }
}

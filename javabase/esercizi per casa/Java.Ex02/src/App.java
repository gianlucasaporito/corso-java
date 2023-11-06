public class App {
    public static void main(String[] args) throws Exception {
       
       Libro signoreDegliAnelli = new Libro();
       signoreDegliAnelli.titolo="signoreDegliAnelli";
       signoreDegliAnelli.genere="fantasy";
       signoreDegliAnelli.pagine=1380;

       Libro guerraePace= new Libro();
       guerraePace.titolo="guerraePace";
       guerraePace.genere="romanzoStorico";
       guerraePace.pagine=1415;

       Libro laCoscienzaDiZeno= new Libro();
       laCoscienzaDiZeno.titolo="laCoscienzaDiZeno";
       laCoscienzaDiZeno.genere="romanzo";
       laCoscienzaDiZeno.pagine=345;


        System.out.println(signoreDegliAnelli);
        System.out.println(guerraePace);
        System.out.println(laCoscienzaDiZeno);
    }
}

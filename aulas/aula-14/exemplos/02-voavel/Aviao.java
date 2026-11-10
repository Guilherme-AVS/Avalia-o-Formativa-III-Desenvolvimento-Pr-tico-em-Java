public class Aviao implements Voavel {
 private double altitude;
 @Override public void decolar(){ altitude=1000; System.out.println("Avião decolando."); }
 @Override public void pousar(){ altitude=0; System.out.println("Avião pousando."); }
 @Override public double getAltitude(){ return altitude; }
}

public class Circulo extends Forma { private double raio; public Circulo(String c,double r){super(c);raio=r;} @Override public double calcularArea(){return Math.PI*raio*raio;} }

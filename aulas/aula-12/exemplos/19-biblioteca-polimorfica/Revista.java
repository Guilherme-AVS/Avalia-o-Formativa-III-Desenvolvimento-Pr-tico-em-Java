public class Revista extends ItemBiblioteca { public Revista(String titulo){super(titulo);} @Override public double calcularMulta(int diasAtraso){return diasAtraso*1.5;} }

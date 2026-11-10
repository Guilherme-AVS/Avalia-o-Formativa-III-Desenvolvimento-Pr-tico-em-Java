public class Pix extends FormaPagamento {public Pix(String n,double v){super(n,v);}public double calcularTaxa(){return valor*1.05;}}

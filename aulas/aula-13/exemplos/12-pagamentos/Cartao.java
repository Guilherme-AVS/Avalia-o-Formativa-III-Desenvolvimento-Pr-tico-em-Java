public class Cartao extends FormaPagamento {public Cartao(String n,double v){super(n,v);}public double calcularTaxa(){return valor*1.20;}}

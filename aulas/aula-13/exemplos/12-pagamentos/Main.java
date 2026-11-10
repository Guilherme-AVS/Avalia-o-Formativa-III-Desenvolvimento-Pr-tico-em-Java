public class Main {public static void main(String[] args){FormaPagamento[] xs={new Pix("A",100),new Cartao("B",200)};for(FormaPagamento x:xs)x.exibir();}}

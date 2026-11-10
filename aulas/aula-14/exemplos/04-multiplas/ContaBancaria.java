public class ContaBancaria implements Autenticavel, Pagavel, Tributavel {
 private final String titular; private final String senha; private double saldo;
 public ContaBancaria(String titular,double saldo,String senha){this.titular=titular;this.saldo=saldo;this.senha=senha;}
 @Override public boolean autenticar(String s){return senha.equals(s);}
 @Override public double calcularValor(){return saldo;}
 @Override public double calcularImposto(){return saldo*0.005;}
 @Override public String gerarRecibo(){return "Conta de "+titular+": R$ "+saldo;}
}

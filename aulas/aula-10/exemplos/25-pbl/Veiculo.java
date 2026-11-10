import java.time.LocalDate;
public class Veiculo {
    private String placa,modelo,marca; private int anoFabricacao; private double precoDiaria; private boolean disponivel=true;
    public Veiculo(String placa,String modelo,String marca,int ano,double preco){setPlaca(placa);setModelo(modelo);setMarca(marca);setAnoFabricacao(ano);setPrecoDiaria(preco);}
    public String getPlaca(){return placa;} public void setPlaca(String p){if(p!=null&&(p.length()==7||p.length()==8))placa=p.toUpperCase();}
    public String getModelo(){return modelo;} public void setModelo(String m){if(m!=null&&!m.isBlank())modelo=m.trim();}
    public String getMarca(){return marca;} public void setMarca(String m){if(m!=null&&!m.isBlank())marca=m.trim();}
    public int getAnoFabricacao(){return anoFabricacao;} public void setAnoFabricacao(int a){int atual=LocalDate.now().getYear();if(a>=1950&&a<=atual)anoFabricacao=a;}
    public double getPrecoDiaria(){return precoDiaria;} public void setPrecoDiaria(double p){if(p>0)precoDiaria=p;}
    public boolean isDisponivel(){return disponivel;} public void setDisponivel(boolean d){disponivel=d;}
    public static void main(String[] args){System.out.println(new Veiculo("ABC1D23","Onix","Chevrolet",2023,150).getPlaca());}
}

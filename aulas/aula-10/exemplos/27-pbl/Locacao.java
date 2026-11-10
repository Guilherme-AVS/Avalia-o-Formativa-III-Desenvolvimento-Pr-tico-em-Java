import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Locacao {
    private final Veiculo veiculo; private final Cliente cliente; private final LocalDate dataInicio; private LocalDate dataFim;
    public Locacao(Veiculo v,Cliente c,LocalDate i,LocalDate f){if(v==null||c==null||i==null)throw new IllegalArgumentException("Dados obrigatórios");veiculo=v;cliente=c;dataInicio=i;setDataFim(f);}
    public Veiculo getVeiculo(){return veiculo;} public Cliente getCliente(){return cliente;} public LocalDate getDataInicio(){return dataInicio;} public LocalDate getDataFim(){return dataFim;}
    public void setDataFim(LocalDate f){if(f!=null&&f.isAfter(dataInicio))dataFim=f;else throw new IllegalArgumentException("Fim deve ser posterior ao início");}
    public double getValorTotal(){return ChronoUnit.DAYS.between(dataInicio,dataFim)*veiculo.getPrecoDiaria();}
    public static void main(String[] args){Veiculo v=new Veiculo("ABC1D23","Onix","GM",2023,100);Cliente c=new Cliente("1","Ana","a@b.com","81","AB");Locacao l=new Locacao(v,c,LocalDate.now(),LocalDate.now().plusDays(3));System.out.println(l.getValorTotal());}
}

class Veiculo {
    private final String placa; private final double precoDiaria;
    Veiculo(String placa,String modelo,String marca,int ano,double preco){this.placa=placa;this.precoDiaria=preco;}
    public double getPrecoDiaria(){return precoDiaria;}
}

class Cliente {
    private final String cpf;
    Cliente(String cpf,String nome,String email,String telefone,String habilitacao){this.cpf=cpf;}
}

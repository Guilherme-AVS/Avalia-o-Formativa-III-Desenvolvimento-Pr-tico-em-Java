import java.time.LocalDate;
public class Emprestimo {
    private final Livro livro; private final Leitor leitor; private final LocalDate dataEmprestimo; private LocalDate dataDevolucao;
    public Emprestimo(Livro l,Leitor r,LocalDate de,LocalDate dv){if(l==null||r==null||de==null)throw new IllegalArgumentException("Dados obrigatórios");if(dv==null||dv.isBefore(de))throw new IllegalArgumentException("Data inválida");livro=l;leitor=r;dataEmprestimo=de;dataDevolucao=dv;}
    public Livro getLivro(){return livro;} public Leitor getLeitor(){return leitor;} public LocalDate getDataEmprestimo(){return dataEmprestimo;} public LocalDate getDataDevolucao(){return dataDevolucao;}
    public boolean estaAtrasado(){return dataDevolucao.isBefore(LocalDate.now());}
    public static void main(String[] args){Livro l=new Livro("1","Java","A",2024);Leitor r=new Leitor("Ana","12345678901","a@b.com");Emprestimo e=new Emprestimo(l,r,LocalDate.now().minusDays(10),LocalDate.now().minusDays(2));System.out.println(e.estaAtrasado());}
}
class Livro {Livro(String i,String t,String a,int y){}}
class Leitor {Leitor(String n,String c,String e){}}

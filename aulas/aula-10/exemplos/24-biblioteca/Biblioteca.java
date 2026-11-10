import java.util.*;
public class Biblioteca {
    private final String nome; private final List<String> acervo=new ArrayList<>();
    public Biblioteca(String nome){if(nome==null||nome.isBlank())throw new IllegalArgumentException("Nome inválido");this.nome=nome.trim();}
    public String getNome(){return nome;} public List<String> getAcervo(){return new ArrayList<>(acervo);}
    public void adicionarLivro(String livro){if(livro!=null&&!livro.isBlank())acervo.add(livro.trim());}
    public static void main(String[] args){Biblioteca b=new Biblioteca("UNICAP");b.adicionarLivro("Java");List<String> copia=b.getAcervo();copia.clear();System.out.println(b.getAcervo());}
}

import java.time.LocalDate;
public class Livro {
    private final String isbn; private String titulo; private String autor; private int anoPublicacao;
    public Livro(String isbn,String titulo,String autor,int ano){this.isbn=isbn;setTitulo(titulo);setAutor(autor);setAnoPublicacao(ano);}
    public String getIsbn(){return isbn;} public String getTitulo(){return titulo;} public String getAutor(){return autor;} public int getAnoPublicacao(){return anoPublicacao;}
    public void setTitulo(String t){if(t!=null&&!t.isBlank())titulo=t.trim();}
    public void setAutor(String a){if(a!=null&&!a.isBlank())autor=a.trim();}
    public void setAnoPublicacao(int a){int atual=LocalDate.now().getYear();if(a>=1450&&a<=atual)anoPublicacao=a;}
    public String toString(){return titulo+" — "+autor+" ("+anoPublicacao+")";}
    public static void main(String[] args){System.out.println(new Livro("ISBN-1","Java Moderno","Autora",2024));}
}

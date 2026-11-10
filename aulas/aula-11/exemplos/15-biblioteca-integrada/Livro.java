public class Livro extends ItemBiblioteca {
    private final String autor; private final int paginas;
    public Livro(String titulo,String codigo,int ano,String autor,int paginas){super(titulo,codigo,ano);this.autor=autor;this.paginas=paginas;}
    @Override public String toString(){return "Livro{"+super.toString()+", autor='"+autor+"', paginas="+paginas+"}";}
}

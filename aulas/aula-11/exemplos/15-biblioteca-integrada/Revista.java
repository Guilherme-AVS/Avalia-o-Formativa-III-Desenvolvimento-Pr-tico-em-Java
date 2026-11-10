public class Revista extends ItemBiblioteca {
    private final int edicao; private final String periodicidade;
    public Revista(String titulo,String codigo,int ano,int edicao,String periodicidade){super(titulo,codigo,ano);this.edicao=edicao;this.periodicidade=periodicidade;}
    @Override public String toString(){return "Revista{"+super.toString()+", edicao="+edicao+", periodicidade='"+periodicidade+"'}";}
}

public class MidiaDigital extends ItemBiblioteca {
    private final String formato; private final double tamanhoMb;
    public MidiaDigital(String titulo,String codigo,int ano,String formato,double tamanhoMb){super(titulo,codigo,ano);this.formato=formato;this.tamanhoMb=tamanhoMb;}
    @Override public String toString(){return "MidiaDigital{"+super.toString()+", formato='"+formato+"', tamanhoMb="+tamanhoMb+"}";}
}

public class ModificadoresDemo {
    private int interno=1;
    int pacote=2;
    protected int heranca=3;
    public int publico=4;
    private void metodoInterno(){}
    void metodoPacote(){}
    protected void metodoHeranca(){}
    public void metodoPublico(){}
    public static void main(String[] args){ModificadoresDemo d=new ModificadoresDemo();System.out.println(d.interno+d.pacote+d.heranca+d.publico);}
}

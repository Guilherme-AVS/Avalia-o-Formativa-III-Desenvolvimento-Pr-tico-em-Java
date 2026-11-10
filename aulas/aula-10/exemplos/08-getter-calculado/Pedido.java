import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<Double> valores = new ArrayList<>();
    public void adicionar(double valor){ if(valor>0) valores.add(valor); }
    public double getValorTotal(){ double total=0; for(double v: valores) total+=v; return total; }
    public static void main(String[] args){ Pedido p=new Pedido(); p.adicionar(10); p.adicionar(25.5); System.out.println(p.getValorTotal()); }
}

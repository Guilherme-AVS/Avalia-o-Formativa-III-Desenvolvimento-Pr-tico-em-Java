import java.util.ArrayList;

public class Pedido {
    private final String codigo;
    private final ArrayList<Item> itens = new ArrayList<>();

    public Pedido(String codigo) { this.codigo = codigo; }
    public void adicionar(Item item) { itens.add(item); }
    public double total() {
        double total = 0;
        for (Item item : itens) total += item.subtotal();
        return total;
    }
    public String getCodigo() { return codigo; }
}

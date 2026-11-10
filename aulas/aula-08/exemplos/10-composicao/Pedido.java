import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String numero;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(String numero) {
        this.numero = numero;
    }

    public void adicionarItem(String produto, int quantidade, double preco) {
        itens.add(new ItemPedido(produto, quantidade, preco));
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    private static class ItemPedido {
        private String produto;
        private int quantidade;
        private double preco;

        private ItemPedido(String produto, int quantidade, double preco) {
            this.produto = produto;
            this.quantidade = quantidade;
            this.preco = preco;
        }

        private double calcularSubtotal() {
            return quantidade * preco;
        }
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido("P001");
        pedido.adicionarItem("Mouse", 2, 80.0);
        pedido.adicionarItem("Teclado", 1, 150.0);

        System.out.println("Pedido " + pedido.numero);
        System.out.println("Total: R$ " + pedido.calcularTotal());
    }
}

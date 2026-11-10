public class Main {
    public static void main(String[] args) {
        Pedido p = new Pedido("PED-013");
        p.adicionar(new Item("Fone", 120, 2));
        p.adicionar(new Item("Cabo", 30, 1));
        System.out.println(p.getCodigo());
        System.out.println(p.total());
    }
}

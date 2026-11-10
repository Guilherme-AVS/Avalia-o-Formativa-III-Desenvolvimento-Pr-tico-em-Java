public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto("Fone BT", 299.90, 15);
        System.out.println(p1.resumo());
        System.out.println(p2.resumo());
    }
}

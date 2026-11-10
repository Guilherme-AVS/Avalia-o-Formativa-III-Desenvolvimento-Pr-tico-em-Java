public class Main {
    public static void main(String[] args) {
        Carro c = new Carro("Toyota", 2025, 4);
        c.exibirInfo();
        System.out.println("Portas: " + c.getNumPortas());
    }
}

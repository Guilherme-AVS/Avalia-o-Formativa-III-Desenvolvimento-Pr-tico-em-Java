public class Main {
    public static void main(String[] args) {
        Smartwatch sw = new Smartwatch("Galaxy Watch", 80);
        sw.conectar();
        sw.monitorar();
        System.out.println(sw.status());
    }
}

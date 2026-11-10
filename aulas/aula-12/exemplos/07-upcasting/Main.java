public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Animal animal = cachorro;
        animal.emitirSom();
        cachorro.buscarBola();
    }
}

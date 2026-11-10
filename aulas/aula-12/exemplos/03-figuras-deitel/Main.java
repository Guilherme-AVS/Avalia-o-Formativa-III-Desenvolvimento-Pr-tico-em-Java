public class Main {
    public static void main(String[] args) {
        Figura[] figuras = { new Circulo(), new Triangulo(), new Retangulo() };
        for (Figura f : figuras) f.desenhar();
    }
}

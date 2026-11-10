public class Main {
    public static void main(String[] args) {
        Instrumento[] banda = { new Violao(), new Flauta(), new Violao() };
        for (Instrumento i : banda) {
            i.tocar();
            if (i instanceof Violao v) v.afinar();
        }
    }
}

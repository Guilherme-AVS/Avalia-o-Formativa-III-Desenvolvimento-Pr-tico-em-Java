public class Normalizador {
    public static String normalizarNome(String nome) {
        return nome.trim().toLowerCase();
    }

    public static void main(String[] args) {
        String nome = "  Maria Silva  ";

        String resultado = normalizarNome(nome);

        System.out.println("Original: [" + nome + "]");
        System.out.println("Normalizado: [" + resultado + "]");
    }
}

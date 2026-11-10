public class ContarEspacos {
    public static int contarEspacos(String texto) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        String frase = "Java é uma linguagem poderosa";

        System.out.println("Espaços: " + contarEspacos(frase));
    }
}

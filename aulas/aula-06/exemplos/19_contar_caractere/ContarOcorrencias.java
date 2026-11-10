public class ContarOcorrencias {
    public static int contar(String texto, char procurado) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == procurado) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        System.out.println(contar("banana", 'a'));
        System.out.println(contar("Programação", 'a'));
    }
}

public class DesafioEncontreOsErros {
    public static void main(String[] args) {
        // Versao corrigida do desafio da aula.

        int numero = 42;

        double resultado = 10.0 / 3;
        System.out.println("Resultado preciso: " + resultado);

        boolean teste = 5 + 10 > 0;

        int contador = 1;
        if (contador == 1) {
            System.out.println("Contador e 1");
        }

        String a = "abc";
        String b = "abc";

        if (a.equals(b)) {
            System.out.println("Strings iguais");
        }

        System.out.println("numero = " + numero);
        System.out.println("teste = " + teste);
    }
}

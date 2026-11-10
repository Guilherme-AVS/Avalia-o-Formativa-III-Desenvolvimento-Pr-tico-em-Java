public class ExemplosTernario {
    public static void main(String[] args) {
        int numero = 7;
        int a = 10;
        int b = 15;
        int idade = 20;

        String tipo = (numero % 2 == 0) ? "Par" : "Ímpar";
        int maior = (a > b) ? a : b;
        String status = (idade >= 18) ? "Maior" : "Menor";

        System.out.println("Tipo: " + tipo);
        System.out.println("Maior: " + maior);
        System.out.println("Status: " + status);
    }
}

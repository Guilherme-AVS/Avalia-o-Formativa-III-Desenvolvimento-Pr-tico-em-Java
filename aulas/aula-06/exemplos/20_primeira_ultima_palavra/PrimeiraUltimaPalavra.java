public class PrimeiraUltimaPalavra {
    public static String primeiraPalavra(String frase) {
        frase = frase.trim();
        int espaco = frase.indexOf(" ");

        if (espaco == -1) {
            return frase;
        }

        return frase.substring(0, espaco);
    }

    public static String ultimaPalavra(String frase) {
        frase = frase.trim();
        int espaco = frase.lastIndexOf(" ");

        if (espaco == -1) {
            return frase;
        }

        return frase.substring(espaco + 1);
    }

    public static void main(String[] args) {
        String frase = "Programação Orientada a Objetos";

        System.out.println("Primeira: " + primeiraPalavra(frase));
        System.out.println("Última: " + ultimaPalavra(frase));
    }
}

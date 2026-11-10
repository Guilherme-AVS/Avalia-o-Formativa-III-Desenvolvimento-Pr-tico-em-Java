public class Classificador {
    public static String classificar(int dias) {
        if (dias > 7) return "OK";
        else if (dias > 0) return "Expirando";
        else return "Expirado";
    }
}

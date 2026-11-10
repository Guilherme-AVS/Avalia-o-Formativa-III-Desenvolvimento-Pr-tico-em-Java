public class AnaliseString {
    public static String resumo(String pedido) {
        String codigo = pedido.substring(0, 3);
        return codigo + "-" + pedido.length();
    }
}

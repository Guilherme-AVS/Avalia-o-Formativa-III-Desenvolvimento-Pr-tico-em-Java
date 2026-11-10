public class Relogio {
    private int hora;
    private int minuto;

    public void ajustar(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public String formatar() {
        return String.format("%02d:%02d", hora, minuto);
    }

    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        relogio.ajustar(9, 30);
        System.out.println(relogio.formatar());
    }
}

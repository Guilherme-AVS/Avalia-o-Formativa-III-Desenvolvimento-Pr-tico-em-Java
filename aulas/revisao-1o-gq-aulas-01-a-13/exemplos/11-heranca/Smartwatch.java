public class Smartwatch extends Dispositivo {
    private int bateria;

    public Smartwatch(String modelo, int bateria) {
        super(modelo);
        this.bateria = bateria;
    }

    public void monitorar() {
        System.out.println(modelo + " | bateria " + bateria + "%");
    }
}

public class CarroConstrutores {
    private String modelo;

    public CarroConstrutores() {
        this("Sem modelo");
    }

    public CarroConstrutores(String modelo) {
        this.modelo = modelo;
    }

    public void exibir() {
        System.out.println("Modelo: " + modelo);
    }

    public static void main(String[] args) {
        new CarroConstrutores().exibir();
        new CarroConstrutores("Civic").exibir();
    }
}

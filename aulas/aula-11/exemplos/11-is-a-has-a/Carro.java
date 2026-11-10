public class Carro extends Veiculo {
    private final Motor motor;
    public Carro() { this.motor = new Motor(); }
    public void iniciar() { motor.ligar(); mover(); }
}

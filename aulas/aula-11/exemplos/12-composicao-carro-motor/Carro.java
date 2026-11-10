public class Carro {
    private final Motor motor;
    public Carro() { motor = new Motor(); }
    public void iniciar() { System.out.println("Carro iniciando..."); motor.ligar(); }
}

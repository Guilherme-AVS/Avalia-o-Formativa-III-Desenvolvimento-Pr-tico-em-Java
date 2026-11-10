public class Dispositivo {
    protected String modelo;
    protected boolean conectado;

    public Dispositivo(String modelo) {
        this.modelo = modelo;
        this.conectado = false;
    }

    public void conectar() { conectado = true; }
    public String status() { return conectado ? "online" : "offline"; }
}

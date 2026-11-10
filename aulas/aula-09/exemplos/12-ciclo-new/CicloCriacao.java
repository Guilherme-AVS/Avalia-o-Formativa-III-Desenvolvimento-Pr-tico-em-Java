public class CicloCriacao {
    private String estado;

    public CicloCriacao(String estado) {
        System.out.println("Construtor executado");
        this.estado = estado;
    }

    public void exibir() {
        System.out.println("Objeto pronto: " + estado);
    }

    public static void main(String[] args) {
        CicloCriacao objeto = new CicloCriacao("válido");
        objeto.exibir();
    }
}

public class Cpf {
    private final String numero;

    public Cpf(String numero) {
        if (numero == null || !numero.matches("\\d{11}")) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public static void main(String[] args) {
        System.out.println(new Cpf("12345678901").getNumero());
    }
}

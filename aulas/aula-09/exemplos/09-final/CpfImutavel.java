public class CpfImutavel {
    private final String numero;

    public CpfImutavel(String numero) {
        if (numero == null || !numero.matches("\\d{11}")) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public static void main(String[] args) {
        CpfImutavel cpf = new CpfImutavel("12345678901");
        System.out.println(cpf.getNumero());
    }
}

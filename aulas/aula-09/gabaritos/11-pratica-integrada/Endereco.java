public record Endereco(String rua, String cidade, String cep) {
    public Endereco {
        if (cep == null || cep.isBlank()) {
            throw new IllegalArgumentException("CEP obrigatório");
        }
        if (rua == null || rua.isBlank()) {
            throw new IllegalArgumentException("Rua obrigatória");
        }
        if (cidade == null || cidade.isBlank()) {
            throw new IllegalArgumentException("Cidade obrigatória");
        }
    }
}

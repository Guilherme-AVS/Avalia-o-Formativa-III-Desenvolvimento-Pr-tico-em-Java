public class TiposNaoPrimitivos {
    public static void main(String[] args) {
        String nome = "Maria";
        int[] numeros = {1, 2, 3, 4, 5};

        Pessoa pessoa = new Pessoa("Joao");

        System.out.println("Nome: " + nome);
        System.out.println("Primeiro numero: " + numeros[0]);
        System.out.println("Pessoa: " + pessoa.getNome());
    }
}

class Pessoa {
    private final String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return nome;
    }
}

public class Veiculo {
    private String marca;
    private int ano;

    public Veiculo(String marca) {
        this.marca = marca;
        this.ano = 0;
    }

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public static void main(String[] args) {
        System.out.println(new Veiculo("Toyota", 2026).marca);
    }
}

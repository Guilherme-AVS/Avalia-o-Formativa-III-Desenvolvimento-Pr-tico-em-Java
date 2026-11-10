public class ContadorObjetos {
    private static int total;
    private String nome;

    public ContadorObjetos(String nome) {
        this.nome = nome;
        total++;
    }

    public static int getTotal() {
        return total;
    }

    public static void main(String[] args) {
        new ContadorObjetos("A");
        new ContadorObjetos("B");
        new ContadorObjetos("C");
        System.out.println("Objetos criados: " + ContadorObjetos.getTotal());
    }
}

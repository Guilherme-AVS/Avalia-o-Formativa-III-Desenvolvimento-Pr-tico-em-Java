public class PontoRecord {
    public record Ponto(int x, int y) {
        public Ponto {
            if (x < 0 || y < 0) {
                throw new IllegalArgumentException("Coordenadas devem ser não negativas");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Ponto(3, 7));
    }
}

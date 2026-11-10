public class Main {
    public static void main(String[] args) {
        Playlist p = new Playlist();
        p.adicionar("Notebook Beats");
        p.adicionar("Code Flow");
        p.adicionar("Debug Mode");
        p.remover("Code Flow");
        System.out.println(p.tamanho());
        System.out.println(p.primeira());
    }
}

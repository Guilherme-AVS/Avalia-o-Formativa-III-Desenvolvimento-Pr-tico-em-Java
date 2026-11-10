import java.util.ArrayList;

public class Playlist {
    private final ArrayList<String> musicas = new ArrayList<>();

    public void adicionar(String musica) { musicas.add(musica); }
    public void remover(String musica) { musicas.remove(musica); }
    public int tamanho() { return musicas.size(); }
    public String primeira() { return musicas.get(0); }
}

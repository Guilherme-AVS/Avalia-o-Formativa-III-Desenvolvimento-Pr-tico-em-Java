import java.util.ArrayList;
import java.util.List;

public class StreamingGabarito {
    static class Musica {
        private String titulo;
        private int duracao;

        Musica(String titulo, int duracao) {
            this.titulo = titulo;
            this.duracao = duracao;
        }

        public int getDuracao() {
            return duracao;
        }
    }

    static class Playlist {
        private String nome;
        private Usuario dono;
        private List<Musica> musicas = new ArrayList<>();

        Playlist(String nome, Usuario dono) {
            this.nome = nome;
            this.dono = dono;
        }

        public void adicionarMusica(Musica musica) {
            musicas.add(musica);
        }

        public int duracaoTotal() {
            int total = 0;
            for (Musica musica : musicas) total += musica.getDuracao();
            return total;
        }
    }

    static class Usuario {
        private String nome;
        private List<Playlist> playlists = new ArrayList<>();

        Usuario(String nome) {
            this.nome = nome;
        }

        public Playlist criarPlaylist(String nome) {
            Playlist playlist = new Playlist(nome, this);
            playlists.add(playlist);
            return playlist;
        }
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana");
        Playlist playlist = usuario.criarPlaylist("Foco");

        playlist.adicionarMusica(new Musica("A", 180));
        playlist.adicionarMusica(new Musica("B", 210));

        System.out.println("Duração: " + playlist.duracaoTotal() + " s");
    }
}

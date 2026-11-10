import java.util.ArrayList;
import java.util.List;

public class StreamingModelo {
    static class Musica {
        private String titulo;
        private String artista;
        private int duracaoSegundos;

        Musica(String titulo, String artista, int duracaoSegundos) {
            this.titulo = titulo;
            this.artista = artista;
            this.duracaoSegundos = duracaoSegundos;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getArtista() {
            return artista;
        }

        public int getDuracaoSegundos() {
            return duracaoSegundos;
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

        public int getDuracaoTotal() {
            int total = 0;
            for (Musica musica : musicas) {
                total += musica.getDuracaoSegundos();
            }
            return total;
        }

        public String getNome() {
            return nome;
        }

        public Usuario getDono() {
            return dono;
        }

        public List<Musica> getMusicas() {
            return musicas;
        }
    }

    static class Usuario {
        private String id;
        private String nome;
        private List<Playlist> playlists = new ArrayList<>();

        Usuario(String id, String nome) {
            this.id = id;
            this.nome = nome;
        }

        public Playlist criarPlaylist(String nome) {
            Playlist playlist = new Playlist(nome, this);
            playlists.add(playlist);
            return playlist;
        }

        public String getNome() {
            return nome;
        }

        public List<Playlist> getPlaylists() {
            return playlists;
        }
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("U01", "Ana");
        Playlist playlist = usuario.criarPlaylist("Foco");

        Musica m1 = new Musica("Song A", "Artist A", 180);
        Musica m2 = new Musica("Song B", "Artist B", 210);

        playlist.adicionarMusica(m1);
        playlist.adicionarMusica(m2);

        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Playlist: " + playlist.getNome());
        System.out.println("Músicas: " + playlist.getMusicas().size());
        System.out.println("Duração: " + playlist.getDuracaoTotal() + " s");
    }
}

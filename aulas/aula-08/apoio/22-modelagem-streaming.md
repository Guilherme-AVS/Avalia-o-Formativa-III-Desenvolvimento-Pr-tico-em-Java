# Sistema de Streaming

Enunciado:

> Uma plataforma gerencia usuários, playlists e músicas. Cada usuário pode criar várias playlists e uma playlist contém várias músicas. Uma música pode aparecer em várias playlists.

Candidatos:

- `Usuario`;
- `Playlist`;
- `Musica`.

O modelo permite discutir:

- composição `Usuario → Playlist`;
- agregação `Playlist → Musica`;
- associação `Playlist → Usuario`;
- diferença entre uma relação conceitual e sua implementação.

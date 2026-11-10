# Sistema de Biblioteca

O domínio condutor da aula possui:

- `Livro`;
- `Usuario`;
- `Emprestimo`;
- `Biblioteca`;
- `RelatorioService`.

Possíveis relações:

```text
Biblioteca → Livro        1:N
Biblioteca → Usuario      1:N
Emprestimo → Livro        1:1
Emprestimo → Usuario      1:1
Usuario → Emprestimo      1:N
RelatorioService → Livro  dependência
```

O objetivo não é decorar este modelo, mas aprender o processo que o produz.

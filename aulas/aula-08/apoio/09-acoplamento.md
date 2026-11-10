# Baixo acoplamento

Acoplamento representa o grau de dependência entre classes.

Evite:

```text
Emprestimo acessa diretamente detalhes internos de Livro.
```

Prefira:

```text
Emprestimo → usa métodos públicos de Livro
```

Uma mudança interna em uma classe deve causar o menor impacto possível nas outras.

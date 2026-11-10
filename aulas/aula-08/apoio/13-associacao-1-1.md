# Associação 1:1

Use quando um objeto se relaciona com exatamente um objeto da outra classe.

No domínio da biblioteca:

```text
Emprestimo → Livro
Emprestimo → Usuario
```

Em Java:

```java
private Livro livro;
private Usuario usuario;
```

A multiplicidade comunica a regra do domínio e deve aparecer no diagrama UML.

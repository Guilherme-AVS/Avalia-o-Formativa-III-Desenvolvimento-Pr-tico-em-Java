# Dependência

Dependência representa uso temporário.

Exemplo:

```java
public String gerarFicha(Livro livro) {
    return livro.getTitulo();
}
```

`RelatorioService` usa `Livro`, mas não precisa guardar um `Livro` como atributo permanente.

Na UML, a dependência é representada por linha tracejada com seta.

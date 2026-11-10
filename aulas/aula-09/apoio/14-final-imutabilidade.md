# final e imutabilidade

Um atributo `final` deve ser inicializado antes que o construtor termine e não poderá receber nova atribuição.

```java
private final String numero;

public Cpf(String numero) {
    this.numero = numero;
}
```

A combinação de `final` e construtor é uma forma clássica de construir objetos imutáveis.

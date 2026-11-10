# Arrays de objetos

Arrays podem armazenar referências para objetos.

Exemplo com `String`:

```java
String[] nomes = {"Ana", "Bruno", "Carlos"};

for (String nome : nomes) {
    System.out.println(nome.toUpperCase());
}
```

A ideia prepara a passagem de `String[]` para estruturas como `Aluno[]` e, depois, `ArrayList<Aluno>` na modelagem de classes.

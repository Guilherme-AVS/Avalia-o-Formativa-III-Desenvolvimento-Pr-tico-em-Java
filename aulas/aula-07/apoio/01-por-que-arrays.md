# Por que precisamos de arrays?

Declarar uma variável para cada valor funciona em pequenos exemplos, mas não escala.

Em vez de:

```text
double nota1 = 8.0;
double nota2 = 7.5;
double nota3 = 9.0;
...
```

podemos usar:

```java
double[] notas = new double[5];
```

Um array reúne vários valores do mesmo tipo em uma única estrutura, acessível por índice.

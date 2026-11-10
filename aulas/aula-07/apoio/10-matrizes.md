# Arrays multidimensionais

Uma matriz pode ser representada por `int[][]`:

```java
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6}
};
```

Acesso:

```java
System.out.println(matriz[1][2]); // 6
```

Percurso:

```java
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

O conceito integra diretamente os loops aninhados da Aula 04.

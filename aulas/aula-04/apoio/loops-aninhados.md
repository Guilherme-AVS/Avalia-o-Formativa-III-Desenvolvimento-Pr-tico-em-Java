# Loops aninhados

Um loop pode estar dentro de outro.

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 10; j++) {
        System.out.println(i + " x " + j);
    }
}
```

O loop interno executa todas as suas iterações para cada iteração do externo.

Para dois loops sobre `n` elementos, a quantidade de operações pode crescer aproximadamente como `n²`. Evite aninhamento desnecessário em grandes volumes de dados.

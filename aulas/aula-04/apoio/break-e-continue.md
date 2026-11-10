# `break` e `continue`

## `break`

Interrompe completamente o loop.

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```

Saída: `1 2 3 4`.

## `continue`

Pula o restante da iteração atual e segue para a próxima.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}
```

Saída: `1 2 4 5`.

Use ambos com moderação para preservar a legibilidade.

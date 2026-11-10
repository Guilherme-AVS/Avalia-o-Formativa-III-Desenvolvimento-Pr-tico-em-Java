# Guia de `if`, `else if` e `else`

## `if`

Use quando uma ação deve ocorrer somente se uma condição for verdadeira.

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
}
```

## `if-else`

Use quando existem duas alternativas mutuamente exclusivas.

```java
if (numero % 2 == 0) {
    System.out.println("Par");
} else {
    System.out.println("Ímpar");
}
```

## `if-else if-else`

Use quando há várias faixas ou critérios.

```java
if (nota >= 9) {
    conceito = "A";
} else if (nota >= 7) {
    conceito = "B";
} else if (nota >= 5) {
    conceito = "C";
} else {
    conceito = "D";
}
```

As condições são avaliadas em sequência e apenas o primeiro bloco correspondente é executado.

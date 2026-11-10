# Contadores e acumuladores

## Contador

Conta ocorrências.

```java
int contador = 0;

for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        contador++;
    }
}
```

## Acumulador

Acumula valores.

```java
int soma = 0;

for (int i = 1; i <= 5; i++) {
    soma += i;
}
```

Contadores geralmente começam em `0`. Acumuladores de soma também. Para produto, o valor inicial normalmente é `1`.

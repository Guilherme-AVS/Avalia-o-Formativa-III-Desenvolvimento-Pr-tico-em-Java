# Gabarito — Desafio 01

## Erro 1 — incompatibilidade de tipos

```java
int numero = "42";
```

Correção:

```java
int numero = 42;
```

## Erro 2 — divisão inteira

```java
double resultado = 10 / 3;
```

A expressão é calculada como divisão inteira.

Para obter resultado decimal:

```java
double resultado = 10.0 / 3;
```

## Erro 3 — expressão não booleana

```java
boolean teste = 5 + 10;
```

A soma produz um número, não um `boolean`.

Uma possibilidade coerente é:

```java
boolean teste = 5 + 10 > 0;
```

## Erro 4 — atribuição no lugar de comparação

```java
if (contador = 1)
```

A condição precisa resultar em booleano. Para comparar:

```java
if (contador == 1)
```

## Erro 5 — comparação de Strings

A aula orienta utilizar `equals()`:

```java
if (a.equals(b))
```

Assim, a comparação verifica o conteúdo das strings.

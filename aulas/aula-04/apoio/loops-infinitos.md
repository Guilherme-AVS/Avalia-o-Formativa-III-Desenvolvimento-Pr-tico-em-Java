# Loops infinitos

Um loop infinito ocorre quando a condição de parada nunca se torna falsa.

Exemplos de causas:

```java
while (true) {
    // sem break ou outra condição de saída
}
```

```java
int i = 1;

while (i <= 10) {
    System.out.println(i);
    // i nunca é atualizado
}
```

```java
for (int i = 10; i >= 0; i++) {
    // i aumenta, mas a condição exige que ele diminua
}
```

Antes de executar um loop, pergunte:

> O que fará a condição de parada se tornar falsa?

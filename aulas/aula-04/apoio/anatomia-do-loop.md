# Anatomia de um loop

Todo loop possui quatro elementos fundamentais:

1. **Inicialização** — define o ponto de partida.
2. **Condição** — determina se a repetição continua.
3. **Corpo** — comandos executados em cada iteração.
4. **Atualização** — modifica o estado para aproximar a condição de parada.

Exemplo:

```java
int contador = 1;

while (contador <= 5) {
    System.out.println(contador);
    contador++;
}
```

Sem atualização, a condição pode nunca se tornar falsa e o programa pode entrar em loop infinito.

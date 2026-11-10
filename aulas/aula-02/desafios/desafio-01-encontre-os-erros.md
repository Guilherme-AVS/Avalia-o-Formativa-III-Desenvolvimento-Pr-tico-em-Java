# Desafio 01 — Encontre os Erros

Analise:

```java
public class Desafio {
    public static void main(String[] args) {
        int numero = "42";

        double resultado = 10 / 3;
        System.out.println("Resultado preciso: " + resultado);

        boolean teste = 5 + 10;

        int contador = 1;
        if (contador = 1) {
            System.out.println("Contador é 1");
        }

        String a = "abc";
        String b = "abc";
        if (a == b) {
            System.out.println("Strings iguais");
        }
    }
}
```

Identifique e corrija os cinco problemas.

## Regras

Para cada erro, explique:

1. o que está errado;
2. por que está errado;
3. qual alteração resolve o problema.

Depois compile sua versão.

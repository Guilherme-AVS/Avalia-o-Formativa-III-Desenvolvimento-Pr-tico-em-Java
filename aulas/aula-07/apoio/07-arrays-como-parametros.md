# Arrays como parâmetros

Arrays podem ser recebidos por métodos:

```java
public static int somar(int[] numeros) {
    int soma = 0;
    for (int numero : numeros) {
        soma += numero;
    }
    return soma;
}
```

Uso:

```java
int[] valores = {10, 20, 30};
System.out.println(somar(valores));
```

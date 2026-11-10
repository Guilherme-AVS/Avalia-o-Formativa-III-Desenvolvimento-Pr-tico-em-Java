# for tradicional × for-each

## for tradicional

Use quando o índice é importante:

```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(i + ": " + numeros[i]);
}
```

## for-each

Use quando você precisa principalmente dos valores:

```java
for (int numero : numeros) {
    System.out.println(numero);
}
```

O `for` tradicional oferece acesso ao índice; o `for-each` é mais simples para percursos diretos.

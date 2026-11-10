# Índices e length

```java
int[] numeros = {10, 20, 30, 40, 50};

System.out.println(numeros[0]); // 10
System.out.println(numeros[4]); // 50
System.out.println(numeros.length); // 5
```

O último índice é sempre:

```text
length - 1
```

Tentar acessar `numeros[5]` gera `ArrayIndexOutOfBoundsException`.

# Wrapper Classes

`ArrayList` trabalha com referências, portanto tipos primitivos são representados pelas classes wrapper:

| Primitivo | Wrapper |
|---|---|
| `int` | `Integer` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

Exemplo:

```java
ArrayList<Integer> numeros = new ArrayList<>();
numeros.add(10);
int n = numeros.get(0);
```

Java realiza autoboxing e unboxing automaticamente nesses casos.

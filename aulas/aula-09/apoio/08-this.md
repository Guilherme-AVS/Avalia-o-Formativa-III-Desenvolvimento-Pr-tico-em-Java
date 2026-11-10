# this()

`this()` chama outro construtor da **mesma classe**.

```java
public Produto(String nome) {
    this(nome, 0.0, "Sem marca");
}
```

Regra fundamental: `this()` precisa ser a primeira instrução do construtor.

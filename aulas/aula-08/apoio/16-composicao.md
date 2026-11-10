# Composição

Composição representa uma relação "tem um" forte.

Exemplo:

```text
Pedido ◆──── ItemPedido
```

O item é criado e gerenciado pelo pedido e, conceitualmente, não faz sentido fora dele.

Sinal didático importante:

```java
itens.add(new ItemPedido(...));
```

A parte é criada dentro do todo.

# Construtores em UML

Na notação usada nesta aula, construtores aparecem na seção de operações e podem ser identificados pelo estereótipo `«constructor»`.

Exemplo:

```text
Produto
-----------------------------
- nome: String
- preco: double
-----------------------------
«constructor»
+ Produto(nome: String)
+ Produto(nome: String, preco: double)
+ getNome(): String
```

Cada assinatura de construtor sobrecarregado aparece separadamente.

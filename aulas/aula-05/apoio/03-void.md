# 03 — Métodos `void`

`void` indica que o método executa uma ação sem devolver um valor ao chamador.

Exemplo:

`public static void exibirBoasVindas(String nome)`

Use `void` quando a responsabilidade principal é produzir um efeito, como:
- exibir uma mensagem;
- atualizar algo;
- registrar uma informação.

## `return;` em `void`
Um método `void` pode usar `return;` sem valor para encerrar antecipadamente sua execução.

Isso é útil para validações iniciais e **guard clauses**.

O código depois do `return` não será executado naquele caminho.

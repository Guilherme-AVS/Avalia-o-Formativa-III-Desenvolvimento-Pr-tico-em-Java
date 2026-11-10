# 02 — Anatomia de um método

Exemplo:

`public static int somar(int a, int b)`

| Parte | Função |
|---|---|
| `public` | modificador de acesso |
| `static` | permite chamada sem criar objeto |
| `int` | tipo de retorno |
| `somar` | nome do método |
| `(int a, int b)` | parâmetros |
| `{ ... }` | corpo |
| `return` | devolve o resultado |

Um método cujo retorno não é `void` precisa retornar um valor compatível em todos os caminhos possíveis de execução.

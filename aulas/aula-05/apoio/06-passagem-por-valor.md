# 06 — Passagem de tipos primitivos por valor

Para tipos primitivos, o método recebe uma cópia do valor.

Exemplo:

`int n = 5;`
`tentarAlterar(n);`

Se o método fizer `x = 99`, a variável original `n` continuará com `5`.

Tipos primitivos incluem:
`int`, `double`, `float`, `long`, `boolean`, `char`, `byte` e `short`.

## Modelo mental
Argumento → cópia → parâmetro local → execução → fim do método.

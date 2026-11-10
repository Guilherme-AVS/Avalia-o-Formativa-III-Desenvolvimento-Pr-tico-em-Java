# 09 — Imutabilidade

Strings são imutáveis.

Isso significa que operações como `toUpperCase()`, `trim()`, `replace()` e `substring()` não alteram o objeto original.

Este código não muda `nome`:

`nome.toUpperCase();`

Para guardar a transformação:

`nome = nome.toUpperCase();`

A variável passa a referenciar a nova String retornada.

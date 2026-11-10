# 16 — Think-Pair-Share

## Situação-problema

Considere:

`double media1 = (8 + 7) / 2.0;`
`double media2 = (9 + 6) / 2.0;`
`double media3 = (10 + 8) / 2.0;`

### Pense
Como eliminar a repetição?

### Discuta em dupla
Que parâmetros o método deveria receber?

### Compartilhe
Proponha uma assinatura e explique por que ela é reutilizável.

## Solução conceitual esperada
`calcularMedia(double, double)`

A ideia é aplicar DRY e transformar uma operação repetida em comportamento reutilizável.

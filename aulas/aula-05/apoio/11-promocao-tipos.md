# 11 — Promoção de tipos na sobrecarga

Quando não existe correspondência exata, o Java pode promover automaticamente um tipo para outro compatível mais abrangente.

Exemplo:

`exibir(double valor)`

A chamada `exibir(5)` pode promover `int` para `double`.

Apesar de funcionar, prefira argumentos que expressem claramente o tipo esperado pelo método.

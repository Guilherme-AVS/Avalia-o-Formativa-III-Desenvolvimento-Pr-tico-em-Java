# Situacao Problema Logistica

## Situação-problema
Um sistema de logística calcula fretes de Entrega Terrestre, Aérea e Expressa. Cada uma usa uma regra diferente, mas o sistema deve chamar `calcularFrete()` sem uma cadeia crescente de `if/else`.

A solução explorada na aula é distribuir o comportamento nas subclasses e trabalhar com a abstração comum `Entrega`. Isso reduz condicionais baseadas em tipo e torna a extensão por novos tipos mais localizada.

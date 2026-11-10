# Quando Não Criar Setter

Identidade, valores calculados e estado puramente interno frequentemente não precisam de setter. Saldo pode mudar por `depositar()` e `sacar()`, em vez de `setSaldo()`.

# Polimorfismo Vs Condicionais

Quando o comportamento varia por tipo de objeto e o mesmo `if/switch` se repete, o polimorfismo pode mover a responsabilidade para as próprias subclasses.

Condicionais continuam apropriadas para poucos casos fixos, estados simples e validações pontuais. A regra não é “nunca use if”; é evitar condicionais repetidas que descobrem o tipo concreto para decidir o comportamento.

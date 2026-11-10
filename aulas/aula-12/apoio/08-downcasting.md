# Downcasting

## Downcasting
Converter `Animal` para `Cachorro` é uma operação excepcional e deve ser feita somente quando o objeto real for compatível.

Forma clássica: `if (animal instanceof Cachorro) { Cachorro c = (Cachorro) animal; ... }`.

Java 16+: `if (animal instanceof Cachorro c) { c.acaoEspecifica(); }`.

Nunca faça cast cego apenas porque a referência foi declarada como superclasse.

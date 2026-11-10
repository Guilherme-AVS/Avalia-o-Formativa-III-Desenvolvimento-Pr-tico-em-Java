# Lsp

## Princípio de Substituição de Liskov
Uma subclasse deve poder substituir a superclasse sem quebrar o comportamento esperado.

Exemplos discutidos na aula: `Cachorro extends Animal` preservando o contrato de `emitirSom`; `Pinguim extends Ave` com `voar()` que não pode cumprir o contrato; `Quadrado extends Retangulo` alterando a semântica de setters.

Teste mental: substitua a superclasse pela subclasse. Se o código cliente deixa de funcionar de maneira esperada, a hierarquia merece revisão.

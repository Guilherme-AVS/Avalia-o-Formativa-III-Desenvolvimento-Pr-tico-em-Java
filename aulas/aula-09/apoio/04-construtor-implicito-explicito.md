# Construtor implícito versus explícito

Se a classe não declara nenhum construtor, o Java disponibiliza um construtor sem parâmetros.

Assim que a classe declara pelo menos um construtor, o construtor implícito deixa de ser gerado. Se o programa ainda precisar de `new Classe()`, esse construtor deverá ser declarado explicitamente.

**Atenção:** o construtor implícito não realiza validações nem inicializações de negócio.

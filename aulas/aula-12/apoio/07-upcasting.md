# Upcasting

## Upcasting
`Cachorro cachorro = new Cachorro(); Animal animal = cachorro;` é seguro e implícito porque todo Cachorro é um Animal.

Ao usar a referência `Animal`, apenas membros disponíveis em `Animal` ficam acessíveis diretamente. O comportamento de métodos sobrescritos continua polimórfico.

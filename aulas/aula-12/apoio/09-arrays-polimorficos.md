# Arrays Polimorficos

Um array da superclasse pode armazenar instâncias de subclasses: `Animal[] animais = { new Cachorro(), new Gato(), new Passaro() };`. Ao percorrê-lo e chamar `emitirSom()`, a ligação dinâmica preserva o comportamento específico de cada objeto.

Arrays têm tamanho fixo; para quantidade variável, a aula apresenta `List<Animal>` e `ArrayList`.

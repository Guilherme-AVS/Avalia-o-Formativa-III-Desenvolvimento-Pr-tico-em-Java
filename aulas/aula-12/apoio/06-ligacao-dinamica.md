# Ligacao Dinamica

Em `Forma f = new Circulo(); f.desenhar();`, o compilador verifica se `Forma` possui `desenhar()`. Em execução, a JVM consulta o objeto real, `Circulo`, e despacha `Circulo.desenhar()`.

Essa separação entre **tipo da referência** e **tipo real do objeto** é central para entender polimorfismo.

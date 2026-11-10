# Gabarito — Exercício 06

```java
int idade = 21;
boolean possuiIngresso = true;
boolean documentoValido = true;

boolean podeEntrar =
    idade >= 18 && possuiIngresso && documentoValido;

boolean precisaAcompanhante =
    idade < 18 || !documentoValido;
```

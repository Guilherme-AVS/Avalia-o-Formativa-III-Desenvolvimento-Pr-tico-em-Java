# Guia de `switch-case`

Use `switch` quando uma única expressão precisa ser comparada com vários valores exatos.

```java
switch (opcao) {
    case 1:
        System.out.println("Cadastrar");
        break;
    case 2:
        System.out.println("Consultar");
        break;
    default:
        System.out.println("Opção inválida");
}
```

Pontos de atenção:
- `break` interrompe o `switch`;
- sem `break`, pode ocorrer *fallthrough*;
- `default` é opcional, mas é uma boa prática incluí-lo;
- o material da aula apresenta `int`, `char`, `enum` e `String` como tipos compatíveis.

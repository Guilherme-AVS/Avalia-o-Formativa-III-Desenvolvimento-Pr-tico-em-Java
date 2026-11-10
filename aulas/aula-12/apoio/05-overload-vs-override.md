# Overload Vs Override

| Aspecto | Overload | Override |
|---|---|---|
| Contexto | mesma classe | superclasse/subclasse |
| Assinatura | parâmetros diferentes | mesma assinatura |
| Resolução | compilação | execução |
| Ligação | estática | dinâmica |

O retorno isoladamente não cria overload. Ao sobrescrever, use `@Override` para que o compilador valide a intenção.

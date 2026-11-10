# Associação 1:N

Use quando um objeto se relaciona com vários objetos.

Exemplo:

```text
Instrutor → Aluno
1           0..*
```

Em Java:

```java
private List<Aluno> alunos;
```

A Aula 07 preparou este conceito ao trabalhar `ArrayList`.

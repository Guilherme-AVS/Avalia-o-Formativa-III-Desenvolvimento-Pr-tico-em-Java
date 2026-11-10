# Construtores e herança: super()

Em uma subclasse, `super(...)` chama um construtor da superclasse e deve ser a primeira instrução do construtor.

A ideia conecta a Aula 09 às aulas posteriores de herança:

```java
public Aluno(String nome, String matricula) {
    super(nome);
    this.matricula = matricula;
}
```

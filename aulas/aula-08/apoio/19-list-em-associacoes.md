# List<T> nas associações 1:N

Quando o domínio diz "vários", uma coleção representa naturalmente a relação.

```java
private List<Emprestimo> emprestimos;
```

Na implementação:

```java
emprestimos = new ArrayList<>();
emprestimos.add(emprestimo);
```

Isso conecta diretamente a Aula 07 à modelagem orientada a objetos.

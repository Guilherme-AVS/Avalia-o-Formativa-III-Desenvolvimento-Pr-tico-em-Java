# Encapsulamento — introdução

Nesta aula, o foco é introdutório:

- atributos `private`;
- métodos públicos para acesso controlado;
- getters para leitura;
- setters básicos para escrita.

Exemplo:

```java
private String nome;

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}
```

**Atenção:** validações, normalização e regras de negócio serão aprofundadas na Aula 10.

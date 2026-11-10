# Validação e estado válido

O construtor é um ponto importante para impedir a criação de objetos inválidos.

Exemplo:

```java
if (nome == null || nome.isBlank()) {
    throw new IllegalArgumentException("Nome obrigatório");
}
if (preco < 0) {
    throw new IllegalArgumentException("Preço não pode ser negativo");
}
```

Regra pedagógica da aula: **validar primeiro, atribuir depois**.

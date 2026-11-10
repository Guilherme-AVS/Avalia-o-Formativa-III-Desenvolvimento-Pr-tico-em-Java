# Records — conteúdo complementar

Records, disponíveis a partir do Java 16, oferecem uma forma compacta de representar dados. O compilador gera o construtor correspondente e o record pode incluir um construtor compacto para validações.

Exemplo:

```java
public record Ponto(int x, int y) {
    public Ponto {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Coordenadas inválidas");
        }
    }
}
```

O foco da aula continua sendo o construtor clássico.

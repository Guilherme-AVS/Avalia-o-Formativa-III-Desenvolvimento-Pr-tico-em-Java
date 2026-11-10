# Exercício 2 — Identifique o erro

Analise:

```java
public class Veiculo {
    String marca;
    int ano;

    public void Veiculo(String marca) {
        marca = marca;
    }

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public Veiculo(String m, int a) {
        this.marca = m;
        this.ano = a;
    }
}
```

Identifique todos os problemas e produza uma versão corrigida.

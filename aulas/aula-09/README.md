# Aula 09 — Construtores em Java

**Programação Orientada a Objetos — 2026.2**  
**Aula 09/23 — UNICAP**

## Objetivo

Aprender a projetar construtores que inicializam objetos de forma clara, consistente e segura, evitando que objetos nasçam em estado inválido.

## Conteúdos

- papel do construtor;
- construtor simples e construtor explícito;
- construtor implícito gerado pelo Java;
- construtores parametrizados;
- sobrecarga de construtores;
- `this.atributo`;
- `this()`;
- valores padrão;
- validação no construtor;
- estado válido;
- erros comuns;
- `final` e construtores;
- `static` como conteúdo complementar;
- Records e Lombok como alternativas modernas;
- coesão e baixo acoplamento;
- construtores e imutabilidade;
- relação com `super()` em herança;
- notação UML para construtores.

## Progressão pedagógica

A aula parte da criação de classes e objetos da Aula 08 e prepara o terreno para o encapsulamento da Aula 10. O construtor é tratado como a porta de entrada do estado do objeto: primeiro entendemos sua sintaxe, depois sobrecarga, `this()`, validação e boas práticas.

## Organização

- `apoio/` — guias, mapas conceituais, comparações e estudos dirigidos;
- `exemplos/` — exemplos graduais e executáveis;
- `exercicios/` — exercícios individuais;
- `desafios/` — desafios de aplicação;
- `gabaritos/` — soluções comentadas;
- `uml/` — diagramas editáveis em Draw.io;
- `docs/` — roteiro, checklist e avaliação formativa.

## Execução

Use Java 17+.

```bash
javac exemplos/01-construtor-simples/LivroSimples.java
java -cp exemplos/01-construtor-simples LivroSimples
```

Os exemplos foram organizados para permitir estudo incremental. O PDF de referência **não faz parte deste pacote**.

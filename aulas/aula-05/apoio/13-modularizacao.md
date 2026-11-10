# 13 — Modularização

Concentrar todo o processamento no `main` dificulta leitura, reutilização e manutenção.

Uma solução modular separa responsabilidades.

Exemplo de decomposição:
- `lerNota(...)`;
- `calcularMedia(...)`;
- `exibirResultado(...)`.

O `main` passa a funcionar como um **orquestrador**: apresenta a sequência de alto nível sem esconder o detalhe de cada operação.

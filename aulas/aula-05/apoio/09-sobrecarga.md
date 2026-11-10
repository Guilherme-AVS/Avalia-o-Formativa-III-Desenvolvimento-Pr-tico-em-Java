# 09 — Sobrecarga de métodos

Sobrecarga permite métodos com o mesmo nome, mas listas de parâmetros diferentes.

Pode variar:
- quantidade de parâmetros;
- tipos dos parâmetros;
- ordem dos tipos.

Não pode variar apenas o tipo de retorno.

Exemplos de assinaturas distintas:
- `somar(int, int)`
- `somar(double, double)`
- `somar(int, int, int)`

O compilador escolhe a versão compatível com os argumentos fornecidos.

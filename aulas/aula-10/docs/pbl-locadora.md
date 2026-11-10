# PBL — Locadora de Veículos


### Entidades
- `Veiculo`: placa, modelo, marca, anoFabricacao, precoDiaria, disponivel.
- `Cliente`: cpf, nome, email, telefone, habilitacao.
- `Locacao`: veiculo, cliente, dataInicio, dataFim, valorTotal calculado.

### Regras
- placa: 7 ou 8 caracteres;
- diária > 0;
- ano entre 1950 e ano atual;
- fim posterior ao início;
- valor total = dias × diária.

### Organização sugerida
10 min análise → 15 min modelagem/implementação → 5 min apresentação.

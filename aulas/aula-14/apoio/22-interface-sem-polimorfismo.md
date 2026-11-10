# Erro comum — implementar sem usar o contrato

Criar `Boleto implements Pagavel` mas sempre declarar `Boleto b` não demonstra o ganho do polimorfismo. Use o contrato quando o cliente só precisa da capacidade.

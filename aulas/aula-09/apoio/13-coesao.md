# Coesão do construtor

O construtor deve se concentrar em montar o objeto.

É adequado:
- validar entradas;
- atribuir atributos;
- aplicar valores padrão;
- delegar para outro construtor.

Não é adequado:
- acessar banco de dados;
- executar I/O;
- iniciar processos externos;
- concentrar regras de negócio complexas.

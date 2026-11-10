# Listas Polimorficas

`List<Animal> zoologico = new ArrayList<>();` pode receber `Cachorro`, `Gato`, `Passaro` e novas subclasses. Declarar pela interface `List` mantém o cliente desacoplado da implementação.

Para código moderno, prefira `List` quando a quantidade varia e operações como `add`/`remove` são necessárias.

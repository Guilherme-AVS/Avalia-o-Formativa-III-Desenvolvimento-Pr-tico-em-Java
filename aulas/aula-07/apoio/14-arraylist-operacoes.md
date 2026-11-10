# Operações essenciais do ArrayList

```java
nomes.add("Ana");
nomes.add(1, "Beatriz");

String nome = nomes.get(0);

nomes.set(1, "Carla");

nomes.remove(1);
nomes.remove("Carlos");

nomes.contains("Ana");
nomes.isEmpty();
nomes.size();
```

Acesso por índice continua existindo, mas a sintaxe muda:

- array: `nomes[0]`
- ArrayList: `nomes.get(0)`

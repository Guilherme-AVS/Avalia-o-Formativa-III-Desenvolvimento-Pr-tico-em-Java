# Comandos de terminal — Aula 01

## Verificar Java

```text
java -version
javac -version
```

## Compilar um arquivo

```text
javac HelloJava.java
```

## Executar

```text
java HelloJava
```

Observe que o comando `java` recebe o nome da classe, sem `.java`.

## Compilar todos os exemplos

Dentro de `exemplos/aula01`:

```text
javac *.java
```

## Executar cada exemplo

```text
java HelloJava
java DiagnosticoAmbiente
java HardwareSoftware
java LinguagensProgramacao
java FluxoCompilacao
java ComentariosJava
java MeusDados
```

## Limpeza dos `.class`

Depois dos testes, os arquivos `.class` podem ser removidos. Eles não fazem parte dos arquivos-fonte do repositório.

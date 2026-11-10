# UML — classe

Uma classe UML possui três compartimentos:

```text
+-----------------------------+
| Livro                       |
+-----------------------------+
| - titulo : String           |
| - autor : String            |
| - isbn : String             |
+-----------------------------+
| + emprestar() : boolean     |
| + devolver() : void         |
| + getTitulo() : String      |
+-----------------------------+
```

Visibilidade:

- `+` public
- `-` private
- `#` protected
- `~` package/default

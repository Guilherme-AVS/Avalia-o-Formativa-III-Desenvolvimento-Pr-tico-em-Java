# Conflito entre default

Se duas interfaces oferecem o mesmo método `default`, a classe concreta deve resolver a ambiguidade sobrescrevendo o método. Dentro dela, pode usar `NomeInterface.super.metodo()`.

# Gabarito — Exercício 10

```java
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Nota: ");
        double nota = sc.nextDouble();

        System.out.printf(
            "Nome: %s | Idade: %d | Nota: %.2f%n",
            nome, idade, nota
        );

        sc.close();
    }
}
```

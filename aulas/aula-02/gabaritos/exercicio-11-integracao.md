# Gabarito — Exercício 11

```java
import java.util.Scanner;

public class ControleCreditos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Creditos atuais: ");
        int atuais = sc.nextInt();

        System.out.print("Creditos adquiridos: ");
        int adquiridos = sc.nextInt();

        System.out.print("Matricula ativa (true/false): ");
        boolean ativa = sc.nextBoolean();

        int total = atuais + adquiridos;
        boolean podeAcessar = ativa && total >= 10;

        System.out.printf(
            "%s possui %d creditos. Pode acessar: %b%n",
            nome, total, podeAcessar
        );

        sc.close();
    }
}
```

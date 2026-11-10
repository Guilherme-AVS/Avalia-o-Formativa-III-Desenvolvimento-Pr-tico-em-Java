public class OperadoresLogicos {
    public static void main(String[] args) {
        int idade = 25;
        boolean temCarteira = true;

        boolean podeDirigir = idade >= 18 && temCarteira;
        boolean precisaEstudar = idade < 18 || !temCarteira;

        System.out.println("podeDirigir = " + podeDirigir);
        System.out.println("precisaEstudar = " + precisaEstudar);

        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("true || false = " + (true || false));
        System.out.println("!true = " + (!true));
    }
}

public class Calculadora {
    public static double calcular(double a, double b) {
        return a + b;
    }

    public static double calcular(double a, double b, char operacao) {
        switch (operacao) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    return Double.NaN;
                }
                return a / b;
            default:
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        System.out.println(calcular(10.0, 5.0));
        System.out.println(calcular(10.0, 5.0, '*'));
        System.out.println(calcular(10.0, 5.0, '/'));
    }
}

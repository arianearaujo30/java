import java.util.Scanner;
    public class atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dados sem mensagens explicativas
        double OPERANDO1 = scanner.nextDouble();
        double OPERANDO2 = scanner.nextDouble();
        char OPERADOR = scanner.next().charAt(0);

        double RESULTADO;

        // Seleção da operação com base no operador informado
        switch (OPERADOR) {
            case '+':
                RESULTADO = OPERANDO1 + OPERANDO2;
                System.out.println(RESULTADO);
                break;
            case '-':
                RESULTADO = OPERANDO1 - OPERANDO2;
                System.out.println(RESULTADO);
                break;
            case '*':
                RESULTADO = OPERANDO1 * OPERANDO2;
                System.out.println(RESULTADO);
                break;
            case '/':
                if (OPERANDO2 != 0) {
                    RESULTADO = OPERANDO1 / OPERANDO2;
                    System.out.println(RESULTADO);
                } else {
                    System.out.println("Divisão por zero não é permitida!");
                }
                break;
            default:
                System.out.println("Operador inválido!");
                break;
        }

        scanner.close();
    }
}


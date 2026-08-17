import java.util.Scanner;

public class mediadoisnumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota/número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota/número: ");
        double num2 = scanner.nextDouble();

        double media = (num1 + num2) / 2;

        System.out.printf("A média aritmética é: %.2f%n", media);

        scanner.close();
    }
}
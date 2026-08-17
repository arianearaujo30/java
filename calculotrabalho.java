import java.util.Scanner;

public class calculotrabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a força aplicada (em Newtons - N): ");
        double força = scanner.nextDouble();

        System.out.print("Digite a distância percorrida (em metros - m): ");
        double distancia = scanner.nextDouble();

        double trabalho = força * distancia;

        System.out.printf("O trabalho realizado é: %.2f Joules (J)%n", trabalho);

        scanner.close();
    }
}
import java.util.Scanner;

public class atividadeWH03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n=== MENU DE CANETAS ===");
            System.out.println("1 - Caneta Esferográfica");
            System.out.println("2 - Caneta Gel");
            System.out.println("3 - Caneta Tinteiro");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nCaneta Esferográfica: Econômica e de longa duração");
                    break;
                case 2:
                    System.out.println("\nCaneta Gel: Tinta mais pigmentada e escrita suave");
                    break;
                case 3:
                    System.out.println("\nCaneta Tinteiro: Clássica e elegante, usada para caligrafia");
                    break;
                case 4:
                    System.out.println("\nEncerrando o programa.");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}

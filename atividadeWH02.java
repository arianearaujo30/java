import java.util.Scanner;

public class atividadeWH02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        // O loop continua enquanto a opção for diferente de 4 (Sair)
        while (opcao != 4) {
            System.out.println("\n=== MENU DE EMBALAGENS ===");
            System.out.println("1 - Caixa de papelão");
            System.out.println("2 - Sacola plástica");
            System.out.println("3 - Embalagem de vidro");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            // Processa a escolha do usuário
            switch (opcao) {
                case 1:
                    System.out.println("\nCaixa de papelão: Ideal para transporte e armazenamento");
                    break;
                case 2:
                    System.out.println("\nSacola plástica: Leve e prática, mas pouco sustentável");
                    break;
                case 3:
                    System.out.println("\nEmbalagem de vidro: Resistente e reutilizável");
                    break;
                case 4:
                    System.out.println("\nSaindo do programa.");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}

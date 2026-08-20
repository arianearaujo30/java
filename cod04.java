import java.util.Scanner;

public class cod04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao=0;
        while (opcao!=5) {
            System.out.println("\n====MENU====");
            System.out.println("1 -Cadastro");
            System.out.println("2 - Listar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Remover");
            System.out.println("5 - Sair");
            System.out.print("Escolha a opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar");
                    break;
                case 2:
                    System.out.println("Listar");
                    break;
                case 3:
                    System.out.println("Alterar");
                    break;
                case 4:
                    System.out.println("Remover");
                    break;
                case 5:
                    System.out.println("Saindo...fui!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}

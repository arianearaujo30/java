import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = null;

        while (true) {
            System.out.println("\n=================================");
            System.out.println("       SISTEMA DE VENDAS");
            System.out.println("=================================");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Mostrar Dados do Produto");
            System.out.println("3. Realizar Venda");
            System.out.println("4. Realizar Venda com Desconto (%)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Tipo: 1 - Físico | 2 - Digital");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Código: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: R$ ");
                    double preco = scanner.nextDouble();

                    if (tipo == 1) {
                        System.out.print("Valor do Frete: R$ ");
                        double frete = scanner.nextDouble();
                        produto = new ProdutoFisico(codigo, nome, preco, frete);
                        System.out.println("Produto Físico cadastrado!");
                    } else if (tipo == 2) {
                        produto = new ProdutoDigital(codigo, nome, preco);
                        System.out.println("Produto Digital cadastrado!");
                    } else {
                        System.out.println("Opção de produto inválida!");
                    }
                    break;

                case 2:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        produto.exibirDados();
                    }
                    break;

                case 3:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.print("Informe a quantidade: ");
                        int qtd = scanner.nextInt();
                        System.out.printf("Valor Final da Venda: R$ %.2f\n", produto.realizarVenda(qtd));
                    }
                    break;

                case 4:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.print("Informe a quantidade: ");
                        int qtd = scanner.nextInt();
                        System.out.print("Percentual de desconto (%): ");
                        double perc = scanner.nextDouble();
                        System.out.printf("Valor Final com Desconto: R$ %.2f\n", produto.realizarVenda(qtd, perc));
                    }
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
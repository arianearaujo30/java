import java.util.Scanner;

public class VeiculoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcoes;

        do {
            System.out.println("\n=== Sistema de Veiculos ===");
            System.out.println("1 - Cadastrar/Consultar Moto");
            System.out.println("2 - Cadastrar/Consultar Carro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!sc.hasNextInt()) {
                System.out.println("Opção inválida. Digite 0, 1 ou 2:");
                sc.next();
            }
            op = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do teclado

            switch (opcoes) {
                case 1: {
                    System.out.print("Informe a marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Digite o ano: ");
                    int ano = sc.nextInt();

                    System.out.print("Digite a cilindrada: ");
                    int cilindrada = sc.nextInt();
                    sc.nextLine(); // Limpa buffer

                    VeiculoMoto mt = new VeiculoMoto(marca, ano, cilindrada);
                    

                    System.out.println("\n-- Dados do Veiculo Moto --");
                    mt.exibirInformacoes();
                    break;
                }
                case 2: {
                    System.out.print("Informe a marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Digite o ano: ");
                    int ano = sc.nextInt();

                    System.out.print("Informe a quantidade de portas: ");
                    int qntdPortas = sc.nextInt();
                    sc.nextLine(); // Limpa buffer

                    // Correção: passando 'qntdPortas' corretamente
                    VeiculoCarro cr = new VeiculoCarro(marca, ano, qntdPortas);

                    System.out.println("\n-- Dados do Veiculo Carro --");
                    cr.exibirInformacoes();
                    break;
                }
                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha 0, 1 ou 2.");
                    break;
            }
        } while (opcoes != 0);

        sc.close();
    }
        
    }


import java.util.Scanner;

public class SistemaFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = null; // Guarda o funcionário cadastrado

        while (true) {
            System.out.println("\n======SISTEMA DE FUNCIONÁRIOS=======");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Mostrar Dados Cadastrados");
            System.out.println("3. Calcular Pagamento");
            System.out.println("4. Calcular Pagamento com Bônus");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.println("\n-- Escolha o tipo de funcionário --");
                    System.out.println("1. CLT");
                    System.out.println("2. Freelancer");
                    System.out.print("Opção: ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Informe o Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Informe o CPF: ");
                    String cpf = scanner.nextLine();

                    if (tipo == 1) {
                        System.out.print("Informe o Salário Mensal: R$ ");
                        double salario = scanner.nextDouble();
                        funcionario = new FuncionarioCLT(nome, cpf, salario);
                        System.out.println("-> Funcionário CLT cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        System.out.print("Informe a quantidade de horas trabalhadas: ");
                        int horas = scanner.nextInt();
                        System.out.print("Informe o valor por hora: R$ ");
                        double valorHora = scanner.nextDouble();
                        funcionario = new FuncionarioFreelancer(nome, cpf, horas, valorHora);
                        System.out.println("-> Funcionário Freelancer cadastrado com sucesso!");
                    } else {
                        System.out.println("Tipo inválido. Cadastro cancelado.");
                    }
                    break;

                case 2:
                    if (funcionario == null) {
                        System.out.println("Aviso: Nenhum funcionário cadastrado até o momento.");
                    } else {
                        funcionario.exibirDados();
                    }
                    break;

                case 3:
                    if (funcionario == null) {
                        System.out.println("Aviso: Nenhum funcionário cadastrado até o momento.");
                    } else {
                        double pagamento = funcionario.calcularPagamento();
                        System.out.printf("O valor do pagamento é: R$ %.2f\n", pagamento);
                    }
                    break;

                case 4:
                    if (funcionario == null) {
                        System.out.println("Aviso: Nenhum funcionário cadastrado até o momento.");
                    } else {
                        System.out.print("Informe o valor do bônus: R$ ");
                        double bonus = scanner.nextDouble();
                        double pagamentoComBonus = funcionario.calcularPagamento(bonus);
                        System.out.printf("O valor do pagamento com bônus é: R$ %.2f\n", pagamentoComBonus);
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa. Até logo!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}


import java.util.Scanner;

public class FuncionarioApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor professor = null;
        Tecnico tecnico = null;
        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE FUNCIONÁRIOS =====");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Cadastrar Técnico");
            System.out.println("3 - Exibir Professor");
            System.out.println("4 - Exibir Técnico");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Professor: ");
                    String nomeProf = sc.nextLine();
                    System.out.print("Salário: ");
                    double salarioProf = sc.nextDouble();
                    sc.nextLine(); // Limpa buffer
                    System.out.print("Disciplina: ");
                    String disciplina = sc.nextLine();

                    professor = new Professor(nome, salario, disciplina);
                    System.out.println("Professor cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do Técnico: ");
                    String nomeTec = sc.nextLine();
                    System.out.print("Salário: ");
                    double salarioTec = sc.nextDouble();
                    sc.nextLine(); // Limpa buffer
                    System.out.print("Setor: ");
                    String setor = sc.nextLine();

                    tecnico = new Tecnico(nome, salario, setor);
                    System.out.println("Técnico cadastrado com sucesso!");
                    break;

                case 3:
                    if (professor != null) {
                        System.out.println("\n--- Dados do Professor ---");
                        professor.exibirInformacoes();
                    } else {
                        System.out.println("Nenhum professor cadastrado ainda.");
                    }
                    break;

                case 4:
                    if (tecnico != null) {
                        System.out.println("\n--- Dados do Técnico ---");
                        tecnico.exibirInformacoes();
                    } else {
                        System.out.println("Nenhum técnico cadastrado ainda.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}

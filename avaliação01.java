
import java.util.Scanner;

public class avaliação01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Desenvolva um programa em Java para a companhia aérea Sweet Flight, permitindo que os atendentes realizem a gestão de reservas de passagens.
        int maxaviao = 4;
        int maxreservas = 20;
        
        int[] numerosavioes = new int[maxaviao];
        int[] numerosreservas = new int[maxreservas];

        int[] assentosdisponiveis = new int[maxaviao];
        String[] nomespassageiros = new String[maxreservas];

        int opcao;

        System.out.println("Informe a quantidade de aviões que deseja cadastrar:");
        int quantidadeAvioes = sc.nextInt();
        while (quantidadeAvioes < 1 || quantidadeAvioes > 4) {
            System.out.println("Quantidade inválida. Informe novamente:");
            quantidadeAvioes = sc.nextInt();
        }

        do {
            System.out.println("====Sweet Flight - Sistema de Reservas====");
            System.out.println("1 - Cadastrar aviões");
            System.out.println("2 - Cadastrar quantidade de assentos");
            System.out.println("3 - Listar aviões");
            System.out.println("4 - Realizar reserva");
            System.out.println("5 - Consultar reservas de um avião");
            System.out.println("6 - Pesquisar passageiro");
            System.out.println("7 - Mostrar resumo");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {

            case 1:
                // Cadastrar aviões
                for (int i = 0; i < quantidadeAvioes; i++) {
                    System.out.println("Digite o número do avião " + (i + 1) + ":");
                    numerosavioes[i] = sc.nextInt();
                }
                System.out.println("Aviões cadastrados com sucesso!");
                break;
            case 2:
                // Cadastrar quantidade de assentos
                for (int i = 0; i < quantidadeAvioes; i++) {
                    System.out.println("Digite a quantidade de assentos disponíveis para o avião " + numerosavioes[i] + ":");
                    assentosdisponiveis[i] = sc.nextInt();
                }
                System.out.println("Assentos cadastrados com sucesso!");
                break;
            case 3:
                // Listar aviões
                System.out.println("Aviões cadastrados:");
                for (int i = 0; i < quantidadeAvioes; i++) {
                    System.out.println("Avião: " + numerosavioes[i] + " | Assentos disponíveis: " + assentosdisponiveis[i]);
                }
                break;
            case 4:
                // Realizar reserva
                System.out.println("Digite o número do avião para realizar a reserva:   ");
                int numeroAviaoReserva = sc.nextInt();
                boolean aviaoEncontrado = false;
                for (int i= 0; i < quantidadeAvioes; i++) {
                    if (numerosavioes[i] == numeroAviaoReserva) {
                        aviaoEncontrado = true;
                        if (assentosdisponiveis[i] > 0) {
                            System.out.println("Digite o nome do passageiro e quantidade de assentos:");
                            sc.nextLine(); // Limpar buffer
                            String nomePassageiro = sc.nextLine();
                            nomespassageiros[i] = nomePassageiro;
                            assentosdisponiveis[i]--;
                            System.out.println("Reserva realizada com sucesso para " + nomePassageiro + " no avião " + numeroAviaoReserva + ". Assentos restantes: " + assentosdisponiveis[i]);
                        } else {
                            System.out.println("Não há assentos disponíveis nesse avião.");
                        }

                        break;
                    }
                }

                break;
            case 5:
                // Consultar reservas de um avião
                System.out.println("Digite o número do avião para consultar as reservas:");
                int numeroAviaoConsulta = sc.nextInt();
                boolean aviaoencontrado = false;
                for (int i = 0; i < quantidadeAvioes; i++) {
                    if (numerosavioes[i] == numeroAviaoConsulta) {
                        aviaoencontrado = true;
                        System.out.println("Reservas para o avião " + numeroAviaoConsulta + ":");
                        for (int j = 0; j < quantidadeAvioes; j++) {
                            if (nomespassageiros[j] != null) {
                                System.out.println("Passageiro: " + nomespassageiros[j]);
                            } else {
                                System.out.println("Nenhuma reserva foi realizada para o avião informado.");
                            }
                        }
                        break;
                    }
                }
                if (!aviaoencontrado) {
                    System.out.println("Avião não encontrado.");
                }
                break;
            case 6:
                // Pesquisar passageiro
                System.out.println("Digite o nome do passageiro para pesquisar:");
                sc.nextLine(); // Limpar buffer
                String nomePesquisa = sc.nextLine();
                boolean passageiroEncontrado = false;
                for (int i = 0; i < quantidadeAvioes; i++) {
                    if (nomespassageiros[i] != null && nomespassageiros[i].equalsIgnoreCase(nomePesquisa)) {
                        passageiroEncontrado = true;
                        System.out.println("Passageiro " + nomePesquisa + " encontrado no avião " + numerosavioes[i]);
                        break;
                    }
                }
                if (!passageiroEncontrado) {
                    System.out.println("Passageiro não encontrado.");
                }
                break;
            case 7:
                // Mostrar resumo
                System.out.println("Resumo das reservas:");
                for (int i = 0; i < quantidadeAvioes; i++) {
                    if (nomespassageiros[i] != null) {
                        System.out.println("Passageiro: " + nomespassageiros[i] + " | Avião: " + numerosavioes[i]);
                    }
                }
                break;
            case 8:
                System.out.println("Sistema encerrado. Até logo!");
                break;
            default:
                System.out.println("Opção inválida!");
            }
        } while (opcao != 8);
        }
    }

    


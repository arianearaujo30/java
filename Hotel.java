import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Limites máximos definidos pelo sistema
        int maxQuartos = 5;
        int maxReservas = 25;

        // Arrays para os quartos
        int[] numeroQuartos = new int[maxQuartos];
        int[] camasDisponiveis = new int[maxQuartos];
        int qtdQuartosCadastrados = 0;

        // Arrays para as reservas
        String[] nomesHospedes = new String[maxReservas];
        int[] quartosReservados = new int[maxReservas];
        int totalReservas = 0;

        int opcao = 0;

        while (opcao != 6) {
            // Exibição do Menu
            System.out.println("=== SUNSTAY HOTÉIS ===");
            System.out.println("1 – Registrar número dos quartos");
            System.out.println("2 – Registrar quantidade de camas");
            System.out.println("3 – Reservar quarto");
            System.out.println("4 – Consultar reservas por quarto");
            System.out.println("5 – Consultar reservas por hóspede");
            System.out.println("6 – Encerrar sistema");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    // 1 – Registrar número dos quartos
                    System.out.print("\nDigite a quantidade de quartos (máximo 5): ");
                    int qtd = scanner.nextInt();
                    scanner.nextLine();

                    if (qtd > 0 && qtd <= maxQuartos) {
                        qtdQuartosCadastrados = qtd;
                        for (int i = 0; i < qtdQuartosCadastrados; i++) {
                            System.out.print("Digite o número do Quarto " + (i + 1) + ": ");
                            numeroQuartos[i] = scanner.nextInt();
                        }
                        scanner.nextLine();
                        System.out.println("Quartos registrados com sucesso!\n");
                    } else {
                        System.out.println("Quantidade inválida! Máximo de 5 quartos.\n");
                    }
                    break;

                case 2:
                    // 2 – Registrar quantidade de camas
                    if (qtdQuartosCadastrados == 0) {
                        System.out.println("\nCadastre os quartos primeiro (Opção 1)!\n");
                    } else {
                        System.out.println();
                        for (int i = 0; i < qtdQuartosCadastrados; i++) {
                            System.out.print("Quarto " + numeroQuartos[i] + " -> quantidade de camas: ");
                            camasDisponiveis[i] = scanner.nextInt();
                        }
                        scanner.nextLine();
                        System.out.println("Camas registradas com sucesso!\n");
                    }
                    break;

                case 3:
                    // 3 – Reservar quarto
                    if (totalReservas >= maxReservas) {
                        System.out.println("\nLimite total de reservas (25) atingido!\n");
                        break;
                    }

                    System.out.print("\nNúmero do quarto: ");
                    int numQuartoReserva = scanner.nextInt();
                    scanner.nextLine();

                    // Procura o índice do quarto no array
                    int indiceQuarto = -1;
                    for (int i = 0; i < qtdQuartosCadastrados; i++) {
                        if (numeroQuartos[i] == numQuartoReserva) {
                            indiceQuarto = i;
                            break;
                        }
                    }

                    // Validação 1: Quarto existe?
                    if (indiceQuarto == -1) {
                        System.out.println("Este quarto não existe!\n");
                        break;
                    }

                    // Validação 2: Tem camas disponíveis?
                    if (camasDisponiveis[indiceQuarto] <= 0) {
                        System.out.println("Não há camas disponíveis neste quarto!\n");
                        break;
                    }

                    // Se passou nas validações, registra a reserva
                    System.out.print("Nome do hóspede: ");
                    String nomeHospede = scanner.nextLine();

                    nomesHospedes[totalReservas] = nomeHospede;
                    quartosReservados[totalReservas] = numQuartoReserva;
                    totalReservas++;

                    // Atualiza a quantidade de camas
                    camasDisponiveis[indiceQuarto]--;

                    System.out.println("Reserva realizada com sucesso!\n");
                    break;

                case 4:
                    // 4 – Consultar reservas por quarto
                    System.out.print("\nNúmero do quarto: ");
                    int numQuartoConsulta = scanner.nextInt();
                    scanner.nextLine();

                    // Verifica se o quarto existe
                    boolean quartoExiste = false;
                    for (int i = 0; i < qtdQuartosCadastrados; i++) {
                        if (numeroQuartos[i] == numQuartoConsulta) {
                            quartoExiste = true;
                            break;
                        }
                    }

                    if (!quartoExiste) {
                        System.out.println("Este quarto não existe!\n");
                        break;
                    }

                    // Procura reservas para esse quarto
                    boolean temReservaQuarto = false;
                    for (int i = 0; i < totalReservas; i++) {
                        if (quartosReservados[i] == numQuartoConsulta) {
                            System.out.println("- " + nomesHospedes[i]);
                            temReservaQuarto = true;
                        }
                    }

                    if (!temReservaQuarto) {
                        System.out.println("Não há reservas para este quarto!");
                    }
                    System.out.println();
                    break;

                case 5:
                    // 5 – Consultar reservas por hóspede
                    System.out.print("\nNome do hóspede: ");
                    String nomeConsulta = scanner.nextLine();

                    boolean temReservaHospede = false;
                    for (int i = 0; i < totalReservas; i++) {
                        if (nomesHospedes[i].equalsIgnoreCase(nomeConsulta)) {
                            System.out.println("- Quarto " + quartosReservados[i]);
                            temReservaHospede = true;
                        }
                    }

                    if (!temReservaHospede) {
                        System.out.println("Não há reservas para este hóspede!");
                    }
                    System.out.println();
                    break;

                case 6:
                    // 6 – Encerrar sistema
                    System.out.println("\nSistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!\n");
            }
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class atividadehotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Limites máximos do sistema
        final int MAX_QUARTOS = 5;
        final int MAX_RESERVAS = 25;

        // Arrays para guardar as informações dos quartos
        int[] numerosQuartos = new int[MAX_QUARTOS];
        int[] camasDisponiveis = new int[MAX_QUARTOS];
        int qtdQuartosCadastrados = 0;

        // Arrays para guardar as informações das reservas
        int[] reservaQuarto = new int[MAX_RESERVAS];
        String[] reservaHospede = new String[MAX_RESERVAS];
        int qtdReservas = 0;

        // Solicita a quantidade de quartos do hotel
        System.out.print("Informe a quantidade de quartos do hotel (máximo 5): ");
        qtdQuartosCadastrados = scanner.nextInt();

        while (qtdQuartosCadastrados < 1 || qtdQuartosCadastrados > MAX_QUARTOS) {
            System.out.print("Quantidade inválida! Digite um valor entre 1 e 5: ");
            qtdQuartosCadastrados = scanner.nextInt();
        }

        int opcao = 0;

        do {
            System.out.println("\n=== REDE DE HOTÉIS SUNSTAY ===");
            System.out.println("1 - Registrar número dos quartos");
            System.out.println("2 - Registrar quantidade de camas");
            System.out.println("3 - Reservar quarto");
            System.out.println("4 - Consultar reservas por quarto");
            System.out.println("5 - Consultar reservas por hóspede");
            System.out.println("6 - Encerrar sistema");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {

                case 1:
                    System.out.println("\n--- Cadastrar Números dos Quartos ---");
                    for (int i = 0; i < qtdQuartosCadastrados; i++) {
                        System.out.print("Digite o número do quarto " + (i + 1) + ": ");
                        numerosQuartos[i] = scanner.nextInt();
                    }
                    System.out.println("Quartos registrados com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Cadastrar Quantidade de Camas ---");
                    for (int i = 0; i < qtdQuartosCadastrados; i++) {
                        System.out.print("Quantidade de camas no quarto " + numerosQuartos[i] + ": ");
                        camasDisponiveis[i] = scanner.nextInt();
                    }
                    System.out.println("Camas registradas com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- Reservar Quarto ---");
                    if (qtdReservas >= MAX_RESERVAS) {
                        System.out.println("Limite máximo de reservas atingido!");
                        break;
                    }

                    System.out.print("Digite o número do quarto: ");
                    int numQuartoReserva = scanner.nextInt();
                    scanner.nextLine(); // Limpa buffer

                    // Procura se o quarto existe
                    int indiceQuarto = -1;
                    for (int i = 0; i < qtdQuartosCadastrados; i++) {
                        if (numerosQuartos[i] == numQuartoReserva) {
                            indiceQuarto = i;
                            break;
                        }
                    }

                    // Validações
                    if (indiceQuarto == -1) {
                        System.out.println("Este quarto não existe!");
                    } else if (camasDisponiveis[indiceQuarto] <= 0) {
                        System.out.println("Não há camas disponíveis neste quarto!");
                    } else {
                        System.out.print("Digite o nome do hóspede: ");
                        String nomeHospede = scanner.nextLine();

                        // Registra a reserva
                        reservaQuarto[qtdReservas] = numQuartoReserva;
                        reservaHospede[qtdReservas] = nomeHospede;
                        qtdReservas++;

                        // Atualiza as camas
                        camasDisponiveis[indiceQuarto]--;

                        System.out.println("Reserva realizada com sucesso!");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Consultar Reservas por Quarto ---");
                    System.out.print("Digite o número do quarto: ");
                    int quartoConsulta = scanner.nextInt();

                    // Verifica se o quarto existe
                    boolean quartoExiste = false;
                    for (int i = 0; i < qtdQuartosCadastrados; i++) {
                        if (numerosQuartos[i] == quartoConsulta) {
                            quartoExiste = true;
                            break;
                        }
                    }

                    if (!quartoExiste) {
                        System.out.println("Este quarto não existe!");
                    } else {
                        boolean encontrouReserva = false;
                        for (int i = 0; i < qtdReservas; i++) {
                            if (reservaQuarto[i] == quartoConsulta) {
                                System.out.println("Hóspede: " + reservaHospede[i]);
                                encontrouReserva = true;
                            }
                        }

                        if (!encontrouReserva) {
                            System.out.println("Não há reservas para este quarto!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n--- Consultar Reservas por Hóspede ---");
                    System.out.print("Digite o nome do hóspede: ");
                    String nomeConsulta = scanner.nextLine();

                    boolean encontrouHospede = false;
                    for (int i = 0; i < qtdReservas; i++) {
                        if (reservaHospede[i].equalsIgnoreCase(nomeConsulta)) {
                            System.out.println("Reserva encontrada - Quarto: " + reservaQuarto[i]);
                            encontrouHospede = true;
                        }
                    }

                    if (!encontrouHospede) {
                        System.out.println("Não há reservas para este hóspede!");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 6);

        scanner.close();
    }
}

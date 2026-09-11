import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Cachorro cachorro = null;
        Gato gato = null;
        
        int opcao;

        do {
            System.out.println("\n===== CLÍNICA VETERINÁRIA =====");
            System.out.println("1 - Cadastrar Cachorro");
            System.out.println("2 - Cadastrar Gato");
            System.out.println("3 - Mostrar dados do Cachorro");
            System.out.println("4 - Mostrar dados do Gato");
            System.out.println("5 - Fazer Cachorro emitir som");
            System.out.println("6 - Fazer Gato emitir som");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = s.nextInt();
            sc.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Cachorro: ");
                    String nomeCachorro = sc.nextLine();
                    System.out.print("Idade do Cachorro: ");
                    int idadeCachorro = sc.nextInt();
                    sc.nextLine(); // Limpar buffer
                    System.out.print("Raça do Cachorro: ");
                    String raca = sc.nextLine();
                    
                    cachorro = new Cachorro(nomeCachorro, idadeCachorro, raca);
                    System.out.println("Cachorro cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do Gato: ");
                    String nomeGato = s.nextLine();
                    System.out.print("Idade do Gato: ");
                    int idadeGato = sc.nextInt();
                    sc.nextLine(); // Limpar buffer
                    System.out.print("Cor do Gato: ");
                    String cor = sc.nextLine();
                    
                    gato = new Gato(nomeGato, idadeGato, cor);
                    System.out.println("Gato cadastrado com sucesso!");
                    break;

                case 3:
                    if (cachorro != null) {
                        System.out.println("\n--- Dados do Cachorro ---");
                        cachorro.exibirInfo();
                    } else {
                        System.out.println("Nenhum cachorro cadastrado ainda!");
                    }
                    break;

                case 4:
                    if (gato != null) {
                        System.out.println("\n--- Dados do Gato ---");
                        gato.exibirInfo();
                    } else {
                        System.out.println("Nenhum gato cadastrado ainda!");
                    }
                    break;

                case 5:
                    if (cachorro != null) {
                        cachorro.emitirSom();
                    } else {
                        System.out.println("Nenhum cachorro cadastrado ainda!");
                    }
                    break;

                case 6:
                    if (gato != null) {
                        gato.emitirSom();
                    } else {
                        System.out.println("Nenhum gato cadastrado ainda!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}

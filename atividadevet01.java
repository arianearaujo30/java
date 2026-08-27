import java.util.Scanner;

public class atividadevet01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Configuração e controle do array
        final int CAPACIDADE_MAXIMA = 5;
        String[] nomes = new String[CAPACIDADE_MAXIMA];
        int[] quantidades = new int[CAPACIDADE_MAXIMA];
        int qtd = 0; // Controla a quantidade atual de produtos cadastrados

        int opcao = 0;

        do {
            System.out.println("\n=== SISTEMA DE CONTROLE DE ESTOQUE ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Sair do sistema");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    // 1 - Cadastrar produto
                    if (qtd >= CAPACIDADE_MAXIMA) {
                        System.out.println("Erro: Limite máximo de " + CAPACIDADE_MAXIMA + " produtos atingido!");
                    } else {
                        System.out.print("Digite o nome do produto: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite a quantidade em estoque: ");
                        int quantidade = scanner.nextInt();
                        scanner.nextLine();

                        nomes[qtd] = nome;
                        quantidades[qtd] = quantidade;
                        qtd++;

                        System.out.println("Produto cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    // 2 - Listar produtos
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("\n--- Lista de Produtos ---");
                        for (int i = 0; i < qtd; i++) {
                            System.out.println("Índice: " + i + " | Nome: " + nomes[i] + " | Quantidade: " + quantidades[i]);
                        }
                    }
                    break;

                case 3:
                    // 3 - Pesquisar produto
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado para pesquisar.");
                    } else {
                        System.out.print("Digite o nome do produto para buscar: ");
                        String busca = scanner.nextLine();
                        boolean encontrado = false;

                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(busca)) {
                                System.out.println("Produto encontrado!");
                                System.out.println("Índice: " + i + " | Nome: " + nomes[i] + " | Quantidade: " + quantidades[i]);
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    break;

                case 4:
                    // 4 - Alterar produto
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado para alterar.");
                    } else {
                        System.out.print("Digite o nome do produto que deseja alterar: ");
                        String buscaAlt = scanner.nextLine();
                        int indiceEncontrado = -1;

                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(buscaAlt)) {
                                indiceEncontrado = i;
                                break;
                            }
                        }

                        if (indiceEncontrado != -1) {
                            System.out.print("Digite o novo nome do produto: ");
                            nomes[indiceEncontrado] = scanner.nextLine();
                            System.out.print("Digite a nova quantidade: ");
                            quantidades[indiceEncontrado] = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Produto alterado com sucesso!");
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    break;

                case 5:
                    // 5 - Remover produto
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado para remover.");
                    } else {
                        System.out.print("Digite o nome do produto que deseja remover: ");
                        String buscaRem = scanner.nextLine();
                        int indiceRemover = -1;

                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(buscaRem)) {
                                indiceRemover = i;
                                break;
                            }
                        }

                        if (indiceRemover != -1) {
                            // Desloca os elementos para a esquerda para não deixar lacunas
                            for (int i = indiceRemover; i < qtd - 1; i++) {
                                nomes[i] = nomes[i + 1];
                                quantidades[i] = quantidades[i + 1];
                            }

                            // Limpa a última posição após o deslocamento
                            nomes[qtd - 1] = null;
                            quantidades[qtd - 1] = 0;

                            // Decrementa o controle de quantidade
                            qtd--;

                            System.out.println("Produto removido com sucesso!");
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    break;

                case 6:
                    // 6 - Sair
                    System.out.println("Saindo do sistema... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 6);

        scanner.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("\n========= AGENDA DE CONTATOS =========");
            System.out.println("1 - Cadastrar contato pessoal");
            System.out.println("2 - Cadastrar contato profissional");
            System.out.println("3 - Cadastrar contato emergência (Desafio)");
            System.out.println("4 - Listar todos os contatos");
            System.out.println("5 - Pesquisar contato");
            System.out.println("6 - Alterar contato");
            System.out.println("7 - Excluir contato");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeP = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telP = sc.nextLine();
                    System.out.print("Parentesco: ");
                    String parentesco = sc.nextLine();

                    contatos.add(new ContatoPessoal(nomeP, telP, parentesco));
                    System.out.println("Contato Pessoal cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeProf = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telProf = sc.nextLine();
                    System.out.print("Empresa: ");
                    String empresa = sc.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();

                    contatos.add(new ContatoProfissional(nomeProf, telProf, empresa, cargo));
                    System.out.println("Contato Profissional cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.print("Nome: ");
                    String nomeE = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telE = sc.nextLine();
                    System.out.print("Prioridade (ex: Alta, Média, Baixa): ");
                    String prioridade = sc.nextLine();

                    contatos.add(new ContatoEmergencia(nomeE, telE, prioridade));
                    System.out.println("Contato de Emergência cadastrado com sucesso!");
                    break;

                case 4:
                    System.out.println("\n--- LISTA DE CONTATOS ---");
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        for (int i = 0; i < contatos.size(); i++) {
                            System.out.print((i + 1) + " - ");
                            contatos.get(i).exibirInformacoes();
                            System.out.println("----------------------------------------");
                        }
                    }
                    break;

                case 5:
                    System.out.print("Digite o nome para pesquisar: ");
                    String nomeBusca = sc.nextLine();
                    boolean encontrado = false;

                    for (Contato c : contatos) {
                        if (c.getNome().equalsIgnoreCase(nomeBusca)) {
                            System.out.println("\nContato encontrado!");
                            c.exibirInformacoes();
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Contato não encontrado!");
                    }
                    break;

                case 6:
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado para alterar.");
                        break;
                    }

                    System.out.println("\n--- LISTA DE CONTATOS ---");
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println((i + 1) + " - " + contatos.get(i).getNome());
                    }

                    System.out.print("Informe o número do contato que deseja alterar: ");
                    int indiceAlterar = sc.nextInt() - 1;
                    sc.nextLine(); // Limpa o buffer

                    if (indiceAlterar >= 0 && indiceAlterar < contatos.size()) {
                        System.out.print("Novo Nome: ");
                        String novoNome = sc.nextLine();
                        System.out.print("Novo Telefone: ");
                        String novoTel = sc.nextLine();

                        Contato contato = contatos.get(indiceAlterar);
                        contato.setNome(novoNome);
                        contato.setNumero(novoTel);

                        System.out.println("Contato alterado com sucesso!");
                    } else {
                        System.out.println("Contato inválido!");
                    }
                    break;

                case 7:
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado para excluir.");
                        break;
                    }

                    System.out.println("\n--- LISTA DE CONTATOS ---");
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println((i + 1) + " - " + contatos.get(i).getNome());
                    }

                    System.out.print("Informe o número do contato que deseja excluir: ");
                    int indiceExcluir = sc.nextInt() - 1;
                    sc.nextLine(); // Limpa o buffer

                    if (indiceExcluir >= 0 && indiceExcluir < contatos.size()) {
                        contatos.remove(indiceExcluir);
                        System.out.println("Contato excluído com sucesso!");
                    } else {
                        System.out.println("Contato inválido!");
                    }
                    break;

                case 8:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 8);

        sc.close();
    }
}
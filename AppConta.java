
import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroConta cadastro = new CadastroConta();
        
        int opcao = 0;
        do {
            System.err.println("\n=======Cadastro de Contas Bancárias=======");
            System.err.println("1. Inserir conta");
            System.err.println("2. Buscar conta");
            System.err.println("3. Remover conta");
            System.err.println("4. Exibir quantidade de contas");
            System.err.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:

                    System.out.print("Digite o nome do titular: ");
                    String nomeTitular = sc.nextLine();
                    System.out.print("Digite o número da conta: ");
                    String numeroConta = sc.nextLine();
                    System.out.print("Digite o saldo inicial: ");
                    double saldo = sc.nextDouble();
                    sc.nextLine(); // Limpar o buffer

                    try {
                        Conta novaConta = new Conta(nomeTitular, numeroConta, saldo);
                        cadastro.inserir(novaConta);
                        System.out.println("Conta cadastrada com sucesso!");
                    } catch (ExcecaoElementoJaExistente e) {
                        System.err.println(e.getMessage());
                    } catch (ExcecaoRepositorio e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                    case 2:
                    System.out.print("Digite o número da conta para buscar: ");
                    String numeroContaBusca = sc.nextLine();
                    try {
                        Conta contaEncontrada = cadastro.buscar(numeroContaBusca);
                        System.out.println("Conta encontrada:");
                        System.out.println("Titular: " + contaEncontrada.getNomeTitular());
                        System.out.println("Número da conta: " + contaEncontrada.getNumeroConta());
                        System.out.println("Saldo: " + contaEncontrada.getSaldo());
                    } catch (ExcecaoElementoInexistente e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Digite o número da conta para remover: ");
                    String numeroContaRemover = sc.nextLine();
                    try {
                        cadastro.remover(numeroContaRemover);
                        System.out.println("Conta removida com sucesso!");
                    } catch (ExcecaoElementoInexistente e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                case 4:
                    int quantidade = cadastro.quantidadeContas();
                    System.out.println("Quantidade de contas cadastradas: " + quantidade);
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

            }
        } while (opcao != 0);
        sc.close();
    }

}
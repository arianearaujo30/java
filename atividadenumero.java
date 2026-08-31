import java.util.Scanner;

public class atividadenumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int quantidade = 0;
        int opcao = 0;

        do{
            System.out.println("\n---Menu---");
            System.out.println("1-Inserir número");
            System.out.println("2-Listar número");
            System.out.println("3- Remover número");
            System.out.println("4-Sair");
            System.out.println("Escolha uma opção");
            
            opcao = sc.nextInt();
        

            switch (opcao){
                case 1:
                    if (quantidade < 5) {
                        System.out.println("Digite um número:");
                        numeros[quantidade] = sc.nextInt();
                        quantidade++;
                        System.out.println("Cadastrado com sucesso");

                    } else{
                        System.out.println("Erro: O array estar cheio");
                    }
                    break;

                    case 2:
                        if (quantidade == 0) {
                            System.out.println("Não exite números cadastrados");

                        } else{
                            for(int i=0;i<quantidade;i++){
                                System.out.println("Indice[+i+]=" + numeros[i]);
                            }
                        }
                        break;

                        case 3:
                            if(quantidade==0){
                                System.out.println("O array estar vazio!");
                            } else{
                                System.out.println("Digite o índice que deseja remover:");
                                int pos = sc.nextInt();
                                if(pos >= 0 && pos < quantidade){
                                    for(int i = pos; i <quantidade -1;i++){
                                        numeros[i] = numeros[i+1];
                                    }
                                    quantidade--;
                                    System.out.println(("Número removido!"));
                                }else{
                                    System.out.println("Indice inválido!");
                                }
                            }
                            break;

                        case 4:
                            System.out.println(("Saindo!"));
                            break;
                            
                        default:
                            System.out.println("Opção inválida!");    
                        }
                } while (opcao != 4);

        

        
            sc.close();
    }
}

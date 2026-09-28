
import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int op= -1;

        while(op!=0){
            try {
                System.err.println("\n====MENU====");
                System.err.println("1-Adicionar");
                System.err.println("2-Listar");
                System.err.println("3-Remover");
                System.err.println("0-Sair");
                System.err.println("Informe a opçãp:");
                op=sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        System.out.println("Informe o nome:");
                        String nome =sc.nextLine();
                        lista.add(nome);
                        System.out.println("Adicionado com sucesso!");
                        break;
                    default:
                        throw new AssertionError();
                }
            } catch ( e) {
            } finally {
            }
        }
    }
}

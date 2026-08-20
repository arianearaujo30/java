import java.util.Scanner;

public class atividadeWH01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha="";
        
        do{
            System.out.println("Digite a senha:");
            senha = sc.nextLine();
        }while (!senha.equals("2024"));
        System.out.println("Acesso permitido.");
        sc.close();
    }
}

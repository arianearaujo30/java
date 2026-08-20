import java.util.Scanner;

public class cod03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha="";
        while (!senha.equals("123456")) {
            System.out.println("Digite a senha:");
            senha = sc.nextLine();
        }
        System.out.println("Acesso permitido.");


        sc.close();
    }
}

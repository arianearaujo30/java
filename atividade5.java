import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha para abrir a porta:");
        String senha = sc.nextLine();

        if (senha.equals("123456")) {
            System.out.println("Porta aberta!");
        } else {
            System.out.println("Senha incorreta!");
        }
        sc.close();
    }
}

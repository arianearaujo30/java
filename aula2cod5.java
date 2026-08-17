import java.util.Scanner;

public class aula2cod5 {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome:");
        String nome = sc.nextLine();
        
        System.out.println("Informe a senha:");
        String senha = sc.nextLine();

        if (nome.equals("Raquel") && senha.equals("1234")) {
        sc.close();
    }
}
}

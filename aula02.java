import java.util.Scanner;

public class aula02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Informar a idade:");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você não é maior de idade");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua idade:");
        int idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida");
        } else if (idade <= 12) {
            System.out.println("Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        } else if (idade >= 60) {
            System.out.println("Idoso");
        }
        sc.close();
    }
}
    


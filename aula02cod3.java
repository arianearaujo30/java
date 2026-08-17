import java.util.Scanner;

public class aula02cod3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informar a idade");
        double idade = sc.nextDouble();

            System.out.println("É estudante? Digite 1 para Sim ou 0 para Não");
            int estudante = sc.nextInt();

            if (idade>=60 || estudante==1) {
                System.out.println("Você tem direito ao desconto");
            } else {
                System.out.println("Você não tem direito ao desconto");
            }
            sc.close();
        }
    }


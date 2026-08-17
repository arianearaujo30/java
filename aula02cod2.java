import java.util.Scanner;

public class aula02cod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informar a nota do aluno");
        double nota = sc.nextDouble();

        System.out.println("Informar a frequência do aluno");
        double frequencia = sc.nextDouble();
        
        if (nota >= 7 && frequencia >= 75) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno não foi aprovado.");
        }
        sc.close();
    }
}

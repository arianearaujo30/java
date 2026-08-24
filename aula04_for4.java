import java.util.Scanner;

public class aula04_for4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        for(int i=1;i<=3;i++){
        System.out.println("Informe o "+i+"º");
        int numero=sc.nextInt();
        System.out.println("O número informado é:"+numero);
        }
        sc.close();
    }
}

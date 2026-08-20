import java.util.Scanner;

public class cod02while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número");
        int limite = sc.nextInt();

        int numero = 1;
        while (numero<=limite) {
            System.out.println(numero);
            numero++;
        }
    }
}
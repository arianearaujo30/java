    import java.util.Scanner;
    
    public class atividadediversao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número positivo (ou um negativo para sair): ");
        double numero = scanner.nextDouble();
        
        while (numero >= 0) {
            System.out.println("Você digitou o número: " + numero);
            numero = scanner.nextDouble();
        }
        
        System.out.println("Programa encerrado!");
        scanner.close();
    }
}


import java.util.Scanner;

public class atividadediversao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do professor mais fofo do SENAI: ");
        String nome = scanner.nextLine();
        
        while (!nome.equals("Anderson")) {
            System.out.print("Digite o nome do professor mais fofo do SENAI: ");
            nome = scanner.nextLine();
        }
        
        System.out.println("Muito Bem!");
        scanner.close();
    }
}

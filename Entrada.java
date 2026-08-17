import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        // Adicionado o ';' no final destas linhas
        System.out.println("informe N1:");
        double N1 = sc.nextDouble();
        
        System.out.println("informe N2:");
        double N2 = sc.nextDouble();
        
        double media = (N1 + N2) / 2;
        
        // Espaços adicionados para não colar as palavras
        System.out.println("Olá, " + nome + "! A média é: " + media);
        
        sc.close();
    }
}
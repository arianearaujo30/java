import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        /*String nome = "Ariane"; 
        System.out.println(nome.toUpperCase());*/

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o nome:");
        String nome = sc.nextLine();
        System.out.println(nome.toUpperCase());
        System.out.println("Nome em maiusculo: " + nome);
    sc.close();
    }
}

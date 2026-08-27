import java.util.Scanner;

public class vey06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes;
        int[] idades;

        System.out.println("Quantas pessoas deseja cadastrar?");
        int quantidade = sc.nextInt();
        sc.nextLine(); // Limpar o buffer

        nomes = new String[quantidade];
        idades = new int[quantidade];

        for(int i=0; i<quantidade; i++){
            System.out.println("Digite o nome da pessoa " + (i+1) + ":");
            nomes[i] = sc.nextLine();

            System.out.println("Digite a idade de " + nomes[i] + ":");
            idades[i] = sc.nextInt();
            sc.nextLine();//Limpar o buffer
            for(int j=0; j<quantidade; j++){
                System.out.println(nomes[j]+" - "+idades[j]+" anos");
            }

        sc.close();
    }
}
}
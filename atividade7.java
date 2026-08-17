    
    import java.util.Scanner;
        public class atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preços associados às cores (Ajuste conforme a sua tabela)
        double precoVerde = 10.00;
        double precoAzul = 20.00;
        double precoAmarelo = 30.00;
        double precoVermelho = 40.00;

        System.out.print("Digite a cor do CD (Verde, Azul, Amarelo, Vermelho): ");
        String cor = scanner.nextLine().trim().toLowerCase();

        // Estrutura para verificar a cor e exibir o preço correspondente
        switch (cor) {
            case "verde":
                System.out.printf("O preço do CD Verde é: R$ 10.00", precoVerde);
                break;
            case "azul":
                System.out.printf("O preço do CD Azul é: R$ 20.00", precoAzul);
                break;
            case "amarelo":
                System.out.printf("O preço do CD Amarelo é: R$ 30.00", precoAmarelo);
                break;
            case "vermelho":
                System.out.printf("O preço do CD Vermelho é: R$ 40.00", precoVermelho);
                break;
            default:
                System.out.println("Cor inválida! As opções válidas são: Verde, Azul, Amarelo e Vermelho.");
                break;
        }

        scanner.close();
    }
}


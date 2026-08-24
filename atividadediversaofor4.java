public class atividadediversaofor4 {
    public static void main(String[] args) {
        // Laço externo: varia o número da tabuada (de 1 a 10)
        for (int i = 1; i <= 10; i++) {
            System.out.println("=== Tabuada do " + i + " ===");
            
            // Laço interno: multiplica o número atual pelos multiplicadores (de 1 a 10)
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            
            // Linha em branco para separar visualmente cada tabuada
            System.out.println();
        }
    }
}

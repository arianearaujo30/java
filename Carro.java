public class Carro {
    // Carro.java
public class Carro extends Veiculo {
    public Carro(String placa, String modelo, int ano, double valorDiaria) {
        super(placa, modelo, ano, valorDiaria);
    }

    @Override
    public double calcularLocacao(int dias) {
        return getValorDiaria() * dias;
    }

    @Override
    public double calcularLocacao(int dias, double desconto) {
        return calcularLocacao(dias) - desconto;
    }

    @Override
    public void exibirDados() {
        System.out.println("\n--- Dados do Carro ---");
        super.exibirDados();
    }
}

// Moto.java
public class Moto extends Veiculo {
    public Moto(String placa, String modelo, int ano, double valorDiaria) {
        super(placa, modelo, ano, valorDiaria);
    }

    public double calcularLocacao(int dias) {
        return getValorDiaria() * dias;
    }

    public double calcularLocacao(int dias, double desconto) {
        return calcularLocacao(dias) - desconto;
    }

    public void exibirDados() {
        System.out.println("\n--- Dados da Moto ---");
        super.exibirDados();
    }
}
}

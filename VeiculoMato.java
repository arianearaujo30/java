public class VeiculoMato extends Veiculo {
    private int cilindrada;

    public VeiculoMato(String marca, int ano, int cilindrada) {
        super(marca, ano);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindrada: " + cilindrada);
    }
}
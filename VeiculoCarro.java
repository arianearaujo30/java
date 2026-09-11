public class VeiculoCarro extends Veiculo {
    private int quantidadeportas;

    public VeiculoCarro(String marca, int ano, int quantidadeportas) {
        super(marca, ano);
        this.quantidadeportas = quantidadeportas;
    }

    public int getQuantidadePortas() {
        return quantidadeportas;
    }

    public void setQuantidadePortas(int quantidadeportas) {
        this.quantidadeportas = quantidadeportas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Quantidade de portas: " + quantidadeportas);
    }
}
// ProdutoFisico.java
public class ProdutoFisico extends Produto {
    private double frete;

    public ProdutoFisico(int codigo, String nome, double preco, double frete) {
        super(codigo, nome, preco);
        this.frete = frete;
    }

    public double getFrete() { return frete; }
    public void setFrete(double frete) { this.frete = frete; }

    @Override
    public double realizarVenda(int quantidade) {
        return (getPreco() * quantidade) + frete;
    }

    @Override
    public double realizarVenda(int quantidade, double percentualDesconto) {
        double subtotal = getPreco() * quantidade;
        double valorComDesconto = subtotal - (subtotal * (percentualDesconto / 100));
        return valorComDesconto + frete;
    }

    @Override
    public void exibirDados() {
        System.out.println("\n--- Produto Físico ---");
        super.exibirDados();
        System.out.printf("Valor do Frete: R$ %.2f\n", frete);
    }
}

// ProdutoDigital.java
public class ProdutoDigital extends Produto {

    public ProdutoDigital(int codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    @Override
    public double realizarVenda(int quantidade) {
        return getPreco() * quantidade; // Sem frete
    }

    @Override
    public double realizarVenda(int quantidade, double percentualDesconto) {
        double subtotal = realizarVenda(quantidade);
        return subtotal - (subtotal * (percentualDesconto / 100));
    }

    @Override
    public void exibirDados() {
        System.out.println("\n--- Produto Digital ---");
        super.exibirDados();
        System.out.println("Frete: R$ 0,00 (Produto Digital)");
    }
}
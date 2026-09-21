public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    
    public double calcularPagamento() {
        return getSalario();
    }

    
    public double calcularPagamento(double bonus) {
        return calcularPagamento() + bonus;
    }

    
    public void exibirDados() {
        System.out.println("\n--- Dados do Funcionário CLT ---");
        super.exibirDados();
        System.out.println("Tipo: CLT");
        System.out.println("Salário Mensal: R$ " + getSalario());
    }
}
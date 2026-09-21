// FuncionarioFreelancer.java
public class FuncionarioFreelancer extends Funcionario {
    private int horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioFreelancer(String nome, String cpf, int horasTrabalhadas, double valorPorHora) {
        // Passa 0.0 no salário base da superclasse e calcula com base nas horas
        super(nome, cpf, horasTrabalhadas * valorPorHora);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
        setSalario(this.horasTrabalhadas * this.valorPorHora);
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
        setSalario(this.horasTrabalhadas * this.valorPorHora);
    }

    
    public double calcularPagamento() {
        return horasTrabalhadas * valorPorHora;
    }

    
    public double calcularPagamento(double bonus) {
        return (horasTrabalhadas * valorPorHora) + bonus;
    }

    @Override
    public void exibirDados() {
        System.out.println("\n--- Dados do Funcionário Freelancer ---");
        super.exibirDados();
        System.out.println("Tipo: Freelancer");
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor por Hora: R$ " + valorPorHora);
        System.out.println("Total a Receber: R$ " + calcularPagamento());
    }
}
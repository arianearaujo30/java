public class Tecnico {
    private String nome;
    private String especialidade;
    private double salario;

    public Tecnico(String nome, String especialidade, double salario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Salário: " + salario);
    }
}

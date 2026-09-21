public class Funcionario {
    private String nome;
    private String CPF;
    private double salario;

    public Funcionario(String nome, String CPF, double salario){
    this.nome= nome;
    this.CPF= CPF;
    this.salario= salario;
    }

    public String getNome(){
        return  nome;
    }

    public void setNome(String nome){
        this.nome= nome;
    }

    public String getCPF(){
        return CPF;
    }

    public void setCpf(){
        this.CPF= CPF;
    }

    public double getSalario(double salario){
        return salario;
    }

    public void setSalario(double salario){
        this.salario= salario;
    }

    public void exibirDados(){
        System.err.println("Digite o seu nome:" + nome);
        System.err.println("Digite o seu CPF:" + CPF);
    }
}

public class Conta {
    private String nomeTitular;
    private String numeroConta;
    private double saldo;

    public Conta(String nomeTitular, String numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;

        if (nomeTitular == null || nomeTitular.isEmpty()) {
            throw new IllegalArgumentException("O nome do titular não pode ser nulo ou vazio.");
        }
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;

        if (numeroConta == null || numeroConta.isEmpty()) {
            throw new IllegalArgumentException("O número da conta não pode ser nulo ou vazio.");
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

        if (saldo < 0) {
            throw new IllegalArgumentException("O saldo não pode ser negativo.");
        }
    this.saldo = saldo;
    }
}
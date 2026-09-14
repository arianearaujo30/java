public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero){
        this.nome=nome;
    this.numero=numero;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome= nome;
    }
    public String getNumero(){
        return  numero;
    }
    public void setNumero(){
        this.numero= numero;
    }
    public void exibirInformacoes() {
        System.out.println("Nome:" + nome);
        System.out.println("Telefone:" + numero);
    }
}


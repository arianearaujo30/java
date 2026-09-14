public class ContatoPessoal extends Contato {
    private String parentesco;

    public ContatoPessoal(String nome, String numero, String parentesco){
        super(nome, numero);
    this.parentesco = parentesco;
    }
    public String getParentesco(){
        return parentesco;
    }
    public void setParentesco(){
        this.parentesco= parentesco;
    }
    @Override 
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Tipo: Pessoal");
        System.out.println("Parentesco" + parentesco);
    }
}
public class ContatoEmergencia extends Contato {
    private String prioridade;

    public ContatoEmergencia(String nome, String numero, String prioridade) {
        super(nome, numero);
        this.prioridade = prioridade;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo: Emergência");
        System.out.println("Prioridade: " + prioridade);
    }
}

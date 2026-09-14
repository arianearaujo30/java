public class ContatoProfissional extends Contato {
    private String empresa;
    private String cargo;
    
    public ContatoProfissional(String nome, String numero, String empresa, String cargo){
        super(nome, numero);
        this.empresa= empresa;
        this.cargo = cargo;
    }
    public String getEmpresa(){
        return empresa;
    }
    public  void setEmpresa(){
        this.empresa = empresa;
}
    public String getCargo(){
        return cargo;
    }
    public void setCargo(){
        this.cargo= cargo;
    }
    @Override 
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Tipo: Profissional");
        System.out.println("Empresa:"+ empresa);
        System.out.println("Cargo:"+ cargo);
    }
}
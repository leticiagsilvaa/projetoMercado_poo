package classes;

public class OperadorDeCaixa extends Pessoa {
    protected int idCaixa;
    private String endereco;
    private String telefone;

    public OperadorDeCaixa(String cpf, String nome, String endereco, String telefone, int idCaixa) {
        super(cpf, nome);
        this.endereco = endereco;
        this.telefone = telefone; 
        this.idCaixa = idCaixa;
    }

    public String endereco() {
        return endereco;
    }

    public String telefone() {
        return telefone;
    }

    public int getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // métodos
    public void iniciarAtendimento() {
        System.out.println("Iniciando atendimento no caixa: " + getIdCaixa());
    }

    public void finalizarAtendimento() {
        System.out.println("Compra realizada com sucesso!. Volte sempre, " + getNome());
    }

    public void processarVenda(Venda venda) {
        iniciarAtendimento();
        venda.finalizarCompra();
        finalizarAtendimento();
    }

    public void adicionarProdutoAoEstoque(Produto produto, int quantidade) {
        //ideia
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Informações");
    };

    @Override
    public void atualizarInformacoes(String atributo, String novoValor, int valor){
        switch (atributo) {
            case "nome":
                setNome(novoValor);
                break;
            case "cpf":
                setCpf(novoValor);
                break;
            case "idCaixa":
                setIdCaixa(valor);
                break;
            case "telefone":
                setTelefone(novoValor);
                break;
            case "endereco":
                setEndereco(novoValor);
                break;
            default:
                System.out.println("Atributo desconhecido: " + atributo);
    };
  }
}

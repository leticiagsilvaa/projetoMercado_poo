public class Cliente extends Pessoa {
    private String idCliente;
    private List<Compra> historicoCompras;

    public Cliente(String nome, String endereco, String telefone, String cpf, String idCliente) {
        super(nome, endereco, telefone, cpf);
        this.idCliente = cpf;
        this.historicoCompras = new ArrayList<>();
    }

    //getters
    public int getIdCliente() {
        return idCliente;
    }

    public List<Compra> getHistoricoCompras() {
        return historicoCompras;
    }
    
    //métodos
    public void adicionarAoHistorico() {
        Compra novaCompra = new Compra(produtosComprados, valorTotalCompra); //exemplo de parametros
        historicoCompras.add(novaCompra);
    } 
}

package classes;

public class Cliente extends Pessoa {
    private String idCliente;
    private List<Venda> historicoCompras;

    public Cliente(String nome, String endereco, String telefone, String cpf, String idCliente) {
        super(nome, endereco, telefone, cpf);
        this.idCliente = cpf;
        this.historicoCompras = new ArrayList<>();
    }

    //getters
    public int getIdCliente() {
        return idCliente;
    }

    public List<Venda> getHistoricoCompras() {
        return historicoCompras;
    }
    
    //métodos
    public void adicionarAoHistorico() {
        Venda novaCompra = new Venda(produtosComprados, valorTotalCompra); //exemplo de parametros
        historicoCompras.add(novaCompra);
    } 
}

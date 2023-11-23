package classes;

public class Venda {

    private Carrinho carrinho;
    private OperadorDeCaixa operadorDeCaixa;
    private Pagamento pagamento;
    private Cliente cliente;

    private int idVenda;
    private double valorTotal;

    public Venda(Carrinho carrinho, OperadorDeCaixa operadorDeCaixa, Pagamento pagamento, int idVenda,
            double valorTotal, Cliente cliente) {
        this.carrinho = carrinho;
        this.operadorDeCaixa = operadorDeCaixa;
        this.pagamento = pagamento;
        this.idVenda = idVenda;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

    // Metodos de compra
    public double valorTotal() {
        return this.valorTotal;
    }

    public void finalizarCompra() {
    }

    public void cancelarCompra() {
    }

    public void adicionarAoHistorico() {
        Venda novaCompra = new Venda(produtosComprados, valorTotalCompra); // exemplos de parametros
        cliente.getHistoricoCompras().add(this);
    }

    // Metodos Getters e Setters da classe compra
    public int getIdVenda() {
        return idVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public OperadorDeCaixa getOperadorDeCaixa() {
        return operadorDeCaixa;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public void setOperadorDeCaixa(OperadorDeCaixa operadorDeCaixa) {
        this.operadorDeCaixa = operadorDeCaixa;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

}

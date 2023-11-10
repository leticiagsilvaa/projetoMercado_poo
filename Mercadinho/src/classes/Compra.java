public class Compra {

    private Carrinho carrinho;
    private OperadorCaixa operadorCaixa;
    private Pagamento pagamento;

    private int idVenda;
    private double valorTotal;

    public Compra(Carrinho carrinho, OperadorCaixa operadorCaixa, Pagamento pagamento, int idVenda, double valorTotal) {
        this.carrinho = carrinho;
        this.operadorCaixa = operadorCaixa;
        this.pagamento = pagamento;
        this.idVenda = idVenda;
        this.valorTotal = valorTotal;
    }

    // Metodos de compra
    public double valorTotal() {
    }
    public void finalizarCompra() {
    }
    public void cancelarCompra() {
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
    public OperadorCaixa getOperadorCaixa() {
        return operadorCaixa;
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
    public void setOperadorCaixa(OperadorCaixa operadorCaixa) {
        this.operadorCaixa = operadorCaixa;
    }
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }


}

package classes;

import app.UI;
import pagamentos.Pagamento;

public class Venda {

    private Carrinho carrinho;
    private OperadorDeCaixa operadorDeCaixa;
    private Pagamento pagamento;
    private Cliente cliente;

    private int idVenda;

    public Venda(Carrinho carrinho, OperadorDeCaixa operadorDeCaixa, int idVenda, Cliente cliente) {
        this.carrinho = carrinho;
        this.operadorDeCaixa = operadorDeCaixa;
        this.idVenda = idVenda;
        this.cliente = cliente;
    }

    // Metodos de compra

    public void adicionarAoHistorico(Carrinho carrinho, Pagamento pagamento, int idVenda, double valorTotal) {
        String venda = "Produtos:" + carrinho.getProdutosNoCarrinho() + "Id da venda:" + idVenda + "Valor Total:" + carrinho.getSubTotal();
        cliente.setHistoricoCompras(venda);
    }

    public void cancelarCompra() {
        System.out.println("Venda cancelada.");
        //fazer cancelamento da venda
    }

    public void finalizarCompra() {
       UI.escolherPagamento();
    }

    // Metodos Getters e Setters da classe compra
    public int getIdVenda() {
        return idVenda;
    }

    public double getValorTotal() {
        return carrinho.getSubTotal();
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

     public Cliente getCliente() {
        return cliente;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public void setOperadorDeCaixa(OperadorDeCaixa operadorDeCaixa) {
        this.operadorDeCaixa = operadorDeCaixa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

}

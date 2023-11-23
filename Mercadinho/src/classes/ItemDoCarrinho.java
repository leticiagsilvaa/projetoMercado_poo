package classes;

public class ItemDoCarrinho {
    private Produto produto;
    private int quantidadeItem;
    private double valorRemessa;

    public ItemDoCarrinho(int quantidadeItem, Produto produto, double valorRemessa) {
        this.produto = produto;
        this.quantidadeItem = quantidadeItem;
        calcularRemessa();
    }

    // getters
    public double getValor() {
        return valorRemessa;
    }

    public int getQuantidade() {
        return quantidadeItem;
    }

    // setters
    public void setValor(double valor) {
        this.valorRemessa = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidadeItem = quantidade;
    }

    // métodos
    public double calcularRemessa() {
        valorRemessa = quantidadeItem * produto.getValor();
        return valorRemessa;
    }
}

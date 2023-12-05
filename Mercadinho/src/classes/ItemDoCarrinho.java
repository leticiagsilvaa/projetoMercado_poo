package classes;

public class ItemDoCarrinho {
    private Produto produto;
    private int quantidadeItem;

    public ItemDoCarrinho(int quantidadeItem, Produto produto) {
        this.produto = produto;
        this.quantidadeItem = quantidadeItem;
        verificacaoDeQuantidade();
    }

    //metodos

    public void verificacaoDeQuantidade(){
        if(quantidadeItem > produto.getQuantidadeDisponivel()){
            return false;
        }

        //criar exceção
    }

    // getters
    public double getValor() {
        return produto.getValor();
    }

    public int getQuantidade() {
        return quantidadeItem;
    }

    // setters
    public void setQuantidade(int quantidade) {
        this.quantidadeItem = quantidade;
    }
}

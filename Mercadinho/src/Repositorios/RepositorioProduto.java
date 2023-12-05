package repositorios;

public class RepositorioProduto {

    private Produto produtos[];
    private int quantidadeProdutos;

    public RepositorioProduto(int quantidadeProdutos, int quantidadeMaxima) {
        this.quantidadeProdutos = 0;
        this.produtos = produtos[quantidadeMaxima];
    }

    public void adicionarProduto(Produto produto) {
        if(quantidadeProdutos < produtos.length){
            produtos[quantidadeProdutos] = produto;
            quantidadeProdutos++;
        else{
            return false;
        }
        }
    }

    public void removerProduto(int codigoProduto) {
       for(int i = 0, i < quantidadeProdutos; i++){
        if(produtos[i].getCodigo().equals(codigoProduto){
            produtos[i] = null;
        })
       }
    }

    public Produto buscarProduto(int codigoProduto) {
        for (int i = 0, i < quantidadeProdutos; i++) {
            if (produto[i].getCodigo().equals(codigoProduto)) {
                return produto[i];
            }
        }
        return null; 
    }

    public Produto listarProdutos() {
        return produtos;
    }

    public void atualizarEstoqueProduto(int codigoProduto, int quantidade){
        for (int i = 0, i < quantidadeProdutos; i++) {
            if (produto[i].getCodigo().equals(codigoProduto)) {
                produto[i].setQuantidadeDisponivel(quantidade);
            }
            return null;
    }

}
}

package Repositorios;

import classes.Produto;

public class RepositorioProduto {

    private Produto produtos[];
    private int quantidadeProdutos;

    public RepositorioProduto(int quantidadeProdutos, int tamanhoMaximo) {
        quantidadeProdutos = 0;
        produtos = new Produto[tamanhoMaximo];
    }

    public void adicionarProduto(Produto produto) {
        if(quantidadeProdutos < produtos.length){
            produtos[quantidadeProdutos] = produto;
            quantidadeProdutos++;
        }
    }

    public void removerProduto(int codigoProduto) {
       for(int i = 0; i < quantidadeProdutos; i++){
        if(produtos[i].getCodigo() == codigoProduto){
            produtos[i] = null;
        }
       }
    }

    public Produto buscarProduto(int codigoProduto) {
        for (int i = 0; i < quantidadeProdutos; i++) {
            if (produtos[i].getCodigo() == codigoProduto) {
                return produtos[i];
            }
        }
        return null; 
    }

    public Produto[] listarProdutos() {
        return produtos;
    }

    public void atualizarEstoqueProduto(int codigoProduto, int quantidade){
        for (int i = 0; i < quantidadeProdutos; i++) {
            if (produtos[i].getCodigo() == codigoProduto) {
                produtos[i].setQuantidadeDisponivel(quantidade);
            }
    }
}
}

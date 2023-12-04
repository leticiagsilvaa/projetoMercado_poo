package Repositorio;

import java.util.ArrayList;
import java.util.List;

public class RepositorioProduto {
    private List<Produto> produtos;

    /**
     * 
     */
    public RepositorioProduto() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(int codigoProduto) {
        Produto produtoParaRemover = null;

        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigoProduto) {
                produtoParaRemover = produto;
                break;
            }
        }

        if (produtoParaRemover != null) {
            produtos.remove(produtoParaRemover);
        }
    }

    public Produto buscarProduto(int codigoProduto) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigoProduto) {
                return produto;
            }
        }
        return null; // Produto não encontrado
    }

    public List<Produto> listarProdutos() {
        return new ArrayList<>(produtos); // Retorna uma cópia da lista para evitar modificação externa
    }

    // Outros

}

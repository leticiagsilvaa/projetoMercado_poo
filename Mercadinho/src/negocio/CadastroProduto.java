package negocio;

import Produto;
import Repositorios.RepositorioProduto;

public class CadastroProduto {

    // CRUD
    private RepositorioProduto repositorio;

    public CadastroProduto(RepositorioProduto repositorio) {
        this.repositorio = repositorio;
    }

    public void cadastrar(Produto produto, int codigo, String nome, String categoria, double valor,
            int quantidadeDisponivel) {
        if (produto != null) {
            produto.setCodigo(codigo);
            produto.setNome(nome);
            produto.setCategoria(categoria);
            produto.setValor(valor);
            produto.setQuantidadeDisponivel(quantidadeDisponivel);
        }
    }

    public Produto buscarProduto(int cod) {
        return this.repositorio.buscarProduto(cod);
    }

    public void removerProduto(int cod) {
        this.repositorio.removerProduto(cod);
    }
}

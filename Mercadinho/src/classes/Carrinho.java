package classes;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private Cliente cliente;
    private List<ItemDoCarrinho> produtos  = new ArrayList<>();
    private int idCarrinho;
    private double subTotal;

    public Carrinho(int idCarrinho){
        this.idCarrinho = idCarrinho;
        this.subTotal = 0.0;
    }
    
    // Métodos de carrinho

    public void adicionarAoCarrinho(ItemDoCarrinho item) {
        produtos.add(item);
        subTotal += item.getValor() * item.getQuantidade();
    }

    public void removerDoCarrinho(ItemDoCarrinho item) {
        produtos.remove(item);
        subTotal -= item.getValor();
    }

    public void esvaziarCarrinho() {
        produtos.clear();
        subTotal = 0.0;
    }

    // Métodos Getters e Setters da classe Carrinho
    public int getIdCarrinho() {
        return idCarrinho;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemDoCarrinho> getProdutosNoCarrinho() {
        return produtos;
    }

    public void setIdCarrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProdutos(List<ItemDoCarrinho> produtos) {
        this.produtos = produtos;
        recalcularSubTotal();
    }

    private void recalcularSubTotal() {
        subTotal = produtos.stream().mapToDouble(ItemDoCarrinho::getValor).sum();
    }
}

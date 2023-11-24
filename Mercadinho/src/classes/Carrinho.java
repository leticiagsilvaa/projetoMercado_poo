package classes;
import java.util.List;

public class Carrinho {
    private Cliente cliente;
    private List<ItemDoCarrinho> produto;
    private Carrinho carrinho;
    private double subTotal;

    public Carrinho(Cliente cliente, List<ItemDoCarrinho> produto, int idCarrinho, double subTotal) {
        this.cliente = cliente;
        this.produto = produto;
        this.idCarrinho = idCarrinho;
        this.subTotal = subTotal;
    }

    // Metodos de carrinho
    // implementar o esvaziar carrinho

    // Metodos Getters e Setters da classe carrinho
    public int getIdCarrinho() {
        return idCarrinho;
    }
    public double getSubTotal() {
        return subTotal;
    }  
    public Cliente getCliente() {
        return cliente;
    }
    public List<ItemDoCarrinho> getItemDoCarrinho() {
        return produto;
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
    public void setItem(List<ItemDoCarrinho> produto) {
        this.produto = produto;
    }
}

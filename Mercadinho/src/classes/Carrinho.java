public class Carrinho {
    private Cliente cliente;
    private ItemDoCarrinho produto;

    private int idCarrinho;
    private double subTotal;

    public Carrinho(Cliente cliente, ItemDoCarrinho produto, int idCarrinho, double subTotal) {
        this.cliente = cliente;
        this.produto = produto;
        this.idCarrinho = idCarrinho;
        this.subTotal = subTotal;
    }

    // Metodos de carrinho
    public void adicionarAoCarrinho(ItemDoCarrinho produto) {
        this.produto = produto;
    }
    public void removerDoCarrinho(ItemDoCarrinho produto) {
        this.produto = null;
    }

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
    public ItemDoCarrinho getItemDoCarrinho() {
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
    public void setItem(ItemDoCarrinho produto) {
        this.produto = produto;
    }
}

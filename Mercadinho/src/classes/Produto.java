
public class Produto {
    private String nomeProduto;
    private int codigoProduto;
    private String categoriaProduto;
    private int quantidadeDisponivel;
    private double valorProduto;

    public Produto(String nomeProduto, int codigoProduto, String categoriaProduto, int quantidadeDisponivel,
            double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.codigoProduto = codigoProduto;
        this.categoriaProduto = categoriaProduto;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.valorProduto = valorProduto;
    }

    // getters
    public int getCodigo() {
        return codigoProduto;
    }

    public double getValor() {
        return valorProduto;
    }

    public String getNome() {
        return nomeProduto;
    }

    public String getCategoria() {
        return categoriaProduto;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    // setters
    public void setCodigo(int codigo) {
        this.codigoProduto = codigo;
    }

    public void setValor(double valor) {
        this.valorProduto = valor;
    }

    public void setNome(String nome) {
        this.nomeProduto = nome;
    }

    public void setCategoria(String categoria) {
        this.categoriaProduto = categoria;
    }

    public void setQuantidadeDisponivel(int quantidade) {
        this.quantidadeDisponivel = quantidade;
    }
}

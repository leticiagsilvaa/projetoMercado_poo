package classes;

public class Produto {
    private String nomeProduto;
    private int codigoProduto;
    private String categoriaProduto;
    private int quantidadeProduto;
    private double valorProduto;

    public Produto(String nomeProduto, int codigoProduto, String categoriaProduto, int quantidadeProduto, double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.codigoProduto = codigoProduto;
        this.categoriaProduto = categoriaProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorProduto = valorProduto;
    }

    //getters
    public int getCodigo(){
        return codigoProduto;
    }
    public double getValor(){
        return valorProduto;
    }
    public String getNome(){
        return nomeProduto;
    }
     public String getCategoria(){
        return categoriaProduto;
    }
     public int getQuantidade(){
        return quantidadeProduto;
    }
    
    //setters
    public void setCodigo(int codigo){
        this.codigoProduto = codigo;
    }
    public void setValor(double valor){
        this.valorProduto = valor;
    }
    public void setNome(String nome){
        this.nomeProduto = nome;
    }
    public void setCategoria(String categoria){
        this.categoriaProduto = categoria;
    }
    public void setQuantidade(int quantidade){
        this.quantidadeProduto = quantidade;
    }
}

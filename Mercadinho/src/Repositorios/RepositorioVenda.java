
public class RepositorioVenda {
    private Venda vendas[];

    public RepositorioVenda(int quantidadeMaxima, int quantidadeVendas) {
        this.vendas = vendas[quantidadeMaxima];
        this.quantidadeVendas = 0;
    }

    public void adicionarVenda(Venda venda) {
        if(quantidadeVendas < vendas.length){
            vendas[quantidadeVendas] = venda;
            quantidadeVendas++;
        }
        else{
            return false;
        }
    }

    public void removerVenda(int idVenda) {
        for(int i = 0; i < quantidadeVendas, i++){
            if(vendas[i].getCodigo().equals(idVenda)){
                vendas[i] = null;
            }
        }
    }

    public Venda buscarVenda(int idVenda) {
        for(int i = 0, i< quantidadeVendas, i++){
            if(vendas[i].getCodigo().equals(idVenda){
                return vendas[i];
            })
        }
    }

    public Venda listarVendas(){
        return vendas;
    }
    }
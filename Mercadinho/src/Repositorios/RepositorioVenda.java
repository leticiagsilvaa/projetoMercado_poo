import java.util.ArrayList;
import java.util.List;

public class RepositorioVenda {
    private List<Venda> vendas;

    public RepositorioVenda() {
        this.vendas = new ArrayList<>();
    }

    public void adicionarVenda(Venda venda) {
        vendas.add(venda);
    }

    public void removerVenda(int idVenda) {
        Venda vendaParaRemover = null;

        for (Venda venda : vendas) {
            if (venda.getIdVenda() == idVenda) {
                vendaParaRemover = venda;
                break;
            }
        }

        if (vendaParaRemover != null) {
            vendas.remove(vendaParaRemover);
        }
    }

    public Venda buscarVenda(int idVenda) {
        for (

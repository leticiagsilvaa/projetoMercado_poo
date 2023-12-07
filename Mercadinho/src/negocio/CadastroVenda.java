package negocio;

import classes.Carrinho;
import classes.Cliente;
import classes.OperadorDeCaixa;
import classes.Venda;
import Repositorios.RepositorioVenda;

public class CadastroVenda {

    //CRUD
    private RepositorioVenda repositorio;

    public CadastroVenda(RepositorioVenda repositorio) {
        this.repositorio = repositorio;
    }

    public void cadastrar(Venda venda, Carrinho carrinho, OperadorDeCaixa operadorDeCaixa, int idVenda, Cliente cliente){
        if(venda != null){
            venda.setCarrinho(carrinho);
            venda.setIdVenda(idVenda);
            venda.setOperadorDeCaixa(operadorDeCaixa);
            venda.setCliente(cliente);
        }
    }

    public Venda buscarVenda(int cod) {
        return this.repositorio.buscarVenda(cod);
        }
        
    public void removerVenda(int cod) {
        this.repositorio.removerVenda(cod);
        }
}
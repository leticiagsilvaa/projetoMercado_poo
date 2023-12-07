package negocio;

import classes.Cliente;
import Repositorios.RepositorioCliente;

public class CadastroCliente {

    //CRUD
    private RepositorioCliente repositorio;

    public CadastroCliente(RepositorioCliente repositorio) {
        this.repositorio = repositorio;
    }

    public void cadastrar(Cliente cliente, String nome, String cpf, int idCliente, String historicoCompras){
        if(cliente != null){
            cliente.setNome(nome);
            cliente.setCpf(cpf);
            cliente.setIdCliente(idCliente);
            cliente.setHistoricoCompras(historicoCompras);
        }
    }

    public Cliente buscarCliente(int cod) {
        return this.repositorio.buscarCliente(cod);
        }
        
    public void removerCliente(int cod) {
        this.repositorio.removerCliente(cod);
        }
}
package Repositorios;

import classes.Cliente;

public class RepositorioCliente {
    
    private Cliente clientes[];
    private int quantidadeClientes;

     public RepositorioCliente(int tamanhoMaximo) {
        clientes = new Cliente[tamanhoMaximo];
        quantidadeClientes = 0;
    }

    public void adicionarCliente(Cliente cliente) {
        if (quantidadeClientes < clientes.length) {
            clientes[quantidadeClientes] = cliente;
            quantidadeClientes++;
        }
    }

    public void removerCliente(int idCliente) {
        for(int i = 0; i < quantidadeClientes; i++){
            if (clientes[i].getIdCliente() == idCliente){
                clientes[i] = null;
            };
        }
    }

    public Cliente buscarCliente(int idCliente) {
        for (int i = 0; i < quantidadeClientes; i++) {
            if (clientes[i].getIdCliente() == idCliente) {
                return clientes[i];
            }
        }
        return null;
    }

     public int buscarIndex(int idCliente) {
        for (int i = 0; i < quantidadeClientes; i++) {
            if (clientes[i].getIdCliente() == idCliente) {
                return i;
            }
        }
        return -1;
    }

    public Cliente[] listarClientes() {
        return clientes;
    }

    public void atualizarCliente(int idCliente, String atributo, String novoValor) {
        int clienteParaAtualizar = buscarIndex(idCliente);

        if (clienteParaAtualizar != -1) {
            switch (atributo) {
                case "nome":
                    clientes[clienteParaAtualizar].setNome(novoValor);
                    break;
                default:
                    System.out.println("Atributo desconhecido: " + atributo);
            }
        } else {
            System.out.println("Cliente não encontrado com ID: " + idCliente);
        }
    }
}
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

    public void removerCliente(String idCliente) {
        for(int i = 0; i < quantidadeClientes; i++){
            if (clientes[i].getIdCliente().equals(idCliente)){
                clientes[i] = null;
            };
        }
    }

    public Cliente buscarCliente(String idCliente) {
        for (int i = 0; i < quantidadeClientes; i++) {
            if (clientes[i].getIdCliente().equals(idCliente)) {
                return clientes[i];
            }
        }
        return null;
    }

     public int buscarIndex(String idCliente) {
        for (int i = 0; i < quantidadeClientes; i++) {
            if (clientes[i].getIdCliente().equals(idCliente)) {
                return i;
            }
        }
        return -1;
    }

    public Cliente[] listarClientes() {
        return clientes;
    }

    public void atualizarCliente(String idCliente, String atributo, String novoValor) {
        int clienteParaAtualizar = buscarIndex(idCliente);

        if (clienteParaAtualizar != -1) {
            switch (atributo) {
                case "nome":
                    clientes[clienteParaAtualizar].setNome(novoValor);
                    break;
                case "cpf":
                    clientes[clienteParaAtualizar].setCpf(novoValor);
                    break;
                case "idCliente":
                    clientes[clienteParaAtualizar].setIdCliente(novoValor);
                    break;
                default:
                    System.out.println("Atributo desconhecido: " + atributo);
            }
        } else {
            System.out.println("Cliente não encontrado com ID: " + idCliente);
        }
    }
}
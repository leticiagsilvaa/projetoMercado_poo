import java.util.ArrayList;
import java.util.List;

public class RepositorioCliente {
    private List<Cliente> clientes;

    public RepositorioCliente() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(String idCliente) {
        Cliente clienteParaRemover = null;

        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente().equals(idCliente)) {
                clienteParaRemover = cliente;
                break;
            }
        }

        if (clienteParaRemover != null) {
            clientes.remove(clienteParaRemover);
        }
    }

    public Cliente buscarCliente(String idCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente().equals(idCliente)) {
                return cliente;
            }
        }
        return null; // Cliente não encontrado
    }

    public List<Cliente> listarClientes() {
        return new ArrayList<>(clientes); // Retorna uma cópia da lista para evitar modificação externa
    }

    public void atualizarCliente(String idCliente, String atributo, String novoValor) {
        Cliente clienteParaAtualizar = buscarCliente(idCliente);

        if (clienteParaAtualizar != null) {
            switch (atributo) {
                case "nome":
                    clienteParaAtualizar.setNome(novoValor);
                    break;
                case "cpf":
                    clienteParaAtualizar.setCpf(novoValor);
                    break;
                case "idCliente":
                    clienteParaAtualizar.setIdCliente(novoValor);
                    break;
                default:
                    System.out.println("Atributo desconhecido: " + atributo);
            }
        } else {
            System.out.println("Cliente não encontrado com ID: " + idCliente);
        }
    }

}

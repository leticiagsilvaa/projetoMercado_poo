package classes;

import java.util.List;
import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String idCliente;
    private List<Venda> historicoCompras;

    public Cliente(String nome, String endereco, String telefone, String cpf, String idCliente) {
        super(nome, endereco, telefone, cpf);
        this.idCliente = idCliente;
        this.historicoCompras = new ArrayList<>();
    }

    // getters
    public String getIdCliente() {
        return idCliente;
    }

    public List<Venda> getHistoricoCompras() {
        return historicoCompras;
    }

    // setters
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setHistoricoCompras(List<Venda> historicoCompras) {
        this.historicoCompras = historicoCompras;
    }

    // métodos
    public void atualizarInformacoes(String atributo, String novoValor) {
        switch (atributo) {
            case "nome":
                setNome(novoValor);
                break;
            case "endereco":
                setEndereco(novoValor);
                break;
            case "telefone":
                setTelefone(novoValor);
                break;
            case "cpf":
                setCpf(novoValor);
                break;
            case "idCliente":
                setIdCliente(novoValor);
                break;
            default:
                System.out.println("Atributo desconhecido: " + atributo);
        }
    }
}

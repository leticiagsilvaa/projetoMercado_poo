package classes;

import java.util.List;
import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String idCliente;
    private List<String> historicoCompras;

    public Cliente(String nome, String cpf, String idCliente) {
        super(nome, cpf);
        this.idCliente = idCliente;
        this.historicoCompras = new ArrayList<>();
    }

    // getters
    public String getIdCliente() {
        return idCliente;
    }

    public List<String> getHistoricoCompras() {
        return historicoCompras;
    }

    // setters
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setHistoricoCompras(String venda) {
        historicoCompras.add(venda);
    }

    // métodos
    @Override
    public void exibirInformacoes(){
        System.out.println("Informações");
    };

    @Override
    public void atualizarInformacoes(String atributo, String novoValor, int valor) {
        switch (atributo) {
            case "nome":
                setNome(novoValor);
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

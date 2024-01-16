
import java.util.List;
import java.util.ArrayList;

public class Cliente extends Pessoa {
    private int idCliente;
    private List<String> historicoCompras;

    public Cliente(String nome, String cpf, int idCliente) {
        super(nome, cpf);
        this.idCliente = idCliente;
        this.historicoCompras = new ArrayList<>();
    }

    // getters
    public int getIdCliente() {
        return idCliente;
    }

    public List<String> getHistoricoCompras() {
        return historicoCompras;
    }

    // setters
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setHistoricoCompras(String venda) {
        historicoCompras.add(venda);
    }

    // métodos
    @Override
    public void exibirInformacoes() {
        System.out.println("Informações");
    };

    @Override
    public void atualizarInformacoes(String atributo, String novoValor, int valor) {
        switch (atributo) {
            case "nome":
                setNome(novoValor);
                break;
            default:
                System.out.println("Atributo desconhecido: " + atributo);
        }
    }
}

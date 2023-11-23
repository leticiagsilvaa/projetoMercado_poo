package classes;

import java.util.Scanner;

public class OperadorDeCaixa extends Pessoa {
    private int idCaixa;

    public OperadorDeCaixa(String cpf, String nome, String endereço, String telefone, int idCaixa) {
        super(cpf, nome, endereço, telefone);
        this.idCaixa = idCaixa;
    }

    public int getIdCaixa() {
        return idCaixa;
    }

    // métodos
    public void iniciarAtendimento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite o CPF do cliente: ");
        String cpfCliente = scanner.nextLine();
        System.out.println("Iniciando atendimento no caixa: " + getIdCaixa());
    }

    public void finalizarAtendimento() {
        System.out.println("Compra realizada com sucesso!. Volte sempre, " + getNome());
    }

    public void processarVenda(Venda venda) {
        iniciarAtendimento();
        // Adicionar produtos ao carrinho (depende da implementação de Carrinho e
        // Produto)
        // Calcular valor total (pode ser feito na classe Carrinho ou na própria Venda)
        // Efetuar pagamento (depende da implementação de Pagamento)
        finalizarAtendimento();
        venda.adicionarAoHistorico();
    }

    public void cancelarVenda() {
        // Lógica para cancelar uma venda em andamento, limpar o carrinho, etc.
    }

    public void consultarHistoricoCompras(Cliente cliente) {
        // Lógica para consultar o histórico de compras de um cliente.
    }

    public void adicionarProdutoAoEstoque(Produto produto, int quantidade) {
        // Lógica para adicionar produtos ao estoque.
    }
}
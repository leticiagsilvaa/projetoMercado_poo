package classes;

import java.util.Scanner;

public class OperadorDeCaixa extends Pessoa {
    protected int idCaixa;
    private String endereco;
    private String telefone;
    private Venda venda;

    public OperadorDeCaixa(String cpf, String nome, String endereco, String telefone, int idCaixa, Venda venda) {
        super(cpf, nome);
        this.endereco = endereco;
        this.telefone = telefone; 
        this.idCaixa = idCaixa;
        this.venda = venda;
    }

    public int getIdCaixa() {
        return idCaixa;
    }

    // métodos
    public void iniciarAtendimento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite o CPF do cliente: ");
        String cpfCliente = scanner.nextLine();
        scanner.close();
        System.out.println("Iniciando atendimento no caixa: " + getIdCaixa());
    }

    public void finalizarAtendimento() {
        System.out.println("Compra realizada com sucesso!. Volte sempre, " + getNome());
    }

    public void processarVenda(Venda venda) {
        iniciarAtendimento();
        venda.finalizarCompra();
        finalizarAtendimento();
    }

    public void adicionarProdutoAoEstoque(Produto produto, int quantidade) {
        //ideia
    }

    public void exibirInformacoes(){
        System.out.println("Informações");
    };

    public void atualizarInformacoes(String atributo, String novoValor){
        System.out.println("Atualizar informações");
    };
}

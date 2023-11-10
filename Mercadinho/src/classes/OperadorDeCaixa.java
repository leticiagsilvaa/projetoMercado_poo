public class OperadorDeCaixa extends Pessoa {
    private int idCaixa;

    public OperadorDeCaixa (int cpf, String nome, String endereço, String telefone, int idCaixa) {
        super(cpf, nome, endereço, telefone);
        this.idCaixa = idCaixa;
    }

    public int getIdCaixa() {
        return idCaixa;
    }

    //métodos
    public void iniciarAtendimento() {
        System.out.println("Iniciando atendimento no caixa: " + getIdCaixa());
    }

    public void finalizarAtendimento() {
        //efetuarPagamento()
        //adicionarAoHistorico()
        System.out.println("Compra realizada com sucesso!. Volte sempre, " + getNome(););
    }

    public void processarVenda(Venda venda) {
        //iniciar atendimento()
        //solicitar cpf do cliente
        //bem vindo (nome)
        //pensar em como processar os produtos do carrinho (precisa da classe itemDoCarrinho)
        //finalizarAtendimento() 
    }

}
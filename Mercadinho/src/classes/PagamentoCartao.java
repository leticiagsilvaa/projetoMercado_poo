package classes;

import java.time.LocalDate;

public class PagamentoCartao extends Pagamento {
    private String numeroCartao;
    private String tipoCredito;
    private String tipoDebito;

    // Construtor
    public PagamentoCartao(double valor, LocalDate data, String descricao, String status, int idPagamento,
            String numeroCartao, String tipoCredito, String tipoDebito) {
        super(valor, data, descricao, status, idPagamento);
        this.numeroCartao = numeroCartao;
        this.tipoCredito = tipoCredito;
        this.tipoDebito = tipoDebito;
    }

    // Método para parcelar crédito
    public void parcelarCredito(int numeroParcelas) {
        if ("CREDITO".equals(this.tipoCredito.toUpperCase())) {
            double valorParcela = this.getValor() / numeroParcelas;
            System.out.println("Compra parcelada em " + numeroParcelas + " vezes de R$ " + valorParcela
                    + " no cartão de crédito.");
            // Aqui você pode adicionar lógica adicional, como salvar as informações do
            // parcelamento.
        } else {
            System.out.println("Este cartão não suporta pagamento parcelado no crédito.");
        }
    }

    // Método para realizar o pagamento no cartão de débito
    public void pagarDebito() {
        if ("DEBITO".equals(this.tipoDebito.toUpperCase())) {
            System.out.println("Compra no valor de R$ " + this.getValor() + " debitada no cartão de débito.");
            // Aqui você pode adicionar lógica adicional, como atualizar o status do
            // pagamento.
        } else {
            System.out.println("Este cartão não suporta pagamento no débito.");
        }
    }
}

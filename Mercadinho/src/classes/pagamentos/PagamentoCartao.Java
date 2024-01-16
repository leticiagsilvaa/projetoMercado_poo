package pagamentos;
import java.time.LocalDate;

public class PagamentoCartao extends Pagamento {
    private String numeroCartao;
    private String tipoCredito;
    private String tipoDebito;

    // Construtor
    public PagamentoCartao(double valor, LocalDate data, String status, int idPagamento,
            String numeroCartao, String tipoCredito, String tipoDebito) {
        super("", valor, data, status, idPagamento);  
        this.numeroCartao = numeroCartao;
        this.tipoCredito = tipoCredito;
        this.tipoDebito = tipoDebito;
    }

    // Método para parcelar crédito
    public void parcelarCredito(int numeroParcelas) {
        if ("CREDITO".equals(this.tipoCredito.toUpperCase())) {
            double valorParcela = super.getValor() / numeroParcelas;
            System.out.println("Compra parcelada em " + numeroParcelas + " vezes de R$ " + valorParcela
                    + " no cartão de crédito.");
           
        } else {
            System.out.println("Este cartão não suporta pagamento parcelado no crédito.");
        }
    }

    // Método para realizar o pagamento no cartão de débito
    public void pagarDebito() {
        if ("DEBITO".equals(this.tipoDebito.toUpperCase())) {
            System.out.println("Compra no valor de R$ " + super.getValor() + " debitada no cartão de débito.");
           
        } else {
            System.out.println("Este cartão não suporta pagamento no débito.");
        }
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public String getTipoDebito() {
        return tipoDebito;
    }

    public void setTipoDebito(String tipoDebito) {
        this.tipoDebito = tipoDebito;
    }
}

package pagamentos;

import java.time.LocalDate;

public class PagamentoCartao extends Pagamento {
    
    // Construtor
    public PagamentoCartao(String codigo, LocalDate data, String status) {
        super(codigo, data, status);
    }

    @Overrides
    public void pagar() {
    System.out.println("Pagamento");
 }

    public static void pagarCredito(double valor){
        String recibo = "Compra de " + valor + " aprovada no cartão de crédito.";
        return recibo;
        } 

    public static void pagarDebito(double valor) {
        String recibo = "Compra no valor de R$ " + valor + " debitada no cartão de débito.";
        return recibo;
        }
}

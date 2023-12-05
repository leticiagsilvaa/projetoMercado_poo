package pagamentos;

import java.time.LocalDate;
import java.util.Scanner;

public class PagamentoCartao extends Pagamento {
    
    // Construtor
    public PagamentoCartao(String codigo, LocalDate data, String status, Venda venda) {
        super(codigo, data, status, venda);
    }

    @Overrides
    public void pagar() {
        return venda.getValorTotal();
 }

    public void pagarCredito(){
        double valorParcela = venda.getValorTotal();
        String recibo = "Compra de " + valorParcela + " aprovada no cartão de crédito.";
        return recibo;
        } 

    public void pagarDebito() {
        double valorParcela = venda.getValorTotal();
        String recibo = "Compra no valor de R$ " + valorParcela + " debitada no cartão de débito.";
        return recibo;
        }
}

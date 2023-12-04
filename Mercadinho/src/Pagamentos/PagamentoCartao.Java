package classes;

import java.time.LocalDate;
import java.util.Scanner;

public class PagamentoCartao extends Pagamento {
    
    // Construtor
    public PagamentoCartao(String codigo, double valor, LocalDate data, String status, Venda venda) {
        super(codigo, valor, data, status, venda);
    }

    public void pagar() {
        System.out.println("Deseja pagar no crédito ou débito?");
        System.out.println("1- Crédito");
        System.out.println("2 - Débito");
        Scanner input = new Scanner(System.in);
        String tipoPagamento = input.nextLine();
        input.close();
        if ("1".equals(tipoPagamento)){
        pagarCredito();
    };
        if ("2".equals(tipoPagamento)){
        pagarDebito();
    };
 }

    public void pagarCredito(){
        double valorParcela = venda.getValorTotal();
        System.out.println("Compra de " + valorParcela + " aprovada no cartão de crédito.");
        } 

    public void pagarDebito() {
        double valorParcela = venda.getValorTotal();
        System.out.println("Compra no valor de R$ " + valorParcela + " debitada no cartão de débito.");
        }
}

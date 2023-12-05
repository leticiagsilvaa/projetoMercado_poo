package pagamentos;

import java.time.LocalDate;
import java.util.Scanner;

public class PagamentoDinheiro extends Pagamento {

    public PagamentoDinheiro(String codigo, double valor, LocalDate data, String status, Venda venda, double recebido, double troco){
    super(codigo, valor, data, status, venda);
    }

    @Overrides
    public void pagar(){
        return venda.getValorTotal();
    }

    public void darTroco(double valor,double recebido){
        troco = valor - recebido;
        if (troco >= 0) {
            return troco;
        else{
            return false;
        }
    }
}
}

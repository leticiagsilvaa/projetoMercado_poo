package pagamentos;

import java.time.LocalDate;

public class PagamentoDinheiro extends Pagamento {

    public PagamentoDinheiro(String codigo, LocalDate data, String status){
    super(codigo, data, status);
    }

    @Override
    public void pagar(){

    }

    public static double darTroco(double valor,double recebido){
        double troco = valor - recebido;
        if (troco > 0.0) {
            return troco;
    }
    return 0.0;
}
}

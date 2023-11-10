package classes;

import java.time.LocalDateTime;

public class PagamentoDinheiro extends Pagamento{
    private double recebido;
    private double troco;

    public PagamentoDinheiro(double recebido, double troco){
    super(valor, data, codigo, status, idPagamento);
        this.recebido = recebido;
       this.troco = troco; 
    }
    public void darTroco(double valor,double recebido){
        double troco = valor - recebido;
        if (troco >= 0) {
            System.out.println("Troco: R$ " + troco);}
            else {
                System.out.println("Valor insuficiente");
    }
}
}

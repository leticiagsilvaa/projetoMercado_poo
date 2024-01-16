package pagamentos;

import java.time.LocalDate;

public class PagamentoDinheiro extends Pagamento {
    private double recebido;
    private double troco;

    public PagamentoDinheiro(double valor, LocalDate data, String status, int idPagamento,
                             double recebido, double troco) {
        super("", valor, data, status, idPagamento);  
        this.recebido = recebido;
        this.troco = troco;
    }

    public void darTroco(double valor) {
        double troco = this.recebido - valor;
        if (troco >= 0) {
            System.out.println("Troco: R$ " + troco);
        } else {
            System.out.println("Valor insuficiente");
        }
    }


    public double getRecebido() {
        return recebido;
    }

    public void setRecebido(double recebido) {
        this.recebido = recebido;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }
}

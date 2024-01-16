package pagamentos;

import java.time.LocalDate;

public class PagamentoPix extends Pagamento {
    // atributos
    private String chavepix;

    // Construtor
    public PagamentoPix(String codigo, double valor, LocalDate data, String status, int idPagamento, String chavepix) {
        super(codigo, valor, data, status, idPagamento);
        this.chavepix = chavepix;
    }

    // Métodos
    public String gerarChavepix() {
        return chavepix;
    }

    public String getChavepix() {
        return chavepix;
    }

    public void setChavepix(String chavepix) {
        this.chavepix = chavepix;
    }
}

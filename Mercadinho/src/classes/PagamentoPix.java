import java.time.LocalDate;

public class PagamentoPix extends Pagamento {
    // atributos
    private String chavepix;

    // Construtor
    public PagamentoPix(double valor, LocalDate data, String descricao, String status, int idPagamento,
            String chavepix) {
        super(valor, data, codigo, status, idPagamento);
        this.chavepix = chavepix;
    }

    public String gerarChavepix() {
        return chavepix;
    }

}

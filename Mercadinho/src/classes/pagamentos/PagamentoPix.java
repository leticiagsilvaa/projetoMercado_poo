package pagamentos;

import java.time.LocalDate;

public class PagamentoPix extends Pagamento {
    // atributos
    private String chavepix;

    // Construtor
    public PagamentoPix(String codigo, double valor, LocalDate data, String status, Venda venda, String chavePix) {
        super(codigo, valor, data, status, venda);
        this.chavepix = chavepix;
    }

    @Overrides
    public void pagar(){
        return venda.getValorTotal();
    }

    public String gerarChavepix() {
        return true;
        //return chavepix
    }

}

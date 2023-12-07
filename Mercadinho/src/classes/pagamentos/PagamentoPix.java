package pagamentos;

import java.time.LocalDate;

public class PagamentoPix extends Pagamento {
    // atributos
    //private String chavepix;

    // Construtor
    public PagamentoPix(String codigo, LocalDate data, String status) {
        super(codigo, data, status);
        //this.chavepix = chavepix;
    }

    @Override
    public void pagar(){

    }
}

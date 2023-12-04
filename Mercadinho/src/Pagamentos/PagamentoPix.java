package classes;

import java.time.LocalDate;

public class PagamentoPix extends Pagamento {
    // atributos
    private String chavepix;

    // Construtor
    public PagamentoPix(String codigo, double valor, LocalDate data, String status, Venda venda, String chavePix) {
        super(codigo, valor, data, status, venda);
        this.chavepix = chavepix;
    }

    public void pagar(){
        gerarChavepix();
        System.out.println("Compra autorizada");
    }

    public String gerarChavepix() {
        return chavepix;
    }

}

import java.time.LocalDate;

    public class Pagamento{
    //atributos
    protected String codigo;
    private double valor;
    private LocalDate data;
    private String status;
    private int idpagamento;

public Pagamento(String codigo , double valor, LocalDate data, String status, int idPagamento) {
        this.codigo = codigo;
        this.valor = valor;
        this.data = data;
        this.status = status;
        this.idpagamento = idPagamento;
    }
//metodos
public void escolherPagamento(){
    
}

}
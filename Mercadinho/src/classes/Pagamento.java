import java.time.LocalDate;

public class Pagamento {
    // atributos
    protected String codigo;
    private double valor;
    private LocalDate data;
    private String status;
    private int idpagamento;
    private Venda venda;
   
    public Pagamento(String codigo, double valor, LocalDate data, String status, int idPagamento,Venda venda) {
        this.codigo = codigo;
        this.valor = valor;
        this.data = data;
        this.status = status;
        this.idpagamento = idPagamento;
        this.venda = venda
    }

    // getters
    public String getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public int getIdPagamento() {
        return idpagamento;
    }
    public Venda getVenda() {
    	return Venda
    }
    // setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setValor(double valor) {
        this.valor = valor;
        
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIdPagamento(int idPagamento) {
        this.idpagamento = idPagamento;
    }
    public void setVenda(Venda venda) {
    	this.venda = venda
    }

    // métodos
    public void escolherPagamento() {
        // implementação do método escolherPagamento
    }
}

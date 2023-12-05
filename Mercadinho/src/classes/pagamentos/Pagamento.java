package pagamentos;

import java.time.LocalDate;
import java.util.Scanner;

public class Pagamento {
    // atributos
    protected String codigo;
    protected LocalDate data;
    protected String status;
    protected Venda venda;

    public Pagamento(String codigo, LocalDate data, String status, Venda venda) {
        this.codigo = codigo;
        this.data = data;
        this.status = status;
        this.venda = venda;
    }

    // getters
    public String getCodigo() {
        return codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public Venda getVenda() {
        return venda;
    }

    // setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    //métodos
    public abstract class pagar();
}

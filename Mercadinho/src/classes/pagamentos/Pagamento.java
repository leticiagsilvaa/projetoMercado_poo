package pagamentos;

import java.time.LocalDate;

public abstract class Pagamento {
    // atributos
    protected String codigo;
    protected LocalDate data;
    protected String status;

    public Pagamento(String codigo, LocalDate data, String status) {
        this.codigo = codigo;
        this.data = data;
        this.status = status;
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

    //métodos
    public abstract void pagar();
}

package classes;

import java.time.LocalDate;
import java.util.Scanner;

public class Pagamento {
    // atributos
    protected String codigo;
    protected double valor;
    protected LocalDate data;
    protected String status;
    protected Venda venda;

    public Pagamento(String codigo, double valor, LocalDate data, String status, Venda venda) {
        this.codigo = codigo;
        this.valor = valor;
        this.data = data;
        this.status = status;
        this.venda = venda;
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

    public Venda getVenda() {
        return venda;
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

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    // métodos
    public void escolherPagamento() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o método de pagamento:");
        String metodo = input.nextLine();
        input.close();
        if(metodo.equals("Dinheiro")){
            System.out.println("Pagamento será em dinheiro");
            //chamar classe pagamentoDinheiro
        }
        if(metodo.equals("Cartão")){
            System.out.println("Pagamento será em cartão");
            //chamar classe pagamentoCartão
        }
        if(metodo.equals("Pix")){
            System.out.println("Pagamento será em Pix");
            //chamar classe pagamentoPix
        }
    }
}

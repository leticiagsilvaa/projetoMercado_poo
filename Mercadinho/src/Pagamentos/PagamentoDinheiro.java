package classes;

import java.time.LocalDate;
import java.util.Scanner;

public class PagamentoDinheiro extends Pagamento {
    private double recebido;
    private double troco;

    public PagamentoDinheiro(String codigo, double valor, LocalDate data, String status, Venda venda, double recebido, double troco){
    super(codigo, valor, data, status, venda);
        this.recebido = recebido;
        this.troco = troco; 
    }

    public void pagar(){
        System.out.println("O total da sua compra é:" + venda.getValorTotal());
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor que você possui");
        recebido = input.nextInt();
        input.close();
        if(recebido > venda.getValorTotal()){
            System.out.println("Compra aprovada! Espere seu troco.");
            darTroco(venda.getValorTotal(), recebido);
        } else{
            System.out.println("Valor insuficiente!");
            //implementar exceção
        }
    }

    public void darTroco(double valor,double recebido){
        troco = valor - recebido;
        if (troco >= 0) {
            System.out.println("Troco: R$ " + troco);}
    }
}

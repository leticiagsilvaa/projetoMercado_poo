package app;

import java.util.Scanner;

import pagamentos.*;

public class UI {

    public void menu(){
        System.out.println("Bem vindo ao menu do mercadinho!");
        System.out.println("O que deseja fazer?");
    }


    public static void escolherPagamento() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o método de pagamento:");
        String metodo = input.nextLine();
        input.close();
        if(metodo.equals("Dinheiro")){
            System.out.println("Pagamento será em dinheiro");
        }
        if(metodo.equals("Cartao")){
            System.out.println("Pagamento será em cartão");
        }
        if(metodo.equals("Pix")){
            System.out.println("Pagamento será em Pix");
        }
    }

    public void pagamentoCartaoUI(double total) {
        System.out.println("Deseja pagar no crédito ou débito?");
        System.out.println("1- Crédito");
        System.out.println("2 - Débito");
        Scanner input = new Scanner(System.in);
        String tipoPagamento = input.nextLine();
        if ("1".equals(tipoPagamento)){
            System.out.println("Pagamento será em cartão de crédito");
    }
        if ("2".equals(tipoPagamento)){
            System.out.println("Pagamento será em cartão de débito");
    }
    input.close();
}

    public void pagamentoDinheiroUI(double total) {
        System.out.println("O total da sua compra é:" + total);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor que você possui");
        int recebido = input.nextInt();
        input.close();
        if(recebido > total){
            System.out.println("Compra aprovada! Espere seu troco.");
            PagamentoDinheiro.darTroco(total, recebido);
        } else{
            System.out.println("Valor insuficiente!");
            //implementar exceção
        }
    }

    public void pagamentoPixUI(double total) {
        System.out.println("O total da sua compra é:" + total);
        System.out.println("Compra autorizada");
    }
}
    


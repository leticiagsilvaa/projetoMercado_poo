package app;

import pagamentos.PagamentoCartao;
import pagamentos.PagamentoPix;
import pagamentos.PagamentoDinheiro;

public class UI {
    
    public void escolherPagamento() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o método de pagamento:");
        String metodo = input.nextLine();
        input.close();
        if(metodo.equals("Dinheiro")){
            System.out.println("Pagamento será em dinheiro");
            pagamentoDinheiroUI();
        }
        if(metodo.equals("Cartão")){
            System.out.println("Pagamento será em cartão");
            PagamentoCartaoUI();
        }
        if(metodo.equals("Pix")){
            System.out.println("Pagamento será em Pix");
            PagamentoPix.pagar();
        }

    public void pagamentoCartaoUI() {
        System.out.println("Deseja pagar no crédito ou débito?");
        System.out.println("1- Crédito");
        System.out.println("2 - Débito");
        Scanner input = new Scanner(System.in);
        String tipoPagamento = input.nextLine();
        input.close();
        if ("1".equals(tipoPagamento)){
        pagamentoCartao.pagarCredito();
    };
        if ("2".equals(tipoPagamento)){
        pagamentoCartao.pagarDebito();
    };
    }

    public void pagamentoDinheiroUI() {
        System.out.println("O total da sua compra é:" + PagamentoDinheiro.pagar());
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor que você possui");
        recebido = input.nextInt();
        input.close();
        if(recebido > pagamentoCartao.pagar()){
            System.out.println("Compra aprovada! Espere seu troco.");
            PagamentoDinheiro.darTroco(PagamentoDinheiro.pagar(), recebido);
        } else{
            System.out.println("Valor insuficiente!");
            //implementar exceção
        }

    public void pagamentoPixUI() {
        System.out.println("O total da sua compra é:" + PagamentoPix.pagar());
        gerarChavepix();
        System.out.println("Compra autorizada");
    }

    
}}}

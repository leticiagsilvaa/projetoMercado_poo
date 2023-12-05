package app;

import classes.Produto;
import classes.ItemDoCarrinho;
import classes.Carrinho;
import classes.Cliente;
import classes.Venda;
import app.UI;


public class Main {

	public static void main(String[] args) {
			Produto produto1 = new Produto("Café", 1, "Bebida", 50, 2.5);
			Produto produto2 = new Produto("Empada", 1, "Lanche", 50, 4.5);

			ItemDoCarrinho item1 = new ItemDoCarrinho(produto1, 30);
			ItemDoCarrinho item2 = new ItemDoCarrinho(produto2, 7);

			Carrinho carrinho1 = new Carrinho(1);
			carrinho1.add(item1);
			carrinho1.add(item2);

			OperadorDeCaixa op1 = new OperadorDeCaixa("232", "Fulano", "Rua das Flores, 87", "08199898765", 1);

			Cliente cliente1 = new Cliente("Sicrano", "122334", "1");

			Venda venda1 = new Venda(carrinho1, op1, 1, cliente1);

			if(ItemDoCarrinho.verificacaoDeQuantidade() == false){
				System.out.println("Desculpa, não temos quantidade disponível desse produto");
			}

			UI.escolherPagamento();
		}

	}

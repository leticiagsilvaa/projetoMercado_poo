package app;

import classes.Produto;
import classes.ItemDoCarrinho;
import classes.OperadorDeCaixa;
import classes.Carrinho;
import classes.Cliente;
import classes.Venda;


public class Main {

	public static void main(String[] args) {
			Produto produto1 = new Produto("Café", 1, "Bebida", 50, 2.5);
			Produto produto2 = new Produto("Empada", 1, "Lanche", 50, 4.5);

			ItemDoCarrinho item1 = new ItemDoCarrinho(30, produto1);
			ItemDoCarrinho item2 = new ItemDoCarrinho(7, produto2);

			Carrinho carrinho1 = new Carrinho(1);
			carrinho1.adicionarAoCarrinho(item1);
			carrinho1.adicionarAoCarrinho(item2);

			OperadorDeCaixa op1 = new OperadorDeCaixa("232", "Fulano", "Rua das Flores, 87", "08199898765", 1);

			Cliente cliente1 = new Cliente("Sicrano", "122334", 1);

			Venda venda1 = new Venda(carrinho1, op1, 1, cliente1);

			UI.escolherPagamento();
		}

	}

package Repositorios;

import classes.Venda;

public class RepositorioVenda {
    private Venda vendas[];
    private int quantidadeVendas;

    public RepositorioVenda(int quantidadeMaxima, int quantidadeVendas) {
        vendas = new Venda[quantidadeMaxima];
        quantidadeVendas = 0;
    }
    public void adicionarVenda(Venda venda) {
        if(quantidadeVendas < vendas.length){
            vendas[quantidadeVendas] = venda;
            quantidadeVendas++;
        }
    }

    public void removerVenda(int idVenda) {
        for(int i = 0; i < quantidadeVendas; i++){
            if(vendas[i].getIdVenda() == idVenda){
                vendas[i] = null;
            }
        }
    }

    public Venda buscarVenda(int idVenda) {
        for(int i = 0; i < quantidadeVendas; i++){
            if(vendas[i].getIdVenda() == idVenda){
                return vendas[i];
            }
        }
        return null;
    }

    public Venda[] listarVendas(){
        return vendas;
    }
    }
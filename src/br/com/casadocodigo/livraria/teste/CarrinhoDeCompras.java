package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.Produto;
import br.com.casadocodigo.livraria.produtos.Revista;

public class CarrinhoDeCompras {

    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProduto(Produto[] produto) {
        this.produtos = produto;
    }

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        this.produtos[contador] = produto;
        contador++;
        this.total += produto.getValor();
    }

    public double getTotal() {
        return total;
    }
}

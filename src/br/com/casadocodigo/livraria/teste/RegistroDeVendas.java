package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

public class RegistroDeVendas {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        if (fisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor agora e " + fisico.getValor());
        }

        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total " + carrinho.getTotal());

        Produto[] produtos = carrinho.getProdutos();

        for (int i = 0; i < produtos.length; i++) {
            Produto produto = produtos[i];
            if (produto != null) {
                System.out.println(produto.getValor());
            }
        }
    }
}

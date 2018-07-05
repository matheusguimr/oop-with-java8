package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

import java.io.FileNotFoundException;
import java.util.List;

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
        List<Produto> produtos = carrinho.getProdutos();

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        if (fisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor agora e " + fisico.getValor());
        }

        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total " + carrinho.getTotal());
    }
}

package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo@gmail.com");
        autor.setCpf("123.456.789-01");

        Livro livro = new LivroFisico(autor);
        livro.setNome("Java 8 Pratico");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-8566-250-46-6");

        livro.toString();

        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("123.456.789-01");

        Livro outroLivro = new LivroFisico(outroAutor);
        outroLivro.setNome("Java 8 Pratico");
        outroLivro.setDescricao("Novos recursos da linguagem");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("978-8566-250-46-6");

        outroLivro.toString();
    }
}

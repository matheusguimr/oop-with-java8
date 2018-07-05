package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.exception.AutorNuloException;
import br.com.casadocodigo.livraria.teste.Autor;

public abstract class Livro implements Produto {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;

    public Livro(Autor autor) {
        if (autor == null) {
            throw new AutorNuloException("O autor do Livro nao pode ser nulo");
        }
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
        this.impresso = true;
    }

    @Override
    public int compareTo(Produto outro) {
        if (this.getValor() < outro.getValor()) {
            return -1;
        }
        if (this.getValor() > outro.getValor()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "nome = " + nome + "\n" +
                "descricao = " + descricao + "\n" +
                "valor = " + valor + "\n" +
                "isbn = " + isbn + "\n" +
                "autor = " + autor +
                " }";
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean temAutor() {
        boolean naoEhNull = this.autor != null;
        return naoEhNull;
    }

    public abstract boolean aplicaDescontoDe(double porcentagem);

    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("--");
        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }
        System.out.println("--");
    }
}
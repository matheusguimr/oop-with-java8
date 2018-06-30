package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.teste.Autor;

public class MiniLivro extends Livro {

    public MiniLivro(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }
}

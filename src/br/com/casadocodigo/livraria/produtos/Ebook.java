package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.teste.Autor;

public class Ebook extends Livro implements Promocional {

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        System.out.println("aplicando desconto no Ebook");
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
        //return super.aplicaDescontoDe(porcentagem);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}

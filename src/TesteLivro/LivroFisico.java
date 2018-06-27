package TesteLivro;

public class LivroFisico extends Livro {

    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaDeImpressao() {
        return this.getValor() * 0.05;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.30) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("aplicando desconto no LivroFisico");
        return true;
    }
}

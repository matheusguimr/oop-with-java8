package TesteLivro;

public abstract class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;

    public Livro(Autor autor) {
        this();
        this.autor = autor;
        this.impresso = true;
    }

    public Livro() {
        this.isbn = "000-00-00000-00-0";
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

    void mostrarDetalhes() {
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
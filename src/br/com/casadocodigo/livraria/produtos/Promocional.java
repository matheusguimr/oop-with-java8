package br.com.casadocodigo.livraria.produtos;

@FunctionalInterface
public interface Promocional {

    boolean aplicaDescontoDe(double Porcentagem);

    default boolean aplicaDescontoDe10Porcento() {
        return aplicaDescontoDe(0.1);
    }
}

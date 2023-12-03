package dominio;

public class Articulo implements Merito {
    private String titulo;
    private double indiceImpacto;

    public Articulo(String titulo, double indiceImpacto) {
        this.titulo = titulo;
        this.indiceImpacto = indiceImpacto;
    }

    @Override
    public double calcularValoracion() {
        return indiceImpacto;
    }
}

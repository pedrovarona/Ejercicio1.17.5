package dominio;

public class Proyecto implements Merito {
    private String titulo;
    private double financiacion;

    public Proyecto(String titulo, double financiacion) {
        this.titulo = titulo;
        this.financiacion = financiacion;
    }

    @Override
    public double calcularValoracion() {
        return financiacion / 100000;
    }
}

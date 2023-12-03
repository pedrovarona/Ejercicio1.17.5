package dominio;

public class ProfesorTitular extends Profesor {

    @Override
    public double calcularValoracion() {
        double sumaValoracion = 0.0;
        for (Merito merito : meritos) {
            sumaValoracion += merito.calcularValoracion();
        }
        return sumaValoracion / meritos.size();
    }
}

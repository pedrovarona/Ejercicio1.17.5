package dominio;

public class Catedratico extends Profesor {

    @Override
    public double calcularValoracion() {
        double sumaCuadrados = 0.0;
        for (Merito merito : meritos) {
            sumaCuadrados += Math.pow(merito.calcularValoracion(), 2);
        }
        double mediaCuadratica = sumaCuadrados / meritos.size();
        return Math.sqrt(mediaCuadratica);
    }
}

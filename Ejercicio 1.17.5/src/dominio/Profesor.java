package dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Profesor {
    protected List<Merito> meritos;

    public Profesor() {
        this.meritos = new ArrayList<>();
    }

    public abstract double calcularValoracion();

    public void annadirMerito(Merito merito) {
        meritos.add(merito);
    }
}

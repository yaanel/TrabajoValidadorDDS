package domain;

import java.util.List;

public class Materia {
    private List<Materia> correlativas;
    private String nombre;

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia(List<Materia> correlativas, String nombre) {
        this.correlativas = correlativas;
        this.nombre = nombre;
    }
}

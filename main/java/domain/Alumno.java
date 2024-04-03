package domain;

import java.util.List;

public class Alumno {
    private List<Materia> materiasAprobadas;
    private String nombre;
    private String legajo;

    public Alumno(List<Materia> materiasAprobadas, String nombre, String legajo) {
        this.materiasAprobadas = materiasAprobadas;
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public Boolean cumpleConCorrelativas(Materia materia){
        return this.materiasAprobadas
                .containsAll(materia.getCorrelativas());
    }
}

package domain;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAInscribir;

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMateriasAInscribir() {
        return materiasAInscribir;
    }

    public void setMateriasAInscribir(List<Materia> materiasAInscribir) {
        this.materiasAInscribir = materiasAInscribir;
    }

    public Inscripcion(Alumno alumno, List<Materia> materiasAInscribir) {
        this.alumno = alumno;
        this.materiasAInscribir = materiasAInscribir;
    }

    public Boolean inscripcionAceptada() {
        return this.materiasAInscribir.stream().allMatch(materia -> this.alumno.cumpleConCorrelativas((materia)));
    }

}
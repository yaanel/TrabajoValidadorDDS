package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InscripcionTest {

    @Test
    public void alumnoCumpleConCorrelativas(){
        List<Materia> sinCorrelativas = Collections.emptyList();
        Materia ayed = new Materia(sinCorrelativas,"AyED");
        Materia am1 = new Materia(sinCorrelativas,"Analisis Matematico");
        List<Materia> correlativasDePdeP = new ArrayList<>();
        correlativasDePdeP.add(ayed);
        Materia pdep = new Materia(correlativasDePdeP,"PdeP");


        List<Materia> materiasCursadasPorAlumno = new ArrayList<>();
        materiasCursadasPorAlumno.add(ayed);
        materiasCursadasPorAlumno.add(pdep);
        materiasCursadasPorAlumno.add(am1);

        Alumno tato = new Alumno(materiasCursadasPorAlumno,"Valentino","2112001");

        List<Materia> correlativasDeDdS = new ArrayList<>();
        correlativasDeDdS.add(ayed);
        correlativasDeDdS.add(pdep);
        Materia ddS = new Materia(correlativasDeDdS,"PdeP");

        Assert.assertTrue(tato.cumpleConCorrelativas(ddS));
    }

@Test
public void inscripcionAprobada() {
    List<Materia> sinCorrelativas = Collections.emptyList();
    Materia ayed = new Materia(sinCorrelativas, "AyED");
    Materia am1 = new Materia(sinCorrelativas, "Analisis Matematico 1");

    List<Materia> correlativasPdeP = new ArrayList<>();
    correlativasPdeP.add(ayed);
    Materia pdep = new Materia(correlativasPdeP, "PdeP");

    List<Materia> materiasCursadasPorAlumno = new ArrayList<>();
    materiasCursadasPorAlumno.add(ayed);
    materiasCursadasPorAlumno.add(pdep);
    materiasCursadasPorAlumno.add(am1);
    Alumno tato = new Alumno(materiasCursadasPorAlumno, "Valentino", "2112001");

    List<Materia> correlativasDeDdS = new ArrayList<>();
    correlativasDeDdS.add(ayed);
    correlativasDeDdS.add(pdep);
    Materia ddS = new Materia(correlativasDeDdS, "ddS");

    List<Materia> correlativasAM2 = new ArrayList<>();
    correlativasAM2.add(am1);
    Materia am2 = new Materia(correlativasAM2, "Analisis Matematico 2");

    List<Materia> materiasInscripcion = new ArrayList<>();
    materiasInscripcion.add(ddS);
    materiasInscripcion.add(am2);
    Inscripcion dosMilVeinticuatro = new Inscripcion(tato, materiasInscripcion);

    Assert.assertTrue(dosMilVeinticuatro.inscripcionAceptada());
}

    @Test
    public void inscripcionRechazada(){
        List<Materia> sinCorrelativas = Collections.emptyList();
        Materia ayed = new Materia(sinCorrelativas,"AyED");

        Materia am1 = new Materia(sinCorrelativas, "Analisis Matematico 1");

        List<Materia> correlativasDePdeP = new ArrayList<>();
        correlativasDePdeP.add(ayed);
        Materia pdep = new Materia(correlativasDePdeP,"PdeP");

        List<Materia> materiasCursadasPorAlumno = new ArrayList<>();
        materiasCursadasPorAlumno.add(pdep); // falta AyED
        Alumno tato = new Alumno(materiasCursadasPorAlumno,"Valentino","2112001");

        List<Materia> correlativasDdS = new ArrayList<>();
        correlativasDdS.add(ayed);
        correlativasDdS.add(pdep);
        Materia ddS = new Materia(correlativasDdS,"PdeP");

        List<Materia> correlativasAM2 = new ArrayList<>();
        correlativasAM2.add(am1);
        Materia am2 = new Materia(correlativasAM2, "Analisis Matematico 2");

        List<Materia> materiasAInscribir = new ArrayList<>();
        materiasAInscribir.add(am2);
        materiasAInscribir.add(ddS);
        Inscripcion dosMilVeinticuatro = new Inscripcion(tato,materiasAInscribir);

        Assert.assertFalse(dosMilVeinticuatro.inscripcionAceptada());

}
}



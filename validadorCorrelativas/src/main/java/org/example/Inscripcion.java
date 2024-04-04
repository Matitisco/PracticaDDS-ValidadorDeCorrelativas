package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }

    private Alumno alumno;
    private List<Materia> materias;

    public boolean aprobada(){
        return materias.stream().allMatch(materia -> alumno.aproboCorrelativas(materia) );
    }
}

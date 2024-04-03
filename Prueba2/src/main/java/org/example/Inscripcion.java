package org.example;

import java.util.List;

public class Inscripcion {

    private Alumno alumno;
    private List<Materia> materias;

    public boolean aprobada(){
        return materias.stream().allMatch(materia -> alumno.aproboCorrelativas(materia) );
    }
}

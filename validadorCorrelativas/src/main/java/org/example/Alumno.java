package org.example;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    public Alumno(String nombre, int legajo, List<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }

    private String nombre;
    private int legajo;
    private List<Materia> materiasAprobadas;

    public Boolean aproboCorrelativas(Materia materia){
        return materia.getCorrelativas().stream().allMatch(correlativa -> correlativa.getNota() > 6);
    }

}

package org.example;

import java.util.List;

public class Alumno {

    private String nombre;
    private int legajo;
    private List<Materia> materiasAprobadas;

    public Boolean aproboCorrelativas(Materia materia){
        return materia.getCorrelativas().stream().allMatch(correlativa -> correlativa.getNota() > 6);
    }

}

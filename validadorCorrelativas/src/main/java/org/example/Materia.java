package org.example;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    public Materia(String nombre, int nota, List<Materia> correlativas) {
        this.nombre = nombre;
        this.nota = nota;
        this.correlativas = correlativas;
    }

    private String nombre;

    private int nota;
    private List<Materia> correlativas;

    public List<Materia> getCorrelativas() {
        return correlativas;
    }


    public int getNota() {
        return nota;
    }

}

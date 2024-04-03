package org.example;

import java.util.List;

public class Materia {

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

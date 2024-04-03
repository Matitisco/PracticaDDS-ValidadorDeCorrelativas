package org.example;


/*
* Nos han solicitado el diseño y desarrollo de un validador de correlativas
*En las carreras terciarias y universitarias, para ordenar el plan de estudios y asegurar que cuando se inicia
una materia se tienen todos los conocimientos necesarios para entenderla, se establece lo que se llama
comúnmente “materias correlativas”.
*
* Básicamente, son materias que hay que tener aprobadas antes de
cursar la materia en cuestión.
*
*Consigna
    Teniendo en cuenta que:

    • El método principal del presente módulo debe ser el método “boolean aprobada()” de la clase Inscripción

*   •  Las inscripciones pueden involucrar varias asignaturas
*
*   • La inscripción se rechaza si al menos una materia no cumple con la condición de correlatividades
*
*      Y teniendo como restricción que solamente se podrán utilizar, además de la clase Inscripción, la clase Materia y Alumno; se pide:
*
*
        1. Diseñar una solución en el Paradigma Orientado a Objetos y comunicar la solución mediante un Diagrama de Clases.
*
*
* */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Alumno alumno = new Alumno();
        Materia aga = new Materia();

        alumno.aproboCorrelativas(aga);
    }


}
package domain;

import org.example.Alumno;
import org.example.Inscripcion;
import org.example.Materia;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class InscripcionTests {

    @Test
    public void inscripcionAprobada(){
        Materia aga = new Materia("aga",6,null);
        Materia aga2 = new Materia("aga2",6,null);


        ArrayList<Materia> correlativasAm2 = new ArrayList<>();
        ArrayList<Materia> soloAga = new ArrayList<>();
        correlativasAm2.add(aga);
        correlativasAm2.add(aga2);

        Materia am2 = new Materia("am2",0,correlativasAm2);

        Alumno jorge = new Alumno("jorge",190,correlativasAm2);


        Inscripcion inscripcion = new Inscripcion(jorge, correlativasAm2);






        Assert.assertTrue(inscripcion.aprobada());
    }


    @Test
    public void inscripcionNoAprobada(){
        Materia aga = new Materia("aga",6,null);
        Materia aga2 = new Materia("aga2",6,null);


        List<Materia> correlativasAm2 = new ArrayList<>();
        List<Materia> soloAga = new ArrayList<>();
        correlativasAm2.add(aga);
        correlativasAm2.add(aga2);




        Materia am2 = new Materia("am2",0,correlativasAm2);


        Alumno pablo = new Alumno("pablo",192,soloAga);


        Inscripcion inscripcion = new Inscripcion(pablo, correlativasAm2);




        Assert.assertFalse(inscripcion.aprobada());



    }

}


package com.iescomercio.instituto;

import java.util.TreeSet;

/**
 La clase Curso representa un curso en un instituto.
 Contiene una lista de alumnos matriculados en el curso.
 
 @author Hugo
 @version 1.0
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    
    /**
      Obtiene el nombre del curso.
    
      @return El nombre del curso.
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     Constructor de la clase curso
    
    @param nombre, es el nombre del curso
    */    
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
      Devuelve un String del curso,
      incluyendo la lista de alumnos matriculados.
      
      @return devuelve una cadena de texto con la información del curso.
     */    
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
      Añade un alumno al curso.
      
      @param p es el objeto Persona que representa al alumno.
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}

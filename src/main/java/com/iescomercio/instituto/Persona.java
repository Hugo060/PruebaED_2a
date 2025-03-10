
package com.iescomercio.instituto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
  La clase Persona representa a una persona en el sistema.
  Contiene información como el NIF, nombre, género y fecha de nacimiento.

  @author Hugo
  @version 1.0
 */
public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    /**
    Es el constructor de la clase Persona 
    Este constructor inicializa los valores.
    */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }
    
    /**
    Es otro constructor de la clase Persona
    A este constructor hay que pasarle un int NIf
    Y este creará un NIF con ese int
    @param nif es el NIF que posteriormente será inicializado
    */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
    Es otro constructor de la clase Persona
    A este constructor hay que pasarle un int NIf, un String nombre y un char 
    con el género.
    Y este creará la persona con todo lo que le hayas pasado.
    @param nif es el NIF que posteriormente será inicializado    
    @param nombre es el nombre de la persona
    @param genero es el género de la persona   
    */
    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento
                = LocalDate.of(ano, mes, dia);
    }

    /**
    Obtiene el NIF de la persona 
    @return nif
    */
    public Nif getNif() {
        return nif;
    }

    /**
    Inicializa el NIF con el NIF que le pases
    @param nif 
    */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    /**
    Obtiene el nombre de la persona
    @return nombre
    */
    public String getNombre() {
        return nombre;
    }

    /**
    Inicializa el nombre de la persona con el nombre que le hayas pasado
    @param nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
    Obtiene el género de la Persona
    @return genero
    */
    public char getGenero() {
        return genero;
    }
    /**
    Inicializa el género de la persona con el género que le pases
    @param genero
    */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
    Obtiene la fecha de nacimiento de la Persona
    @return nacimiento
    
    */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /**
    Inicializa la fecha de nacimiento con el parámetro de LocalDate que le pases
    @param nacimiento
    */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
    Obtiene la edad de la persona
    @return Period.between(nacimiento, LocalDate.now()).getYears();
    */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }
    
    /**
    Devuelve en formato String de la persona.
    Este incluye el nif, nombre y edad de esta.
    @return retona el nif, el nombre y la edad
    */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
    Compara dos personas por su nif
    @param la persona que queires comparar
    @return false si no son iguales, true si son iguales.
    */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
    Dice si dos objetos son iguales por el NIF
    @param obj le pasas el objeto que quieres comparar
    @return true si son iguales, false si no lo son
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
    Compara dos personas basandose por su NIF
    @param o pasas la persona que quieres comparar
    @return devuelve un valor negativo si el NIF es menor, 0 si es igual
    y valor positivo si el NIF es mayor.
    */    
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}

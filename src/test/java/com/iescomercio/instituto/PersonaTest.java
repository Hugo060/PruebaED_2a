/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.iescomercio.instituto;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vespertino
 */
public class PersonaTest {

    public PersonaTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNif method, of class Persona.
     */
    @Test
    public void testGetNif() {
        System.out.println("getNif");
        Persona p = new Persona(12345678, "Pedro", 'H', 1, 1, 2000);
        Nif result = p.getNif();
        assertTrue(result.toString().contains("12345678"));
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona p = new Persona(12345678, "Pedro", 'H', 1, 1, 2000);
        String result = p.getNombre();
        assertTrue(result.contains("Pedro"));
    }

    /**
     * Test of getGenero method, of class Persona.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Persona p = new Persona(12345678, "Pedro", 'H', 1, 1, 2000);
        char result = p.getGenero();
        assertEquals('H', result);
    }

    /**
     * Test of getNacimiento method, of class Persona.
     */
    @Test
    public void testGetNacimiento() {
        System.out.println("getNacimiento");
        Persona p = new Persona(12345678, "Pedro", 'H', 1, 1, 2000);
        LocalDate result = LocalDate.of(2000, 1, 1);
        assertEquals(result, p.getNacimiento());
    }

    /**
     * Test of getEdad method, of class Persona.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Persona p = new Persona(12345678, "Pedro", 'H', 1, 1, 2000);
        LocalDate fechaNacimiento = LocalDate.of(2000, 1, 1);
        int expResult = LocalDate.now().getYear() - fechaNacimiento.getYear();
        int result = p.getEdad();
        assertEquals(expResult, p.getEdad());
    }

    /**
     * Test of toString method, of class Persona.
     */
    @Test
    public void testToString() {
        Curso curso = new Curso("Historia");
        Persona alumno1 = new Persona(13579246, "Juana", 'M', 1, 1, 2000);
        Persona alumno2 = new Persona(24680987, "Maria", 'H', 1, 1, 2000);

        curso.aniadirAlumno(alumno1);
        curso.aniadirAlumno(alumno2);

        String resultado = curso.toString();
        assertTrue(resultado.contains("Juana"));
        assertTrue(resultado.contains("Maria"));
        assertTrue(resultado.contains("Historia"));
    }

    /**
     * Test of equals method, of class Persona.
     */
    @Test
    public void testEquals_Persona() {
        Persona persona1 = new Persona(12345678, "Carlos", 'H', 1, 1, 1995);
        Persona persona2 = new Persona(12345678, "Carlos", 'H', 1, 1, 1995);
        Persona persona3 = new Persona(87654321, "Laura", 'M', 1, 1, 1990);

        assertTrue(persona1.equals(persona2));

        assertFalse(persona1.equals(persona3));
    }

    /**
     * Test of equals method, of class Persona.
     */
    @Test
    public void testEquals_Object() {
        System.out.println("equals");

        Persona persona1 = new Persona(12345678, "Juan", 'H', 1, 1, 2000);
        assertTrue(persona1.equals(persona1));

        assertFalse(persona1.equals(null));

        Persona persona2 = new Persona(12345678, "Juan", 'H', 1, 1, 2000);
        assertTrue(persona1.equals(persona2));

        Persona persona3 = new Persona(87654321, "Ana", 'M', 1, 1, 2000);
        assertFalse(persona1.equals(persona3));
    }

    @Test
    public void testCompareTo() {
        System.out.println("compareTo");

        Persona persona1 = new Persona(12345678, "Juan", 'H', 1, 1, 2000);
        Persona persona2 = new Persona(12345678, "Juan", 'H', 1, 1, 2000);
        assertEquals(0, persona1.compareTo(persona2));

        Persona persona3 = new Persona(11111111, "Ana", 'M', 1, 1, 2000);
        assertTrue(persona3.compareTo(persona1) < 0);

        Persona persona4 = new Persona(99999999, "Luis", 'H', 1, 1, 2000);
        assertTrue(persona4.compareTo(persona1) > 0);
    }
}

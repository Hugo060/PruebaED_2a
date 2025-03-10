/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.iescomercio.instituto;

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
public class CursoTest {
    
    public CursoTest() {
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
     * Test of getNombre method, of class Curso.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Curso c = new Curso("Lengua");
        String result = c.getNombre();
        assertTrue(result.contains("Lengua"));
    }
    
    @Test
    public void testAniadirAlumno() {
        Curso curso = new Curso("Matemáticas");
        Persona alumno = new Persona(12345678, "Pedro", 'H', 1, 1, 2000);

        curso.aniadirAlumno(alumno);

        assertTrue(curso.toString().contains("Pedro"));
    }   
    
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
    
}

package com.iescomercio.instituto;

/**
 * La clase Nif representa el número de identificación fiscal (NIF) de una persona.
 * 
 * @author Hugo
 * @version 1.0
 */
public class Nif {

    private int numero;
    private char letra;

    // CONSTANTE: no accesible - compartido por todo - no modificable
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};

    /**
     * Calcula la letra correspondiente a un número de NIF.
     * 
     * @param numero El número de NIF.
     * @return La letra correspondiente al número de NIF.
     */
    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    /**
     * Constructor por defecto de la clase Nif.
     * Inicializa el número y la letra con valores predeterminados.
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    /**
     * Constructor de la clase Nif.
     * 
     * @param numero El número de NIF.
     */
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Devuelve una representación en formato String del NIF.
     * 
     * @return Una cadena de texto con el número y la letra del NIF.
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    /**
     * Establece el número de NIF y calcula la letra correspondiente.
     * 
     * @param numero El número de NIF.
     */
    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Compara dos objetos Nif para determinar si son iguales.
     * 
     * @param obj El objeto a comparar.
     * @return true si los objetos son iguales, false en caso contrario.
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
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
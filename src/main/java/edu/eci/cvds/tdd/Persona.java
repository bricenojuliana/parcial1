package edu.eci.cvds.tdd;

public class Persona {
    public static boolean esMayorDeEdad (int edad) throws IllegalArgumentException {
        if (edad < 0){
            throw new IllegalArgumentException("Edad inválida.");
        }
        if (edad >= 18){
            return false;
        }
        return true;
    }
}

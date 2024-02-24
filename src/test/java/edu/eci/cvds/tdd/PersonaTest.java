package edu.eci.cvds.tdd;

import edu.eci.cvds.tdd.Persona;
import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;
import org.junit.*;


public class PersonaTest {
    @Test
    public void Should_ReturnTrue_When_esMenorDeEdad(){
        //Given
        int edadPequena = 0;
        int edadGrande = 17;

        //When
        boolean result1 = Persona.esMayorDeEdad(edadPequena);
        boolean result2 = Persona.esMayorDeEdad(edadGrande);

        //Arrange
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
    }

    @Test
    public void Should_ReturnFalse_When_EsMayorDeEdad(){
        //Given
        int edadPequena = 18;
        int edadGrande = 1000;

        //When
        boolean result1 = Persona.esMayorDeEdad(edadPequena);
        boolean result2 = Persona.esMayorDeEdad(edadGrande);

        //Arrange
        Assert.assertFalse(result1);
        Assert.assertFalse(result2);
    }

    @Test
    public void Should_Fail_When_InvalidAge(){
        //Given
        int edadInvalida1 = -1;
        int edadInvalida2 = -1000;

        //When & Arrange
        Assert.assertThrows(IllegalArgumentException.class, () -> Persona.esMayorDeEdad(edadInvalida1));
        Assert.assertThrows(IllegalArgumentException.class, () -> Persona.esMayorDeEdad(edadInvalida2));
    }
}

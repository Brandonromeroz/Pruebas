package Brandon.zavala;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {
    Object operaciones = new Suma();


    @Test
    public void testSumarDosNumerosEnteros(){

        Assertions.assertEquals(4, Suma.operacion(2,2));
    }
    @Test
    public void testSumarDosNumerosFlotantres() {
        Assertions.assertEquals(4, Suma.operacion(2.0,2.0));
    }
    @Test
    public void sumarUnNumeroEnteroyUnNumeroFlotante(){
        assertEquals(4, Suma.operacion(2,2.0));
    }
    @Test
    public void sumarUnNumeroFlotanteyUnNumeroEntero(){
        assertEquals(4, Suma.operacion(2.0,2));
    }
    @Test
    public void sumarDosNumerosNegativos(){
        assertEquals(-4, Suma.operacion(-2,-2));
    }
    @Test
    public void sumarDosNumerosFlotantesNegativos(){
        assertEquals(-4.0, Suma.operacion(-2.0,-2.0));
    }
    @Test
    public void sumarUnNumeroEnteroNegativoyUnNumeroFlotanteNegativo(){
        assertEquals(-4.0, Suma.operacion(-2,-2.0));
    }
    @Test
    public void sumarTresNumeros(){
        assertEquals(6, Suma.operacion(1,2,3));
    }
    @Test
    public void sumarCincoNumeros(){
        assertEquals(15, Suma.operacion(1,2,3,4,5));
    }
    @Test
    public void sumarNCantidadDeNumeros(){
        assertEquals(55, Suma.operacion(1,2,3,4,5,6,7,8,9,10));
    }
}
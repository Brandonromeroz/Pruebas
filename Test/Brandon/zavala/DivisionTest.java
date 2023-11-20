package Brandon.zavala;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionTest {
    @Test
    public void testDivisionConDosNumerosEnteros(){
        Assertions.assertEquals(2.0,Division.operacion(2,1));
    }
    @Test
    public void testDividirEntreCero(){
        Assertions.assertEquals(Double.POSITIVE_INFINITY, Division.operacion(2,0));
    }
    @Test
    public void testDividirTresNumeros(){
        Assertions.assertEquals(0.0625, Division.operacion(1,2,3,4,5));
    }
    @Test
    public void testDividirNumerosNegativos(){
        Assertions.assertEquals(-0.0625, Division.operacion(-1,-2,-3,-4,-5));
    }
    @Test
    public void testDividirNumerosNegativosyPositivos (){
        Assertions.assertEquals(2.0,Division.operacion(-2,-1,1,2));
    }
}

package Brandon.zavala;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestaTest {
    @Test
    public void testRestarDosNumerosEnteros(){
        Assertions.assertEquals(0,Resta.operacion(1,1));
    }
    @Test
    public void testRestarTresNUmeros(){
        Assertions.assertEquals(-4.0, Resta.operacion(1,2,3));
    }
    @Test
    public void testRestarDidferentesNUmeros(){
        Assertions.assertEquals(-4,Resta.operacion(-2,-1,0,1,2));
    }

@Test
public void testrestarDiferentesnumeros2(){Assertions.assertEquals(3,Resta.operacion(-2,-2,-3));}
}

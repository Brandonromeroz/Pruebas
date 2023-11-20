package Brandon.zavala;

import java.util.Arrays;

public class Suma {
    public static double operacion(double... numeros){
        double total = 0;
        return Arrays.stream(numeros).sum();
    }

}

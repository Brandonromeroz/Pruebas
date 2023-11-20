package Brandon.zavala;

import java.util.Arrays;

import static java.util.Arrays.stream;

public class Division {
    public static double operacion(double... numeros) {
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            resultado /= numeros[1];
        }
        return resultado;

    }
}

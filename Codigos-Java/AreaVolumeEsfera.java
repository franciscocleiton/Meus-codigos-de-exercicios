/**
 * Lista 1: Exercício 3: Escreva um programa para calcular a área (A) e o volume (V) de uma esfera.
 * @author Cleiton
 */

import java.util.*;

public class AreaVolumeEsfera {

    public static void main(String[] args){
        float vol, area, pi, r;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Me informe o raio da esfera: ");
        r = entrada.nextFloat();
        pi = (float) 3.14;
        area = (float) (4*pi*Math.pow(r, 2));
        vol = (float)((3*pi*Math.pow(r, 3))/4);

        System.out.printf("Área da esfera = %.2f\nVolume = %.2f", area, vol);
    }
}

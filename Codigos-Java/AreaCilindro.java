/**
 * Lista 1: Exercício 2: Area total de um cilindro
 * @author Cleiton
 */

import java.util.*;

public class AreaCilindro {
    public static void main(String[] args){
        float area, pi, raio, h;
        Scanner entrada = new Scanner(System.in);
        pi = (float) 3.14;

        System.out.print("Digite o raio do cilindro: ");
        raio = entrada.nextFloat();

        System.out.print("Digite a altura do clindro: ");
        h = entrada.nextFloat();

        area = (float) ((2*pi*raio*h) + (2*pi*Math.pow(raio, 2)));

        System.out.printf("A área total do cilindro é: %.2f", area);
    }
}

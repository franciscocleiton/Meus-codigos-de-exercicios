/**
 * Lista 1: Exercício 9: Escreva um programa que leia 10 números reais, calcule e mostre a média.
 * 
 * @author Cleiton
 */
import java.util.*;

public class MediaReais {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float valor[];
        float soma, media;
        valor = new float[10];
        soma = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um número: ");
            valor[i] = entrada.nextFloat();
            soma += valor[i];
        }
        media = soma/10;
        System.out.printf("A média dos número digitados é: %.1f", media);
    }
}

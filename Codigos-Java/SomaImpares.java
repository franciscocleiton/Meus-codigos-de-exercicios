/**
 * Lista 1: Exercício 11: Escreva um programa que leia 10 números inteiros em um vetor e apresente a soma dos números ímpares.
 * 
 * @author Cleiton
 */
import java.util.*;

public class SomaImpares {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        final int TAM = 10;
        int[] vet = new int[TAM];
        int somint = 0;

        for(int i = 0; i < TAM; i++){
            System.out.printf("Digite o número %d: ", i+1);
            vet[i] = entrada.nextInt();
            
            if(vet[i]%2!=0){
                somint += vet[i];
            }
        }
        System.out.println("O soma dos números ímpares é: "+somint);
    }
}

/**
 * Lista 1: Exercício 9: Com vetores, escreva um programa para calcular a média de 10 notas e informar a quantidade de notas acima da média.
 * 
 * @author Cleiton
 */
import java.util.*;

public class AcimaDaMedia {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float notas[];
        float soma, media;
        int acima = 0;
        notas = new float[10];
        soma = 0;

        for(int i = 0; i < 10; i++){
            System.out.printf("Digite a nota do aluno %d: ", i+1);
            notas[i] = entrada.nextFloat();

            if(notas[i]>=7){
                acima += 1;
            }
            soma += notas[i];
        }
        media = soma/10;
        System.out.printf("A média dos alunos é: %.1f\n%d alunos ficaram acima da média!", media, acima);
    }
}

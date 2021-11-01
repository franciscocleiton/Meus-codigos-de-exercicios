/**
 * Lista 1: Exercício 14: Escreva um programa que calcule a média de cada estudante e a média da turma em cada prova. Utilize uma matriz de 36 linhas com 4 colunas, sendo que as linha correspondem aos alunos e as colunas as provas. A média será calculada com base nas notas N1, N2 e N3 e na coluna 4 será inserido o resultado da média.
 * 
 * @author Cleiton
 */
import java.util.Scanner;

public class MediaEstudante {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float[][] notas = new float[36][4];
        Float[] media = new Float[36];
        float soma = 0;

        for(int i = 0; i < 36; i++){
            soma = 0;
            for (int j = 0; j < 4; j++){
                if (j!=3){
                    System.out.printf("Digite a nota %d do aluno %d: ", j+1, i+1);
                    notas[i][j] = entrada.nextFloat();
                    soma += notas[i][j];
                    media[i] = soma/3;
                }
                else{
                    notas[i][j] = media[i];
                }
            }
        }

        System.out.println("Boletim Final:");
        for(int i = 0; i < 36; i++){
            System.out.printf("Aluno %d ", i+1);
            for (int j = 0; j < 4; j++){
                if(j == 3){
                    System.out.printf("Media = %.1f", media[i]);
                }
                else{
                System.out.printf("N%d = %.1f ", j+1, notas[i][j]);
                }
            }
            System.out.println("");
        }  
    }
}

/**
 * Lista 1: Exercício 15: Elabore um programa que preencha um vetor de 15 posições com números reais. Os números desse vetor devem ser utilizados para preencher uma matriz de 3 x 5.
 *
 * @author Cleiton
 */
import java.util.Random;

public class Vetor15 {
    public static void main(String[] args){
        final int vet = 15, lin = 3, col = 5;
        int[] vetor = new int[vet];
        int[][] matriz = new int[lin][col];
        int cont = 0;

        for(int i = 0; i < vet; i++){
            double aleatorio = 1 + Math.random()*20;
            int aleatorioInteiro = (int) aleatorio;
            vetor[i] = aleatorioInteiro;
        }

        System.out.print("Vetor: ");
        for(int i = 0; i < vet; i++){
            System.out.printf("%d ", vetor[i]);
        }
        System.out.println("\n");

        for(int i = 0; i < lin; i++){
            for(int j = 0; j < col; j++){
                matriz[i][j] = vetor[cont];
                cont++;
            }
        }

        System.out.println("Matriz: ");
        for(int i = 0; i < lin; i++){
            for(int j = 0; j < col; j++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println("");
        }
    }
}

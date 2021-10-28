/**
 * Lista 1: Exercício 13: Escreva um programa que realize a leitura, produto e impressão do resultado entre duas matrizes de 16 elementos.
 * 
 * @author Cleiton
 */
import java.util.Random;
public class MultiplicacaoMatrizes {
    public static void main(String[] args){
        final int lin = 4, col = 4;
        int [][] matriz1 = new int [lin][col];
        int [][] matriz2 = new int [lin][col];
        int [][] matriz3 = new int [lin][col];
        
        Random numRandom = new Random();
        

        for(int i = 0; i < lin; i++){
            for(int j = 0; j < col; j++){
                double aleatorio = 1 + Math.random()*9;
                int aleatorioInteiro = (int) aleatorio;
                matriz1[i][j] = aleatorioInteiro;
                double aleatorio1 = 1 + Math.random()*9;
                int aleatorioInteiro1 = (int) aleatorio1;
                matriz2[i][j] = aleatorioInteiro1;
                matriz3[i][j] = matriz1[i][j]*matriz2[i][j];
            }
        }

        System.out.println("Matriz 1");
        for(int i = 0; i < lin; i++){
            for(int j = 0; j < col; j++){
               System.out.printf("%d ", matriz1[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("\nMatriz 2");
        for(int i = 0; i < lin; i++){
            for(int j = 0; j < col; j++){
               System.out.printf("%d ", matriz2[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("\nMatriz 3 - Após multiplicação");
        for(int i = 0; i < lin; i++){
            for(int j = 0; j < col; j++){
               System.out.printf("%d ", matriz3[i][j]);
            }
            System.out.print("\n");
        }
    }
}

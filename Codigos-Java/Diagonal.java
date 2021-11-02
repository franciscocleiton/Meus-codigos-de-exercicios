/**
 * Lista 1: Exercício 16: Escreva um programa que preencha e mostre uma matriz 5 x 5 com números reais, realize a troca da diagonal principal com a secundária e mostre o resultado
 *
 * @author Cleiton
 */
//import java.util.Random;

public class Diagonal {
    public static void main(String[] args){
        final int lin = 5, col = 5;
        int[][] matrizoriginal = new int[lin][col];
        int[][] matrizdiagonal = new int[lin][col];

        for (int i = 0; i < lin; i++){
            for (int j = 0;  j < col; j++){
                double aleatorio = 1 + Math.random()*9;
                int aleatorioInteiro = (int) aleatorio;
                matrizoriginal[i][j] = aleatorioInteiro;
                matrizdiagonal[i][j] = aleatorioInteiro;
            }
        }

        System.out.println("Matriz Original: ");
        for (int i = 0; i < lin; i++){
            for (int j = 0;  j < col; j++){
                System.out.printf("%d ", matrizoriginal[i][j]);
            }
            System.out.println("");
        }

        for (int i = 0; i < lin; i++){
            for (int j = 0;  j < col; j++){
                if (i==j){
                    int l = 4-i;
                    if(l < 0){
                        l = l*(-1);
                    }
                    int temp = matrizoriginal[i][j];
                    matrizoriginal[i][j] = matrizdiagonal[i][l];
                    matrizoriginal[i][l] = temp;
                }
            }
        }

        System.out.println("\nMatriz Final: ");
        for (int i = 0; i < lin; i++){
            for (int j = 0;  j < col; j++){
                System.out.printf("%d ", matrizoriginal[i][j]);
            }
            System.out.println("");
        }
    }

}

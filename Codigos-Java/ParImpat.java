/**
 * Lista 1: Exercício 6: Escreva um programa que mostre uma mensagem informando se o número inteiro digitado pelo usuário é par ou ímpar.
 * @author Cleiton
 */

import java.util.*;

public class ParImpat {
    public static void main(String[] arg){
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        if (num % 2 == 0){
            System.out.printf("O número %d é par!\n", num);
        }
        else{
            System.out.printf("O número %d é ímpar!\n", num);
        }
    }
}

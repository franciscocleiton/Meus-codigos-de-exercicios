/**
 * Lista 1: Exercício 7: Escreva um programa que mostre uma mensagem informando se o número inteiro digitado pelo usuário é múltiplo de 3.
 * @author Cleiton
 */
import java.util.*;

public class MultiploTres {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        if (num % 3 == 0){
            System.out.printf("O número %d é múltiplo de 3!\n", num);
        }
        else{
            System.out.printf("O número %d NÃO é múltiplo 3!\n", num);
        }
    }
}

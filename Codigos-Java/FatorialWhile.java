/**
 * Lista 1: Exercício 8: Escreva dois programas que calcule o fatorial de um número inteiro digitado pelo usuário. O fatorial de um número é dado por: n! = (n-1)!.
 * b) O programa 2 deve utilizar a estrutura while
 * @author Cleiton
 */
import java.util.*;

public class FatorialWhile {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num, fat, cont;

        System.out.print("Digite um número para saber seu fatorial: ");
        num = entrada.nextInt();

        fat = num;
        cont = num - 1;

        while(cont >= 1){
            fat = fat * cont;
            cont -= 1;
        }
        System.out.printf("%d! = %d", num, fat);
    }
}

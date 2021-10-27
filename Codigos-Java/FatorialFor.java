/**
 * Lista 1: Exercício 8: Escreva dois programas que calcule o fatorial de um número inteiro digitado pelo usuário. O fatorial de um número é dado por: n! = (n-1)!.
 * a) O programa 1 deve utilizar a estrutura for
 * @author Cleiton
 */
import java.util.*;

public class FatorialFor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num, fat, cont;

        System.out.print("Digite um número para saber seu fatorial: ");
        num = entrada.nextInt();

        fat = num;
        cont = num - 1;

        for(int i = cont ; i >= 1; i--){
            fat = fat * i;
        }
        System.out.printf("%d! = %d", num, fat);
    }
}

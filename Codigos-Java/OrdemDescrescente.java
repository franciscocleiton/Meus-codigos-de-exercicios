/**
 * Lista 1: Exercício 4: Elabore um programa que leia e imprima em ordem decrescente três valores
inteiros diferentes, digitados pelo usuário. Utilize a seleção encadeada
 * @author Cleiton
 */
import java.util.*;

public class OrdemDescrescente {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int v1, v2, v3;

        System.out.print("Digite o primeiro número: ");
        v1 = entrada.nextInt();

        System.out.print("Digite outro número: ");
        v2 = entrada.nextInt();

        System.out.print("Digite outro número: ");
        v3 = entrada.nextInt();

        /* Depois que percebi que era com seleção encadeada, mas deixarei essa parte aqui comentada
        int[] v = {v1, v2, v3};
        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                if (v[i] > v[j]) {
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }

        for (int i = 0; i < 3; i++){
            System.out.println(v[i])
        }*/

        if (v1 > v2 && v1 > v3){
            System.out.println(v1);
            if (v2 > v3){
                System.out.println(v2);
                System.out.println(v3);    
            }
            else{
                System.out.println(v3);
                System.out.println(v2);
            }
            
        }

        else if (v2 > v1 && v2 > v3){
            System.out.println(v2);
            if (v1 > v3){
                System.out.println(v1);
                System.out.println(v3);    
            }
            else{
                System.out.println(v3);
                System.out.println(v1);
            }
            
        }

        else if (v3 > v2 && v3 > v1){
            System.out.println(v3);
            if (v2 > v1){
                System.out.println(v2);
                System.out.println(v1);    
            }
            else{
                System.out.println(v1);
                System.out.println(v2);
            }
            
        }
    
    }
    
}

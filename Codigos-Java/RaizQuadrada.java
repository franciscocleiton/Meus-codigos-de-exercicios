/**
 * Lista 1: Exercício 1: Raiz Quadrada
 * @author Cleiton
 */
import java.util.*;

public class RaizQuadrada {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        double a, b, c, delta, x1, x2;
        
        System.out.print("Digite o coeficiente A: ");
        a = entrada.nextDouble();

        System.out.print("Digite o coeficiente B: ");
        b = entrada.nextDouble();

        System.out.print("Digite o coeficiente C: ");
        c = entrada.nextDouble();
        delta = b*b - 4*a*c;
        if (delta > 0) {
            
            x1 = (- b - Math.sqrt(delta)) / (2*a);
            x2 = (- b + Math.sqrt(delta)) / (2*a);

            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
        else if(delta == 0){
            x1 = (- b + Math.sqrt(delta)) / (2*a);
            System.out.println("x1=x1="+x1);
        }
        else if(delta<0){
            System.out.println("A equação não possue raízes reais.");
        }
    }
}

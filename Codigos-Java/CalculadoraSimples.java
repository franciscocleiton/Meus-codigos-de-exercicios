/**
 * Lista 1: Exercício 5: Escreva um programa que simule uma simples calculadora com as operações aritméticas de adição “+”, subtração “–”, multiplicação “ * ” e divisão “ / ”. Para a escolha das operações aritméticas utilize os seus símbolos. Utilize a seleção de múltipla escolha.
 * @author Cleiton
 */
import java.util.*;

public class CalculadoraSimples {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n1, n2, calc;
        String op;

        System.out.println("Calculadora");
        System.out.print("Digite o 1° número: ");
        n1 = entrada.nextInt();

        System.out.print("Agora digite o 2° número: ");
        n2 = entrada.nextInt();

        System.out.print("Agora digite a operação que deseja realizar (+, -, *, /): ");
        op = entrada.next();
        
        switch(op){
            case "+":
                calc = n1 + n2;
                System.out.printf("%d + %d = %d\n", n1, n2, calc);
                break;
            case "-":
                calc = n1 - n2;
                System.out.printf("%d - %d = %d\n", n1, n2, calc);
                break;
            
            case "*":
                calc = n1 * n2;
                System.out.printf("%d x %d = %d\n", n1, n2, calc);
                break;
            case "/":
                calc = n1 / n2;
                System.out.printf("%d / %d = %d\n", n1, n2, calc);
                break;
            default:
                System.out.println("Operação Indisponível");
        }
    }
}


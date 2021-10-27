import java.io.IOException;
import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) throws IOException{
        float numa, numb;
        char oper; 
        int i=0;
        Scanner entrada = new Scanner(System.in);
        for(i=0;i<5;i++) {
            System.out.println("Digite na ordem: número 1 (enter)" + "operador (enter) número 2 (enter)");
            numa = entrada.nextFloat();
            oper = (char)System.in.read();
            numb = entrada.nextFloat();
            switch(oper){
                case '+':
                    System.out.printf("Adição = %.2f\n",numa+numb);
                    break; 
                case '-':
                    System.out.printf("Subtração=%.2f\n",numa - numb);   
                    break; 
                case '*':
                    System.out.printf("Multiplicação=%.2f\n",numa*numb);
                    break;   
                case '/':
                    System.out.printf("Divisão=%2.2f\n",numa/numb);
                    break;   
                default: System.out.printf("Operação inválida!\n");
            }
        }
    }
}
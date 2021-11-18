import java.util.Scanner;

public class TesteEstudante {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        Selecao e1 = new Selecao();
        
        System.out.println("Digite as informações do Estudante candidato a bolsa: ");
        System.out.print("Nome: ");
        e1.sel1.nome = entrada.nextLine();

        System.out.print("RG ou RNE: ");
        e1.sel1.RG = entrada.nextLine();

        System.out.print("CPF: ");
        e1.sel1.CPF = entrada.nextLine();

        System.out.print("Curso: ");
        e1.sel1.curso = entrada.nextLine();

        System.out.print("Possui outra bolsa: (True/False) ");// responder com true ou false
        e1.sel1.outraBolsa = entrada.nextBoolean();

        System.out.print("Está regularmente matriculado: (True/False) ");// responder com true ou false
        e1.sel1.matriculado = entrada.nextBoolean();

        System.out.print("Possui lattes cadastrado no CNPq: (True/False) ");// responder com true ou false
        e1.sel1.lattes = entrada.nextBoolean();

        e1.bolsa();
        e1.mat();
        e1.ll();
        e1.apr();
        e1.informacoes();
    }
}

/**
 * Crie um algoritmo que possua variáveis para salvar os seguintes dados: Nome, Endereço e Telefone de uma pessoa.
 * @autor Cleiton
 */
import java.util.*;
public class Dados {
    public static void main(String[] args){
        String nome, endereco, telefone;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite seu endereço: ");
        endereco = entrada.nextLine();

        System.out.print("Digite seu telefone: ");
        telefone = entrada.nextLine();

        System.out.printf("O %s domiciliado no endereço %s e telefone %s não possui nenhum tipo de pendência", nome, endereco, telefone);
    }
}

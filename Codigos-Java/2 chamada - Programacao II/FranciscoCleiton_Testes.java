import java.util.Scanner;

public class FranciscoCleiton_Testes {
    static FranciscoCleiton_Subclasse1 jogpro[];
    static FranciscoCleiton_Subclasse2 jogjI[];
    static FranciscoCleiton_Subclasse2 jogjII[];
    static FranciscoCleiton_Superclasse joginf[];
    
    static double salmaxpro = 1000000; 
    static double salpro = 0;

    public static void main(String[] args) {
        int escolha;
        Scanner entrada = new Scanner(System.in);
        
        int quantpro = 24;
        String nome;
        float salarioatual;
        String posicao;
        int idade;

        FranciscoCleiton_Subclasse1 pro = new FranciscoCleiton_Subclasse1();
        FranciscoCleiton_Subclasse2 junior = new FranciscoCleiton_Subclasse2();
        FranciscoCleiton_Subclasse2 junior1 = new FranciscoCleiton_Subclasse2();
        
        jogpro = new FranciscoCleiton_Subclasse1[quantpro];
        for (int i = 0; i < quantpro; i++) {
            jogpro[i] = new FranciscoCleiton_Subclasse1();
        }

        jogjII = new FranciscoCleiton_Subclasse2[quantpro];
        for (int i = 0; i < quantpro; i++) {
            jogjII[i] = new FranciscoCleiton_Subclasse2();
        }

        do {
            System.out.println("\nQual categoria deseja preencher");
            System.out.println("1 - Jogadores profissionais");
            System.out.println("2 - Jogadores Junior II");
            System.out.println("3 - Jogadores Junior I");
            System.out.println("4 - Infantil");
            System.out.println("0 - SAIR");
            System.out.print("Escolha: ");
            escolha = entrada.nextInt();

            switch(escolha) {
                case 1:
                    System.out.println("Vamos cadastrar os jogadores (OBS: Se o valor do salario cadastrado ultrapassar a folha salarial mensal o sistema não irá deixar cadastrar)");
                    for (int i = 0; i < 22; i++) {
                        clearBuffer(entrada);// limpar buffer
                        System.out.printf("Digite o nome do jogador [%d]: ", i+1);
                        nome = entrada.nextLine();

                        System.out.printf("Digite a posição do jogador [%d]: ", i+1);
                        posicao = entrada.nextLine();
                        
                        System.out.printf("Digite o salário do jogador [%d]: ", i+1);
                        salarioatual = entrada.nextFloat();

                        pro.profissional(i, nome, posicao, salarioatual);
                    }
                    pro.informações(escolha);
                    break;

                case 2:
                    System.out.println("Vamos cadastrar os jogadores juniors II(OBS: A idade deles deve ser entre 15 e 17 anos)");
                    for (int i = 0; i < 22; i++) {
                        clearBuffer(entrada);// limpar buffer
                        System.out.printf("Digite o nome do jogador junior [%d]: ", i+1);
                        nome = entrada.nextLine();

                        System.out.printf("Digite a idade do jogador junior [%d]: ", i+1);
                        idade = entrada.nextInt();

                        System.out.printf("Digite a posição do jogador [%d]: ", i+1);
                        posicao = entrada.nextLine();

                        junior.juniorII(i, nome, idade, posicao);
                    }
                    junior.informações(escolha);
                    break;
                
                case 3:
                    System.out.println("Vamos cadastrar os jogadores juniors I(OBS: A idade deles deve ser entre 11 e 14 anos)");
                    for (int i = 0; i < 22; i++) {
                        clearBuffer(entrada);// limpar buffer
                        System.out.printf("Digite o nome do jogador junior [%d]: ", i+1);
                        nome = entrada.nextLine();

                        System.out.printf("Digite a idade do jogador junior [%d]: ", i+1);
                        idade = entrada.nextInt();

                        System.out.printf("Digite a posição do jogador [%d]: ", i+1);
                        posicao = entrada.nextLine();

                        junior1.juniorI(i, nome, idade, posicao);
                    }
                    junior1.informações(escolha);
                    break;
                
                case 4:

                    break;

                case 0:
                    break;
                
                    default:
                    System.out.println("Opção Indisponível");
                    break; 
            }
            

        }while(escolha != 0);
    }

    private static void clearBuffer(Scanner entrada) {
        if (entrada.hasNextLine()) {
            entrada.nextLine();
        }
    }
}

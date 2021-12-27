import java.util.Scanner;

public class TesteAlunos extends AlunoGrad {

    static AlunoGrad est[];
    static PosGrad estpos[];
    static AlunoGrad alim[];
    static AlunoGrad transp[];
    static PosGrad alimpos[];
    static PosGrad transppos[];
    static String[] cidade;
    static String[] cidadepos;
    static int control;
    static int b, a, t, ap, tp;

    public static void main(String[] args) {
        int escolha, disciplinasatuais, tipo, grad, escpos, quantcitypos, quantcity, quantalunos, quantalunospos;
        Scanner entrada = new Scanner(System.in);

        AlunoGrad est1 = new AlunoGrad();
        PosGrad est1pos = new PosGrad();

        do { 
            // Seleções para alunos de Graduação ------------------------------------------------------------------------------
            System.out.println("\nO nosso Sistema faz seleções para Graduação e Pós-Graduação");
            System.out.println("1 - Graduação");
            System.out.println("2 - Pós-Graduação");
            System.out.println("0 - SAIR");
            System.out.print("O que deseja: ");
            grad = entrada.nextInt();

            switch (grad) {
                case 1:
                    System.out.print("Para comecar a seleção me informe quantos estudantes irão participar do processo de seleção: ");
                    quantalunos = entrada.nextInt();

                    System.out.println("Antes de iniciarmos a seleção é importante que informe os dados a seguir, pois serão usados para cada seleção");
                    System.out.print("Quantidade de disciplinas do semestre: ");
                    disciplinasatuais = entrada.nextInt();

                    System.out.print("Informe quantas cidades a prefeitura disponibiliza transporte: ");
                    quantcity = entrada.nextInt();

                    cidade = new String[quantcity];
                    for(int c = 0; c <quantcity; c++){
                        cidade[c] = new String();
                    }
                                
                    for (int i = 0; i < quantcity; i++) {
                        System.out.print("Informe o nome de uma das cidade: ");
                        cidade[i] = entrada.next();
                    }

                    //inicialização de atributos necessários
                    est1.setIdeatual(0);
                    est1.setSelecionado(-1);
                    est1.setAlunoatual(0);
                    AlunoGrad.selecionadoalim = 0;
                    AlunoGrad.selecionadotrans = 0;
                    b = 0; a = 0; t = 0;

                    alim = new AlunoGrad[quantalunos];
                    for (int i = 0; i < quantalunos; i++) {
                        alim[i] = new AlunoGrad();
                    }

                    transp = new AlunoGrad[quantalunos];
                    for (int i = 0; i < quantalunos; i++) {
                        transp[i] = new AlunoGrad();
                    }

                    System.out.println("\nAgora vamos cadastrar os alunos");

                   

                    est = new AlunoGrad[quantalunos];
                    for (int i = 0; i < quantalunos; i++) {
                        est[i] = new AlunoGrad();

                        System.out.printf("\nDe qual seleção o aluno %d irá participar?\n", i+1);
                        System.out.println("1 - Seleção de Bolsistas");
                        System.out.println("2 - Seleção para auxílio alimentação");
                        System.out.println("3 - Seleção para auxilio transporte");
                        System.out.println("0 - CANCELAR SELEÇÃO (ATENÇÃO: caso cancelle todos os dados da seleção serão apagados)");
                        System.out.print("Qual: ");
                        escolha = entrada.nextInt();
                        control = escolha;

                        switch (escolha){
                            case 1: 
                                clearBuffer(entrada);// limpar buffer
                                System.out.println("Cadastro de aluno");
                                System.out.print("Nome do Aluno: ");
                                est[i].setNome(entrada.nextLine());

                                System.out.print("Curso: ");
                                est[i].setCurso(entrada.nextLine());

                                System.out.print("Matrícula: ");
                                est[i].setMatricula(entrada.next());

                                System.out.print("CPF: ");
                                est[i].setCpf(entrada.next());

                                System.out.print("Endereço (Cidade onde mora): ");
                                est[i].setCidade(entrada.next());

                                System.out.print("Email: ");
                                est[i].setEmail(entrada.next());

                                System.out.print("Telefone: ");
                                est[i].setTelefone(entrada.next());

                                System.out.print("IDE do estudante: ");
                                est[i].setIde(entrada.nextFloat());

                                System.out.print("Digite a quantidade de disciplinas que o estudante esta cursando no semestre: ");
                                est[i].setDisciplina(entrada.nextInt());

                                est1.bolsistas(est[i].getNome(), est[i].getMatricula(), est[i].getCpf(),est[i].getCurso(),est[i].getEmail(), est[i].getTelefone(), est[i].getCidade(), est[i].getIde(), est[i].getDisciplina(), disciplinasatuais, i);

                                System.out.print("Aluno cadastrado\n");
                                b++;
                                break;

                            case 2:
                                System.out.println("\nCadastro de aluno");
                                System.out.print("O aluno deseja ser chamado por /n[1] - nome original /n[2] - nome social: ");
                                tipo = entrada.nextInt();
                                
                                clearBuffer(entrada);// limpar buffer
                                if (tipo == 1) {
                                    System.out.print("Nome do aluno: ");
                                    est[i].setNome(entrada.nextLine());
                                    System.out.println("Ok! Na catraca do restaurante será usado seu nome original");
                                } else {
                                    System.out.print("Nome social: ");
                                    est[i].setNome(entrada.nextLine());
                                    System.out.println("Ok! Na catraca do restaurante será usado seu nome social");
                                    }

                                System.out.print("Curso: ");
                                est[i].setCurso(entrada.nextLine());

                                System.out.print("Matrícula: ");
                                est[i].setMatricula(entrada.next());

                                System.out.print("CPF: ");
                                est[i].setCpf(entrada.next());

                                System.out.print("Endereço (Cidade onde mora): ");
                                est[i].setCidade(entrada.next());

                                System.out.print("Email: ");
                                est[i].setEmail(entrada.next());

                                System.out.print("Telefone: ");
                                est[i].setTelefone(entrada.next());

                                System.out.print("Renda: ");
                                est[i].setRenda(entrada.nextFloat());

                                System.out.print("Digite a quantidade de disciplinas que o estudante esta cursando no semestre: ");
                                est[i].setDisciplina(entrada.nextInt());

                                est1.alimentacao(i, tipo);
                                
                                System.out.println("Aluno cadastrado");
                                a++;
                                break;

                            case 3:
                                clearBuffer(entrada);// limpar buffer
                                System.out.println("\nCadastro de aluno");
                                System.out.print("Nome do aluno: ");
                                est[i].setNome(entrada.nextLine());

                                System.out.print("Curso: ");
                                est[i].setCurso(entrada.nextLine());

                                System.out.print("Matrícula: ");
                                est[i].setMatricula(entrada.next());

                                System.out.print("CPF: ");
                                est[i].setCpf(entrada.next());

                                System.out.print("Endereço (Cidade onde mora): ");
                                est[i].setCidade(entrada.next());

                                System.out.print("Email: ");
                                est[i].setEmail(entrada.next());

                                System.out.print("Telefone: ");
                                est[i].setTelefone(entrada.next());

                                System.out.print("Renda: ");
                                est[i].setRenda(entrada.nextFloat());

                                System.out.print("Digite a quantidade de disciplinas que o estudante esta cursando no semestre: ");
                                est[i].setDisciplina(entrada.nextInt());
                            
                                est1.transporte(i, quantcity);

                                System.out.println("Aluno cadastrado");
                                t++;
                                break;

                            case 0:
                                est1.setIdeatual(0);
                                est1.setSelecionado(-1);
                                est1.setAlunoatual(0);
                                AlunoGrad.selecionadoalim = 0;
                                AlunoGrad.selecionadotrans = 0;
                                b = 0; a = 0; t = 0;
                                break;

                            default:
                            System.out.println("Opção Indisponível");
                        }

                    }
                    if(control!=0){
                        est1.informacoes();
                    }
                    String menu;
                    System.out.print("Digite qualquer número ou letra para voltar ao Menu Inicial");
                    menu = entrada.next();
                    break;
                    

                case 2:
                    // Seleções para alunos de Pós-Graduação-----------------------------------------------------------------------
                    System.out.print("Para comecar a seleção me informe quantos estudantes irão participar do processo de seleção: ");
                    quantalunospos = entrada.nextInt();

                    System.out.print("Antes de continuarmos o cadastro, informe quantas cidades a prefeitura disponibiliza transporte: ");
                    quantcitypos = entrada.nextInt();

                    cidadepos = new String[quantcitypos];
                    for(int c = 0; c <quantcitypos; c++){
                        cidadepos[c] = new String();
                    }
                                
                    for (int i = 0; i < quantcitypos; i++) {
                        System.out.print("Informe o nome de uma das cidade: ");
                        cidadepos[i] = entrada.next();
                    }
                    
                    //inicialização de atributos necessários
                    PosGrad.selecionadoposalim = 0;
                    PosGrad.selecionadopostrans = 0;
                    ap = 0; tp = 0;

                    alimpos = new PosGrad[quantalunospos];
                    for (int i = 0; i < quantalunospos; i++) {
                        alimpos[i] = new PosGrad();
                    }

                    transppos = new PosGrad[quantalunospos];
                    for (int i = 0; i < quantalunospos; i++) {
                    transppos[i] = new PosGrad();
                    }

                    estpos = new PosGrad[quantalunospos];
                    for (int i = 0; i < quantalunospos; i++) {
                        estpos[i] = new PosGrad();

                        System.out.printf("\nDe qual seleção o aluno %d irá participar?\n", i+1);
                        System.out.println("1 - Seleção para auxílio alimentação");
                        System.out.println("2 - Seleção para auxilio transporte");
                        System.out.println("0 - CANCELAR SELEÇÃO (ATENÇÃO: caso cancelle todos os dados da seleção serão apagados)");
                        System.out.print("Qual: ");
                        escpos =  entrada.nextInt();
                        control = escpos;

                        switch (escpos){
                            case 1:
                                clearBuffer(entrada);// limpar buffer
                                System.out.println("\nCadastro de aluno");
                                System.out.print("Nome do aluno: ");
                                estpos[i].setNome(entrada.nextLine());

                                System.out.print("Pós-Graduação em: ");
                                estpos[i].setCurso(entrada.nextLine());

                                System.out.print("Matrícula: ");
                                estpos[i].setMatricula(entrada.next());

                                System.out.print("CPF: ");
                                estpos[i].setCpf(entrada.next());

                                System.out.print("Endereço (Cidade onde mora): ");
                                estpos[i].setCidade(entrada.next());

                                System.out.print("Email: ");
                                estpos[i].setEmail(entrada.next());

                                System.out.print("Telefone: ");
                                estpos[i].setTelefone(entrada.next());

                                System.out.print("Renda: ");
                                estpos[i].setRenda(entrada.nextFloat());

                                est1pos.alimentacao(i, 0);

                                System.out.println("\nAluno cadastrado");
                                ap++;
                                break;

                            case 2:
                                clearBuffer(entrada);// limpar buffer
                                System.out.println("\nCadastro de aluno");
                                System.out.print("Nome do aluno: ");
                                estpos[i].setNome(entrada.nextLine());

                                System.out.print("Pós-Graduação em: ");
                                estpos[i].setCurso(entrada.nextLine());

                                System.out.print("Matrícula: ");
                                estpos[i].setMatricula(entrada.next());

                                System.out.print("CPF: ");
                                estpos[i].setCpf(entrada.next());

                                System.out.print("Endereço (Cidade onde mora): ");
                                estpos[i].setCidade(entrada.next());

                                System.out.print("Email: ");
                                estpos[i].setEmail(entrada.next());

                                System.out.print("Telefone: ");
                                estpos[i].setTelefone(entrada.next());

                                System.out.print("Renda: ");
                                estpos[i].setRenda(entrada.nextFloat());

                                est1pos.transporte(i, quantcitypos);

                                System.out.println("\nAluno cadastrado");
                                tp++;
                                break;

                            case 0:
                                PosGrad.selecionadoposalim = 0;
                                PosGrad.selecionadopostrans = 0;
                                ap = 0; tp = 0;
                                break;

                            default:
                                System.out.println("Opção Indísponível");
                        }
                    }
                    est1pos.informacoes();
                    break;

                case 0:
                    System.out.println("Até a próxima");
                    break;

                default:
                    System.out.println("Opção Indísponível");
            }
        } while (grad!=0);     
    }

    private static void clearBuffer(Scanner entrada) {
        if (entrada.hasNextLine()) {
            entrada.nextLine();
        }
    }
}

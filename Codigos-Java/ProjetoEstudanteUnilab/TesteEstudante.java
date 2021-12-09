import java.util.Scanner;

public class TesteEstudante{
    public static void main(String[] args) {
        int escolha, disciplinasatuais;
        Scanner entrada = new Scanner(System.in);

        EstudanteGraduacao est[];
        
        EstudanteGraduacao est1 = new EstudanteGraduacao();
        EstudanteGraduacao ali1 = new EstudanteGraduacao();
        EstudanteGraduacao transp1 = new EstudanteGraduacao();

        do{
            System.out.println("MENU");
            System.out.println("1 - Seleção de Bolsistas");
            System.out.println("2 - Seleção para auxílio alimentação");
            System.out.println("3 - Seleção para auxilio transporte");
            System.out.println("0 - Para sair");
            System.out.print("O que deseja: ");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    int quant;
                    System.out.print("Quantos alunos participarão da seleção: ");
                    quant = entrada.nextInt();
                    est = new EstudanteGraduacao[quant];
                    System.out.print("Antes de digitar os dados dos alunos digite a quantidade de disciplinas do semestre: ");
                    disciplinasatuais = entrada.nextInt();


                    //inicializar atributos necessários
                    est1.setIdeatual(0);
                    est1.setSelecionado(-1);
                    est1.setAlunoatual(0);

                    for (int i = 0; i < quant; i++) {
                        est[i] = new EstudanteGraduacao();

                        System.out.println("Cadastro de aluno");
                        System.out.print("Nome do Aluno: ");
                        est[i].setNome(entrada.next());

                        System.out.print("Curso: ");
                        est[i].setCurso(entrada.next());

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

                        est1.Bolsista(est[i].getNome(), est[i].getMatricula(), est[i].getCpf(), est[i].getCurso(), est[i].getEmail(), est[i].getTelefone(), est[i].getCidade(), est[i].getIde(), est[i].getDisciplina(), disciplinasatuais, i, quant);
                    }

                    break;

                case 2:
                    //Nas opções auxilio aliemntação e auxilio transporte estava tendo problema de null point quando pegava os dados daqui, por isso fiz a coleta de dados dentro do próprio método, como o professor pode obsevar na classe EstudanteGraduação
                
                    ali1.Alimentacao();
                    break;

                case 3:
                    transp1.Transporte();
                    break;

                case 0:
                    System.out.println("Até a próxima");
                    break;

                default:
                System.out.println("Opção Indisponível");
            }
        }while(escolha!=0);
    }
}
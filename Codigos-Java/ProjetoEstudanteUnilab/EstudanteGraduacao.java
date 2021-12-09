import java.util.Scanner;

public class EstudanteGraduacao extends Estudante{
    public EstudanteGraduacao() {
    }

    Scanner entrada = new Scanner(System.in);
    private float ideatual;
    private int selecionado, alunoatual;
    private String catraca;
    int tipo;
    

    public EstudanteGraduacao(String nome, String nsocial, String matricula, String cpf, String curso, String email, String telefone, String cidade, float renda, float ide, int disciplina) {
        super(nome, matricula, cpf, curso, email, telefone, cidade, renda, ide, disciplina);

        setIdeatual(ideatual);
        setSelecionado(selecionado);
        setCatraca(catraca);
        setAlunoatual(alunoatual);
    }

    public int getAlunoatual(){
        return alunoatual;
    }

    public void setAlunoatual(int aluno){
        this.alunoatual = aluno;
    }

    public float getIdeatual(){
        return ideatual;
    }

    public void setIdeatual(float idatual){
        this.ideatual = idatual;
    }

    public int getSelecionado(){
        return selecionado;
    }

    public void setSelecionado(int selecionado2){
        this.selecionado = selecionado2;
    }

    public String getCatraca(){
        return catraca;
    }

    public void setCatraca(String cat){
        this.catraca = cat;
    }

    //Item A ----------------------------------------------------------------------------------------------------------------------------------
    public void Bolsista(String nome, String matricula, String cpf, String curso, String email, String telefone, String cidade, float ide, int disciplina, int disciplinasemestre, int pos, int quant){
        
        
        if(disciplinasemestre == disciplina){
            if (ideatual < ide){
                setNome(nome);
                setMatricula(matricula);
                setCpf(cpf);
                setCurso(curso);
                setEmail(email);
                setTelefone(telefone);
                setCidade(cidade);
                ideatual = ide;
                selecionado = pos;
            }
        }
        alunoatual++;
        if(alunoatual==quant){
            if (selecionado == -1) {
                System.out.println("Nenhum bolsista se qualifica");
            } 
            else {
                System.out.println("Aluno selecionado: ");
                System.out.printf("Nome %s ----- IDE: %.2f\n\n", getNome(), ideatual);
            }
        }
    }

    //Item B ----------------------------------------------------------------------------------------------------------------------------------
    public void Alimentacao(){
        EstudanteGraduacao ali[];
        int quant1;
        System.out.print("Quantos alunos participarão da seleção: ");
        quant1 = entrada.nextInt();
        ali = new EstudanteGraduacao[quant1];
        selecionado = 0;


        EstudanteGraduacao alim[];
        alim = new EstudanteGraduacao[quant1];
        for(int i = 0; i<quant1;i++){
            alim[i] = new EstudanteGraduacao();
        }

        for (int i = 0; i < quant1; i++) {
            ali[i] = new EstudanteGraduacao();

            System.out.println("\nCadastro de aluno");
            System.out.print("O aluno deseja ser chamado por /n[1] - nome original /n[2] - nome social: ");
            tipo = entrada.nextInt();
    
            if(tipo==1){
                System.out.print("Nome do aluno: ");
                ali[i].setNome(entrada.next());
                System.out.println("Ok! Na catraca do restaurante será usado seu nome original");
            }
            else{
                System.out.print("Nome social: ");
                ali[i].setNome(entrada.next());
                System.out.println("Ok! Na catraca do restaurante será usado seu nome social");
            }

            System.out.print("Curso: ");
            ali[i].setCurso(entrada.next());

            System.out.print("Matrícula: ");
            ali[i].setMatricula(entrada.next());

            System.out.print("CPF: ");
            ali[i].setCpf(entrada.next());

            System.out.print("Endereço (Cidade onde mora): ");
            ali[i].setCidade(entrada.next());

            System.out.print("Email: ");
            ali[i].setEmail(entrada.next());

            System.out.print("Telefone: ");
            ali[i].setTelefone(entrada.next());

            System.out.print("Renda: ");
            ali[i].setRenda(entrada.nextFloat());

            System.out.print("Digite a quantidade de disciplinas que o estudante esta cursando no semestre: ");
            ali[i].setDisciplina(entrada.nextInt());

            if(ali[i].getDisciplina()>=4){
                if(ali[i].getRenda()<1192.40){
                    alim[selecionado].setNome(ali[i].getNome());
                    alim[selecionado].setMatricula(ali[i].getMatricula());
                    alim[selecionado].setCpf(ali[i].getCpf());
                    alim[selecionado].setCurso(ali[i].getCurso());
                    alim[selecionado].setEmail(ali[i].getEmail());
                    alim[selecionado].setTelefone(ali[i].getTelefone());
                    alim[selecionado].setCidade(ali[i].getCidade());
                    alim[selecionado].setRenda(ali[i].getRenda());
                    alim[selecionado].setDisciplina(ali[i].getDisciplina());
                    if(tipo==1){
                        alim[selecionado].setCatraca("Original");
                    }
                    else{
                        alim[selecionado].setCatraca("Social");
                    }
                    selecionado++;
                }
            }
        }
        if (selecionado == 0) {
            System.out.println("Nenhum estudante se qualifica");
        }
        else{
            System.out.println("Alunos selecionados: ");
            for(int i = 0; i<selecionado; i++){
                System.out.printf("Nome %s ----- Catraca: %s\n", alim[i].getNome(), alim[i].getCatraca());
            }
            System.out.println("");
        }
    }

        //ITEM C ------------------------------------------------------------------------------------------------------------------------------
        public void Transporte(){
            EstudanteGraduacao transp[];
            int quant2, quantcity;
            String[] cidade;

            System.out.print("Quantos alunos participarão da seleção: ");
            quant2 = entrada.nextInt();
            transp = new EstudanteGraduacao[quant2];
            selecionado = 0;

            EstudanteGraduacao transport[];
            transport = new EstudanteGraduacao[quant2];
            for(int i = 0; i<quant2;i++){
                transp[i] = new EstudanteGraduacao();
            }

            System.out.print("Antes de contuarmos o cadastro, informe quantas cidades a prefeitura disponibiliza transporte: ");
            quantcity = entrada.nextInt();

            cidade = new String[quantcity];
            for (int i = 0; i < quantcity; i++){
                System.out.print("Informe o nome de uma das cidade: ");
                cidade[i] = entrada.next();
            }

            for (int i = 0; i < quant2; i++){
                transport[i] = new EstudanteGraduacao();

                System.out.println("\nCadastro de aluno");
                System.out.print("Nome do aluno: ");
                transport[i].setNome(entrada.next());

                System.out.print("Curso: ");
                transport[i].setCurso(entrada.next());

                System.out.print("Matrícula: ");
                transport[i].setMatricula(entrada.next());

                System.out.print("CPF: ");
                transport[i].setCpf(entrada.next());

                System.out.print("Endereço (Cidade onde mora): ");
                transport[i].setCidade(entrada.next());

                System.out.print("Email: ");
                transport[i].setEmail(entrada.next());

                System.out.print("Telefone: ");
                transport[i].setTelefone(entrada.next());

                System.out.print("Renda: ");
                transport[i].setRenda(entrada.nextFloat());

                System.out.print("Digite a quantidade de disciplinas que o estudante esta cursando no semestre: ");
                transport[i].setDisciplina(entrada.nextInt());

                if(transport[i].getCidade() != "Redenção" && transport[i].getCidade() != "Acarape"){
                    int poss = 0;
                    for(int k = 0; k < quantcity; k++){
                        if(transport[i].getCidade() == cidade[k]){
                            poss++;
                        }
                    }
                    if(poss==0){
                        if(transport[i].getRenda() <= 1788.6){
                            if(transport[i].getDisciplina() >= 4){
                                transp[selecionado].setNome(transport[i].getNome());
                                transp[selecionado].setMatricula(transport[i].getMatricula());
                                transp[selecionado].setCpf(transport[i].getCpf());
                                transp[selecionado].setCurso(transport[i].getCurso());
                                transp[selecionado].setEmail(transport[i].getEmail());
                                transp[selecionado].setTelefone(transport[i].getTelefone());
                                transp[selecionado].setCidade(transport[i].getCidade());
                                transp[selecionado].setRenda(transport[i].getRenda());
                                transp[selecionado].setDisciplina(transport[i].getDisciplina());
                                selecionado++;
                            }
                        }
                    }
                }
            }
            if (selecionado == 0) {
                System.out.println("Nenhum estudante se qualifica");
            }
            else{
                System.out.println("Alunos selecionados: ");
                for(int i = 0; i<selecionado; i++){
                    System.out.printf("Nome %s ----- Cidade: %s\n", transp[i].getNome(), transp[i].getCidade());
                }
                System.out.println("");
            }

        }
    
}

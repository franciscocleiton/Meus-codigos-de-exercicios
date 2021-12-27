public class AlunoGrad extends Aluno {
    private float ideatual;
    private int selecionado, alunoatual, poss;
    static int selecionadoalim, selecionadotrans;
    private String catraca;
    String cidade1 = "Redencao";
    String cidade2 = "Acarape";

    public int getPoss() {
        return poss;
    }

    public void setPoss(int po) {
        this.poss = po;
    }

    public int getAlunoatual() {
        return alunoatual;
    }

    public void setAlunoatual(int aluno) {
        this.alunoatual = aluno;
    }

    public float getIdeatual() {
        return ideatual;
    }

    public void setIdeatual(float idatual) {
        this.ideatual = idatual;
    }

    public int getSelecionado() {
        return selecionado;
    }

    public void setSelecionado(int selecionado2) {
        this.selecionado = selecionado2;
    }

    public String getCatraca() {
        return catraca;
    }

    public void setCatraca(String cat) {
        this.catraca = cat;
    }

    // ITEM II - A
    @Override
    public void bolsistas(String nome, String matricula, String cpf, String curso, String email, String telefone,
            String cidade, float ide, int disciplina, int disciplinasemestre, int pos) {

        if (disciplinasemestre <= disciplina) {
            if (ideatual < ide) {
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

    }

    @Override
    public void alimentacao(int pos, int tipo) {
        int i = pos;
        if (TesteAlunos.est[i].getDisciplina() >= 4) {
            if (TesteAlunos.est[i].getRenda() < 1192.40) {

                TesteAlunos.alim[selecionadoalim].setNome(TesteAlunos.est[i].getNome());
                TesteAlunos.alim[selecionadoalim].setMatricula(TesteAlunos.est[i].getMatricula());
                TesteAlunos.alim[selecionadoalim].setCpf(TesteAlunos.est[i].getCpf());
                TesteAlunos.alim[selecionadoalim].setCurso(TesteAlunos.est[i].getCurso());
                TesteAlunos.alim[selecionadoalim].setEmail(TesteAlunos.est[i].getEmail());
                TesteAlunos.alim[selecionadoalim].setTelefone(TesteAlunos.est[i].getTelefone());
                TesteAlunos.alim[selecionadoalim].setCidade(TesteAlunos.est[i].getCidade());
                TesteAlunos.alim[selecionadoalim].setRenda(TesteAlunos.est[i].getRenda());
                TesteAlunos.alim[selecionadoalim].setDisciplina(TesteAlunos.est[i].getDisciplina());
                if (tipo == 1) {
                    TesteAlunos.alim[selecionadoalim].setCatraca("Original");
                } else {
                    TesteAlunos.alim[selecionadoalim].setCatraca("Social");
                }
                selecionadoalim++;
            }
        }

    }

    @Override
    public void transporte(int pos, int quantcity) {
        int i = pos;
        poss = 0;
        if (TesteAlunos.est[i].getCidade().equals(cidade1) || TesteAlunos.est[i].getCidade().equals(cidade2)) {
            poss++;
        }
        for (int k = 0; k < quantcity; k++) {
            if (TesteAlunos.est[i].getCidade().equals(TesteAlunos.cidade[k])) {// Testar se os alunos são das cidades
                                                                               // que possuem transporte da prefeitura
                poss++;
            }
        }

        if (poss == 0) {
            if (TesteAlunos.est[i].getRenda() <= 1788.6) {
                if (TesteAlunos.est[i].getDisciplina() >= 4) {
                    TesteAlunos.transp[selecionadotrans].setNome(TesteAlunos.est[i].getNome());
                    TesteAlunos.transp[selecionadotrans].setMatricula(TesteAlunos.est[i].getMatricula());
                    TesteAlunos.transp[selecionadotrans].setCpf(TesteAlunos.est[i].getCpf());
                    TesteAlunos.transp[selecionadotrans].setCurso(TesteAlunos.est[i].getCurso());
                    TesteAlunos.transp[selecionadotrans].setEmail(TesteAlunos.est[i].getEmail());
                    TesteAlunos.transp[selecionadotrans].setTelefone(TesteAlunos.est[i].getTelefone());
                    TesteAlunos.transp[selecionadotrans].setCidade(TesteAlunos.est[i].getCidade());
                    TesteAlunos.transp[selecionadotrans].setRenda(TesteAlunos.est[i].getRenda());
                    TesteAlunos.transp[selecionadotrans].setDisciplina(TesteAlunos.est[i].getDisciplina());
                    selecionadotrans++;
                }
            }
        }
    }

    @Override
    public void informacoes() {
        System.out.println("\nAluno selecionado para ser bolsista: ");
        if (TesteAlunos.b == 0) {
            System.out.println("Não há candidatos");
        } else {
            if (selecionado == -1) {
                System.out.println("Nenhum aluno se qualifica");
            } else {
                System.out.printf("Nome: %s ----- IDE: %.2f\n", getNome(), ideatual);
            }
        }

        System.out.println("\n\nAlunos selecionados para auxilio alimentação: ");
        if (TesteAlunos.a == 0){
            System.out.println("Não há candidatos");
        }
        else{
            if (selecionadoalim == 0) {
                System.out.println("Nenhum estudante se qualifica");
            } else {
                for (int i = 0; i < selecionadoalim; i++) {
                    System.out.printf("Nome: %s ----- Catraca: %s\n", TesteAlunos.alim[i].getNome(), TesteAlunos.alim[i].getCatraca());
                }
            }
        }

        System.out.println("\n\nAlunos selecionados para auxilio transporte: ");
        if(TesteAlunos.t == 0){
            System.out.println("Não há candidatos");
        }
        else{
            if (selecionadotrans == 0) {
                System.out.println("Nenhum estudante se qualifica");
            } else {
                for (int i = 0; i < selecionadotrans; i++) {
                    System.out.printf("Nome: %s ----- Cidade: %s\n", TesteAlunos.transp[i].getNome(), TesteAlunos.transp[i].getCidade());
                }
            }
        }
    }
}

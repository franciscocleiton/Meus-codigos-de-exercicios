// Essa classe será usada para solução do item IV - Incluir no mínimo 3 métodos polimórficos no programa. Com isso, usei como exemplo alunos de Pós Graduação
// No exemplo irei utilizar uma simulação usando critérios mais basicos para a seleção para auxilio transporte e alimentação
// A. Seleção para auxilio alimentação - será para alunos que a reda seja de até 1,5 salário.
// B. Seleção para auxilio alimentação - para alunos que nao seja de cidades que a prefeitura disponibilize o transporte , que não seja da sede e que a renda seja ate de 1,5 salário 

// Com isso, teremos a implementação de 3 métodos polimorficos.


public class PosGrad extends AlunoGrad{
    static int selecionadoposalim, selecionadopostrans;
    int posspos;
    String cidadepos1 = "Redencao";
    String cidadepos2 = "Acarape";

    @Override
    public void alimentacao(int pos, int tipo){
        int i = pos;
       
        if(TesteAlunos.estpos[i].getRenda()<=1788.6){
            TesteAlunos.alimpos[selecionadoposalim].setNome(TesteAlunos.estpos[i].getNome());
            TesteAlunos.alimpos[selecionadoposalim].setMatricula(TesteAlunos.estpos[i].getMatricula());
            TesteAlunos.alimpos[selecionadoposalim].setCpf(TesteAlunos.estpos[i].getCpf());
            TesteAlunos.alimpos[selecionadoposalim].setCurso(TesteAlunos.estpos[i].getCurso());
            TesteAlunos.alimpos[selecionadoposalim].setEmail(TesteAlunos.estpos[i].getEmail());
            TesteAlunos.alimpos[selecionadoposalim].setTelefone(TesteAlunos.estpos[i].getTelefone());
            TesteAlunos.alimpos[selecionadoposalim].setCidade(TesteAlunos.estpos[i].getCidade());
            TesteAlunos.alimpos[selecionadoposalim].setRenda(TesteAlunos.estpos[i].getRenda());
                    
            selecionadoposalim++;
        }
    }

    @Override
    public void transporte(int pos, int quantcity){
        int i = pos;
        posspos = 0;
        if(TesteAlunos.estpos[i].getCidade().equals(cidadepos1) || TesteAlunos.estpos[i].getCidade().equals(cidadepos2)){
            posspos++;
        }
        for(int k = 0; k < quantcity; k++){ // Testar se os alunos são das cidades que possuem transporte da prefeitura
            if(TesteAlunos.estpos[i].getCidade().equals(TesteAlunos.cidadepos[k])){
                posspos++;
            }
        }
        if(posspos==0){
            if(TesteAlunos.estpos[i].getRenda() <= 1788.6){
                TesteAlunos.transppos[selecionadopostrans].setNome(TesteAlunos.estpos[i].getNome());
                TesteAlunos.transppos[selecionadopostrans].setMatricula(TesteAlunos.estpos[i].getMatricula());
                TesteAlunos.transppos[selecionadopostrans].setCpf(TesteAlunos.estpos[i].getCpf());
                TesteAlunos.transppos[selecionadopostrans].setCurso(TesteAlunos.estpos[i].getCurso());
                TesteAlunos.transppos[selecionadopostrans].setEmail(TesteAlunos.estpos[i].getEmail());
                TesteAlunos.transppos[selecionadopostrans].setTelefone(TesteAlunos.estpos[i].getTelefone());
                TesteAlunos.transppos[selecionadopostrans].setCidade(TesteAlunos.estpos[i].getCidade());
                TesteAlunos.transppos[selecionadopostrans].setRenda(TesteAlunos.estpos[i].getRenda());
                TesteAlunos.transppos[selecionadopostrans].setDisciplina(TesteAlunos.estpos[i].getDisciplina());
                selecionadopostrans++;
            }
        }
    }

    @Override
    public void informacoes(){
        System.out.println("\nAlunos selecionados para auxilio alimentação: ");
        if(TesteAlunos.ap == 0){
            System.out.println("Não há candidatos");
        }
        else{
            if (selecionadoposalim == 0) {
                System.out.println("Nenhum estudante se qualifica");
            }
            else{
                for(int i = 0; i<selecionadoposalim; i++){
                    System.out.printf("Nome: %s\n", TesteAlunos.alimpos[i].getNome());
                }
            }
        }
        System.out.println("\nAlunos selecionados para auxilio transporte: ");
        if(TesteAlunos.tp == 0){
            System.out.println("Não há candidatos");
        }
        else{
            if (selecionadopostrans == 0) {
                System.out.println("Nenhum estudante se qualifica");
            }
            else{
                for(int i = 0; i<selecionadopostrans; i++){
                    System.out.printf("Nome: %s ----- Cidade: %s\n", TesteAlunos.transppos[i].getNome(), TesteAlunos.transppos[i].getCidade());
                }
            }
        }
    }  
}

public class FranciscoCleiton_Subclasse3 extends FranciscoCleiton_Subclasse2{
    int goleiro = 0;
    int zagueiro1 = 0;
    int zagueiro2 = 0;
    int lateral1 = 0;
    int lateral2 = 0;
    int volante = 0;
    int meiocampo1 = 0;
    int meiocampo2 = 0;
    int atacante1 = 0;
    int atacante2 = 0;
    int centrovante = 0;

    int quantjogadores;

    @Override
    public void juniorI(int pos, String nome, int idade, String posicao) {
        if (posicao.equals("goleiro")) {
            if(goleiro >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (idade >= 11 && idade <= 14)  {
                    FranciscoCleiton_Testes.jogjI[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogjI[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogjI[pos].setIdadejunior(idade);
                    goleiro++;
                    quantjogadores++;
                    System.out.println("Jogador Junior Cadastrado");
                }
                else {
                    System.out.println("A idade do jogador junior não se enquadra nos critérios");
                }
            }
            
        }

        if (posicao.equals("zagueiro1")) {
            if(zagueiro1 >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (idade >= 11 && idade <= 14)  {
                    FranciscoCleiton_Testes.jogjI[pos].setJogador(nome);;
                    FranciscoCleiton_Testes.jogjI[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogjI[pos].setIdadejunior(idade);
                    zagueiro1++;
                    quantjogadores++;
                    System.out.println("Jogador Junior Cadastrado");
                }
                else {
                    System.out.println("A idade do jogador junior não se enquadra nos critérios");
                }
            }
            
        }

        if (posicao.equals("zagueiro2")) {
            if(zagueiro2 >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (idade >= 11 && idade <= 14)  {
                    FranciscoCleiton_Testes.jogjI[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogjI[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogjI[pos].setIdadejunior(idade);
                    zagueiro2++;
                    quantjogadores++;
                    System.out.println("Jogador Junior Cadastrado");
                }
                else {
                    System.out.println("A idade do jogador junior não se enquadra nos critérios");
                }
            }
            
        }
        if (posicao.equals("lateral1")) {
            if(lateral1 >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (idade >= 11 && idade <= 14)  {
                    FranciscoCleiton_Testes.jogjI[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogjI[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogjI[pos].setIdadejunior(idade);
                    lateral1++;
                    quantjogadores++;
                    System.out.println("Jogador Junior Cadastrado");
                }
                else {
                    System.out.println("A idade do jogador junior não se enquadra nos critérios");
                }
            }
            
        }
        if (posicao.equals("lateral2")) {
            if(lateral2 >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (idade >= 11 && idade <= 14)  {
                    FranciscoCleiton_Testes.jogjI[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogjI[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogjI[pos].setIdadejunior(idade);
                    lateral2++;
                    quantjogadores++;
                    System.out.println("Jogador Junior Cadastrado");
                }
                else {
                    System.out.println("A idade do jogador junior não se enquadra nos critérios");
                }
            }
            
        }
        if (posicao.equals("volante")) {
            if(volante >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (idade >= 11 && idade <= 14)  {
                    FranciscoCleiton_Testes.jogjI[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogjI[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogjI[pos].setIdadejunior(idade);
                    volante++;
                    quantjogadores++;
                    System.out.println("Jogador Junior Cadastrado");
                }
                else {
                    System.out.println("A idade do jogador junior não se enquadra nos critérios");
                }
            }
            
        }
        if (posicao.equals("meiocampo1")) {
            if(meiocampo1 >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (idade >= 11 && idade <= 14)  {
                    FranciscoCleiton_Testes.jogjI[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogjI[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogjI[pos].setIdadejunior(idade);
                    meiocampo1++;
                    quantjogadores++;
                    System.out.println("Jogador Junior Cadastrado");
                }
                else {
                    System.out.println("A idade do jogador junior não se enquadra nos critérios");
                }
            }
            
        }
        if (posicao.equals("meiocampo2")) {
            if(meiocampo2 >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (idade >= 11 && idade <= 14)  {
                    FranciscoCleiton_Testes.jogjI[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogjI[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogjI[pos].setIdadejunior(idade);
                    meiocampo2++;
                    quantjogadores++;
                    System.out.println("Jogador Junior Cadastrado");
                }
                else {
                    System.out.println("A idade do jogador junior não se enquadra nos critérios");
                }
            }
            
        }
        if (posicao.equals("atacante1")) {
            if(atacante1 >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (idade >= 11 && idade <= 14)  {
                    FranciscoCleiton_Testes.jogjI[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogjI[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogjI[pos].setIdadejunior(idade);
                    atacante1++;
                    quantjogadores++;
                    System.out.println("Jogador Junior Cadastrado");
                }
                else {
                    System.out.println("A idade do jogador junior não se enquadra nos critérios");
                }
            }
            
        }
        if (posicao.equals("atacante2")) {
            if(atacante2 >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (idade >= 11 && idade <= 14)  {
                    FranciscoCleiton_Testes.jogjI[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogjI[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogjI[pos].setIdadejunior(idade);
                    atacante2++;
                    quantjogadores++;
                    System.out.println("Jogador Junior Cadastrado");
                }
                else {
                    System.out.println("A idade do jogador junior não se enquadra nos critérios");
                }
            }
            
        }

        if (posicao.equals("centrovante")) {
            if(centrovante >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (idade >= 11 && idade <= 14)  {
                    FranciscoCleiton_Testes.jogjI[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogjI[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogjI[pos].setIdadejunior(idade);
                    centrovante++;
                    quantjogadores++;
                    System.out.println("Jogador Junior Cadastrado");
                }
                else {
                    System.out.println("A idade do jogador junior não se enquadra nos critérios");
                }
            }
            
        }
        
    }


    @Override
    public void informações(int tipo) {
        if (quantjogadores <= 24) {
            for (int i = 0; i < quantjogadores; i++) {
                System.out.print("Jogador: "+ FranciscoCleiton_Testes.jogjII[i].getJogador());
                System.out.print(" --> Posição: "+ FranciscoCleiton_Testes.jogjII[i].getPosicao());
                System.out.print(" --> Salário: \n"+ FranciscoCleiton_Testes.jogjII[i].getSalario());
            }
        }
        else {
            System.out.println("A quantidade de jogadores impossibilita a operação");
        }
        
    }
}

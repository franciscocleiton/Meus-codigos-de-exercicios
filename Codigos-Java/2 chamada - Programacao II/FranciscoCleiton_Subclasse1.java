public class FranciscoCleiton_Subclasse1 extends FranciscoCleiton_Superclasse{
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

    int quantjogadores = 0;

    @Override
    public void profissional(int pos, String nome, String posicao, float salario) {
        if (posicao.equals("goleiro")) {
            if(goleiro >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (FranciscoCleiton_Testes.salpro < FranciscoCleiton_Testes.salmaxpro)  {
                    FranciscoCleiton_Testes.jogpro[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogpro[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogpro[pos].setSalario(salario);
                    FranciscoCleiton_Testes.salpro += salario;
                    goleiro++;
                    quantjogadores++;
                    System.out.println("Jogador Cadastrado");
                }
                else {
                    System.out.println("Folha salarial indisponível");
                }
            }
            
        }
        if (posicao.equals("zagueiro1")) {
            if(zagueiro1 >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (FranciscoCleiton_Testes.salpro < FranciscoCleiton_Testes.salmaxpro)  {
                    FranciscoCleiton_Testes.jogpro[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogpro[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogpro[pos].setSalario(salario);
                    FranciscoCleiton_Testes.salpro += salario;
                    zagueiro1++;
                    quantjogadores++;
                    System.out.println("Jogador Cadastrado");
                }
                else {
                    System.out.println("Folha salarial indisponível");
                }
            }
        }

        if (posicao.equals("zagueiro2")) {
            if(zagueiro2 >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (FranciscoCleiton_Testes.salpro < FranciscoCleiton_Testes.salmaxpro)  {
                    FranciscoCleiton_Testes.jogpro[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogpro[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogpro[pos].setSalario(salario);
                    FranciscoCleiton_Testes.salpro += salario;
                    zagueiro2++;
                    quantjogadores++;
                    System.out.println("Jogador Cadastrado");
                }
                else {
                    System.out.println("Folha salarial indisponível");
                }
            }
        }

        if (posicao.equals("lateral1")) {
            if(lateral1 >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (FranciscoCleiton_Testes.salpro < FranciscoCleiton_Testes.salmaxpro)  {
                    FranciscoCleiton_Testes.jogpro[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogpro[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogpro[pos].setSalario(salario);
                    FranciscoCleiton_Testes.salpro += salario;
                    lateral1++;
                    quantjogadores++;
                    System.out.println("Jogador Cadastrado");
                }
                else {
                    System.out.println("Folha salarial indisponível");
                }
            }
        }

        if (posicao.equals("lateral2")) {
            if(lateral2 >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (FranciscoCleiton_Testes.salpro < FranciscoCleiton_Testes.salmaxpro)  {
                    FranciscoCleiton_Testes.jogpro[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogpro[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogpro[pos].setSalario(salario);
                    FranciscoCleiton_Testes.salpro += salario;
                    lateral2++;
                    quantjogadores++;
                    System.out.println("Jogador Cadastrado");
                }
                else {
                    System.out.println("Folha salarial indisponível");
                }
            }
        }

        if (posicao.equals("volante")) {
            if(volante >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (FranciscoCleiton_Testes.salpro < FranciscoCleiton_Testes.salmaxpro)  {
                    FranciscoCleiton_Testes.jogpro[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogpro[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogpro[pos].setSalario(salario);
                    FranciscoCleiton_Testes.salpro += salario;
                    volante++;
                    quantjogadores++;
                    System.out.println("Jogador Cadastrado");
                }
                else {
                    System.out.println("Folha salarial indisponível");
                }
            }
        }

        if (posicao.equals("meiocampo1")) {
            if(meiocampo1 >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (FranciscoCleiton_Testes.salpro < FranciscoCleiton_Testes.salmaxpro)  {
                    FranciscoCleiton_Testes.jogpro[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogpro[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogpro[pos].setSalario(salario);
                    FranciscoCleiton_Testes.salpro += salario;
                    meiocampo1++;
                    quantjogadores++;
                    System.out.println("Jogador Cadastrado");
                }
                else {
                    System.out.println("Folha salarial indisponível");
                }
            }
        }

        if (posicao.equals("meiocampo2")) {
            if(meiocampo2 >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (FranciscoCleiton_Testes.salpro < FranciscoCleiton_Testes.salmaxpro)  {
                    FranciscoCleiton_Testes.jogpro[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogpro[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogpro[pos].setSalario(salario);
                    FranciscoCleiton_Testes.salpro += salario;
                    meiocampo2++;
                    quantjogadores++;
                    System.out.println("Jogador Cadastrado");
                }
                else {
                    System.out.println("Folha salarial indisponível");
                }
            }
        }

        if (posicao.equals("atacante1")) {
            if(atacante1 >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (FranciscoCleiton_Testes.salpro < FranciscoCleiton_Testes.salmaxpro)  {
                    FranciscoCleiton_Testes.jogpro[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogpro[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogpro[pos].setSalario(salario);
                    FranciscoCleiton_Testes.salpro += salario;
                    atacante1++;
                    quantjogadores++;
                    System.out.println("Jogador Cadastrado");
                }
                else {
                    System.out.println("Folha salarial indisponível");
                }
            }
        }

        if (posicao.equals("atacante2")) {
            if(atacante2 >= 2) {
                System.out.println("Posição Indisponivel");
            }
            else {
                if (FranciscoCleiton_Testes.salpro < FranciscoCleiton_Testes.salmaxpro)  {
                    FranciscoCleiton_Testes.jogpro[pos].setJogador(nome);
                    FranciscoCleiton_Testes.jogpro[pos].setPosicao(posicao);
                    FranciscoCleiton_Testes.jogpro[pos].setSalario(salario);
                    FranciscoCleiton_Testes.salpro += salario;
                    atacante2++;
                    quantjogadores++;
                    System.out.println("Jogador Cadastrado");
                }
                else {
                    System.out.println("Folha salarial indisponível");
                }
            }
            
        }
        System.out.printf("Folha salarial atual: %s\n", FranciscoCleiton_Testes.salpro);
        
    }

    @Override
    public void informações(int tipo) {
        if (tipo == 0) {
            if (quantjogadores <= 24) {
                for (int i = 0; i < quantjogadores; i++) {
                    System.out.print("Jogador: "+ FranciscoCleiton_Testes.jogpro[i].getJogador());
                    System.out.print(" --> Posição: "+ FranciscoCleiton_Testes.jogpro[i].getPosicao());
                    System.out.print(" --> Salário: \n"+ FranciscoCleiton_Testes.jogpro[i].getSalario());
                }
            }
            else {
                System.out.println("A quantidade de jogadores impossibilita a operação");
            }
        } 
    }

    @Override
    public void juniorII(int pos, String nome, int idade, String posicao) {
        
        
    }

    @Override
    public void juniorI(int pos, String nome, int idade, String posicao) {
        
        
    }

    @Override
    public void infantil() {
        
        
    }
    
}

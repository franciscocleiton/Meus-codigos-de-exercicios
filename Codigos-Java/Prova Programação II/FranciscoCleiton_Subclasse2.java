public class FranciscoCleiton_Subclasse2 extends FranciscoCleiton_Superclasse{
    static int s = 0;
    static int o;

    int test;
    int t, k;

    public FranciscoCleiton_Subclasse2(String nome, String cpf, String nacionalidade,String empresa, float preco, int status, String destino) {
        super(nome, cpf, nacionalidade, empresa, preco, status, destino);
    }

    public FranciscoCleiton_Subclasse2() {
    }

    // Todos os métodos são adicionados para o funcionamento da classe, porém só será implementado os necessários para esta classe executiva
    @Override
    public void vooeb185(int i, int mes, int v, int qualav) {
        t = mes-1;
        k = i-1;
        if (qualav == 0) {
            FranciscoCleiton_Testes.passageiro185av1[t][k][v].setStatus(1);
        }
        else if (qualav == 1) {
            FranciscoCleiton_Testes.passageiro185av2[mes][i][v].setStatus(1);
        }
    }

    @Override
    public void vooeb195(int i, int mes, int v, int qualav) {
        t = mes-1;
        k = i-1;
        if (qualav == 2) {
            FranciscoCleiton_Testes.passageiro195av1[t][k][v].setStatus(1);
        }
        else if (qualav == 3) {
            FranciscoCleiton_Testes.passageiro195av2[mes][i][v].setStatus(1);
        }
    }

    @Override
    public void testvaga(int i, int mes, int v, int qualav) {
        t = mes-1;
        k = i-1;
        if (qualav == 0) {
            if(FranciscoCleiton_Testes.vagasvoo185 == FranciscoCleiton_Testes.v185av1[t][k] + 1) {
                System.out.println("Não há vagas para esse dia");
            }else{
                test = FranciscoCleiton_Testes.passageiro185av1[t][k][FranciscoCleiton_Testes.v185av1[t][k]].getStatus();     
                if (test == 1){
                    FranciscoCleiton_Subclasse2.s = 1;
                }
                else {
                    FranciscoCleiton_Subclasse2.s = 0;
                }
            }
        }
        
        else if (qualav == 1) {
            if(FranciscoCleiton_Testes.vagasvoo185 == FranciscoCleiton_Testes.v185av2[t][k] + 1) {
                System.out.println("Não há vagas para esse dia");
            }else{
                test = FranciscoCleiton_Testes.passageiro185av1[t][k][FranciscoCleiton_Testes.v185av2[t][k]].getStatus();     
                if (test == 1){
                    FranciscoCleiton_Subclasse2.s = 1;
                }
                else {
                    FranciscoCleiton_Subclasse2.s = 0;
                }
            }
        }

        else if (qualav == 2) {
            if(FranciscoCleiton_Testes.vagasvoo195 == FranciscoCleiton_Testes.v195av1[t][k] + 1) {
                System.out.println("Não há vagas para esse dia");
            }else{
                test = FranciscoCleiton_Testes.passageiro195av1[t][k][FranciscoCleiton_Testes.v195av1[t][k]].getStatus();     
                if (test == 1){
                    FranciscoCleiton_Subclasse2.s = 1;
                }
                else {
                    FranciscoCleiton_Subclasse2.s = 0;
                }
            }
        }

        else if (qualav == 3) {
            if(FranciscoCleiton_Testes.vagasvoo195 == FranciscoCleiton_Testes.v195av2[t][k] + 1) {
                System.out.println("Não há vagas para esse dia");
            }else{
                test = FranciscoCleiton_Testes.passageiro195av1[t][k][FranciscoCleiton_Testes.v195av2[t][k]].getStatus();     
                if (test == 1){
                    FranciscoCleiton_Subclasse2.s = 1;
                }
                else {
                    FranciscoCleiton_Subclasse2.s = 0;
                }
            }
        }
    }

    @Override
    public void comprovante(int i, int mes, int v, int qualav) {
        t = mes-1;
        k = i-1;
    
        if (qualav == 0) {
            System.out.printf("%d/%d/2022\n", mes, i);
            System.out.print("Nome: "+ FranciscoCleiton_Testes.passageiro185av1[t][k][v].getNome());
            System.out.print(" --> Destino: São Paulo");
            if (FranciscoCleiton_Testes.passageiro185av1[t][k][v].getStatus() == 1) {
                System.out.println(" --> Voo CONFIRMADO");
            }
            else {
                System.out.println(" --> Voo CANCELADO");
            }
        }

        if (qualav == 1) {
            System.out.printf("%d/%d/2022\n", mes, i);
            System.out.println("Nome: "+ FranciscoCleiton_Testes.passageiro185av1[t][k][v].getNome());
            System.out.print(" --> Destino: Rio Grande do Sul");
            if (FranciscoCleiton_Testes.passageiro185av2[t][k][v].getStatus() == 1) {
                System.out.println(" --> Voo CONFIRMADO");
            }
            else {
                System.out.println(" --> Voo CANCELADO");
            }
        }

        if (qualav == 2) {
            System.out.printf("%d/%d/2022\n", mes, i);
            System.out.println("Nome: "+ FranciscoCleiton_Testes.passageiro185av1[t][k][v].getNome());
            System.out.print(" --> Destino: Rio de Janeiro");
            if (FranciscoCleiton_Testes.passageiro195av1[t][k][v].getStatus() == 1) {
                System.out.println(" --> Voo CONFIRMADO");
            }
            else {
                System.out.println(" --> Voo CANCELADO");
            }
        }

        if (qualav == 3) {
            System.out.printf("%d/%d/2022\n", mes, i);
            System.out.println("Nome: "+ FranciscoCleiton_Testes.passageiro185av1[t][k][v].getEmpresa());
            System.out.print(" --> Destino: Santa Catarina");
            if (FranciscoCleiton_Testes.passageiro195av2[t][k][v].getStatus() == 1) {
                System.out.println(" --> Voo CONFIRMADO");
            }
            else {
                System.out.println(" --> Voo CANCELADO");
            }
        }
    } 


    // métodos nao usados na classe
    @Override
    public void vooexecutivo(int i, int mes, int v) {
        
    }

    public void cancelar(int i, int mes, String cpf, int qualav) {
        t = mes-1;
        k = i-1;
        String testar = cpf;
        if (qualav == 0) {
           for (int v = 0; v < FranciscoCleiton_Testes.vagasvoo185; v++) {
                if (FranciscoCleiton_Testes.passageiro185av1[t][k][v].getStatus() == 1 ) {
                    if (FranciscoCleiton_Testes.passageiro185av1[t][k][v].getCpf().equals(testar) ) {
                        FranciscoCleiton_Testes.passageiro185av1[t][k][v].setStatus(0);
                        FranciscoCleiton_Subclasse2.o = v;
                    }
                }
            }
        }

        if (qualav == 1) {
            for (int v = 0; v < FranciscoCleiton_Testes.vagasvoo185; v++) {
                if (FranciscoCleiton_Testes.passageiro185av2[t][k][v].getStatus() == 1 ) {
                    if (FranciscoCleiton_Testes.passageiro185av2[t][k][v].getCpf().equals(testar) ) {
                        FranciscoCleiton_Testes.passageiro185av2[t][k][v].setStatus(0);
                        FranciscoCleiton_Subclasse2.o = v;
                    }
                }
            }
        }

        if (qualav == 2) {
            for (int v = 0; v < FranciscoCleiton_Testes.vagasvoo185; v++) {
                if (FranciscoCleiton_Testes.passageiro195av1[t][k][v].getStatus() == 1 ) {
                    if (FranciscoCleiton_Testes.passageiro195av1[k][t][v].getCpf().equals(testar) ) {
                        FranciscoCleiton_Testes.passageiro195av1[k][t][v].setStatus(0);
                        FranciscoCleiton_Subclasse2.o = v;
                    }
                }
            }
        }

        if (qualav == 3) {
            for (int v = 0; v < FranciscoCleiton_Testes.vagasvoo185; v++) {
                if (FranciscoCleiton_Testes.passageiro195av2[t][k][v].getStatus() == 1 ) {
                    if (FranciscoCleiton_Testes.passageiro195av2[t][k][v].getCpf().equals(testar) ) {
                        FranciscoCleiton_Testes.passageiro195av2[t][k][v].setStatus(0);
                        FranciscoCleiton_Subclasse2.o = v;
                    }
                }
            }
        }
    }

}

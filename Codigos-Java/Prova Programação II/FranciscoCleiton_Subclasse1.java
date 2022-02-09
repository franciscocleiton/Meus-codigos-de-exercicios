// classe para voos executivos

public class FranciscoCleiton_Subclasse1 extends FranciscoCleiton_Superclasse {
    static int v = 0;

    int test;
    int k, t;

    public FranciscoCleiton_Subclasse1(String nome, String cpf, String nacionalidade,String empresa, float preco, int status, String destino) {
        super(nome, cpf, nacionalidade, empresa, preco, status, destino);
    }

    public FranciscoCleiton_Subclasse1() {
    }

    // Todos os métodos são adicionados para o funcionamento da classe, porém só será implementado os necessários para esta classe executiva
    @Override
    public void vooexecutivo(int i, int mes, int v) {
        t = mes-1;
        k = i-1;
        FranciscoCleiton_Testes.passageiroexecutivo[t][k][0].setStatus(1);
    }

    @Override
    public void testvaga(int i, int mes, int v, int qualav) {
        t = mes-1;
        k = i-1;
        if (mes <= 8) { // esse if existe porque foi dito que o aviao ja estava lotado por 8 meses!
            FranciscoCleiton_Subclasse1.v = 1;
        }
        else {
            test = FranciscoCleiton_Testes.passageiroexecutivo[t][k][0].getStatus();     
            if (test == 1){
                v = 1;
            }
            else {
                v = 0;
            }
        }
        
    }

    @Override
    public void comprovante(int i, int mes, int v, int qualav) {
        t = mes-1;
        k = i-1;
        
        System.out.printf("%d/%d/2022\n", mes, i);
        System.out.print("Empresa: "+ FranciscoCleiton_Testes.passageiroexecutivo[t][k][0].getEmpresa());
        System.out.print(" --> Destino: "+ FranciscoCleiton_Testes.passageiroexecutivo[t][k][0].getDestino());
        if (FranciscoCleiton_Testes.passageiroexecutivo[t][k][0].getStatus() == 1) {
            System.out.println(" --> Voo CONFIRMADO");
        }
        else if (FranciscoCleiton_Testes.passageiroexecutivo[t][k][0].getStatus() == 2) {
            System.out.println(" --> Voo REMARCADO");
        }
        else {
            System.out.println(" --> Voo CANCELADO");
        } 
    } 


    // métodos nao usados na classe
    @Override
    public void vooeb185(int i, int mes, int v, int qualav) {
        
    }

    @Override
    public void vooeb195(int i, int mes, int v, int qualav) {
        
    }

    @Override
    public void cancelar(int i, int mes, String cpf, int qualav) {
        t = mes-1;
        k = i-1;
        String testar = cpf;
        for (int m = 0; m < mes; m++) {
            for (int d = 0; d < i; d++) {
                if (FranciscoCleiton_Testes.passageiroexecutivo[t][k][0].getEmpresa().equals(testar) ) {
                    FranciscoCleiton_Testes.passageiroexecutivo[t][k][0].setStatus(0);
                }
            }
        }
    }
}

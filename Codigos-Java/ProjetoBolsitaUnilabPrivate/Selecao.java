public class Selecao {

    int selecionado = 0;
    boolean ok, ok1, ok2;
    Estudante sel1 = new Estudante();
    String aprovado, indef, indef1, indef2;
    
    
    void bolsa(){
        if (sel1.isOutraBolsa() == false){
            ok = true;
            selecionado++;
        }
        else
            ok = false;
    }

    void mat(){
        if (sel1.isMatriculado() == true){
            ok1 = true;
            selecionado++;
        }
        else
            ok1 = false;
    }

    void ll(){
        if(sel1.isLattes() == true){
            ok2 = true;
            selecionado++;
        }
        else
            ok2 = false;
    }

    void apr(){
        if (selecionado == 3){
            aprovado = "Sim";
        }
        else{
            aprovado = "Não";
        }
    }

    
    void informacoes(){
        System.out.println("\nResultado da Inscrição: ");
        if(aprovado == "Sim"){
            System.out.println("\nNome do candidato: "+sel1.getNome()+"\n"+"Curso: "+sel1.getCurso()+"\n"
                            +"RG: "+sel1.getRG()+"\n"
                            +"CPF: "+sel1.getCPF()+"\n"+"Inscrição deferida: "+aprovado+"\n");
        }
        else{
            System.out.println("\nNome do candidato: "+sel1.getNome()+"\n"+"Curso: "+sel1.getCurso()+"\n"
                                +"RG: "+sel1.getRG()+"\n"
                                +"CPF: "+sel1.getCPF()+"\n"+"incrição deferida: "+aprovado+"");
            System.out.print("Motivo(s) de indeferimento: ");
            if(ok==false){
                System.out.print("Possui outra bolsa; ");
            }
            if(ok1==false){
                System.out.print("Não está regularmente matrículado nesse semestre; ");
            }
            if(ok2==false){
                System.out.print("Não possui lattes");
            }
            System.out.println("\n");
        }
    }
}

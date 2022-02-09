import javax.swing.*;

public class Selecao {

    int selecionado = 0;
    boolean ok, ok1, ok2;
    Estudante sel1 = new Estudante();
    String aprovado, indef, indef1, indef2;
    
    
    void bolsa(){
        if (sel1.outraBolsa == false){
            ok = true;
            selecionado++;
        }
        else
            ok = false;
    }

    void mat(){
        if (sel1.matriculado == true){
            ok1 = true;
            selecionado++;
        }
        else
            ok1 = false;
    }

    void ll(){
        if(sel1.lattes == true){
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
        System.out.println("\n");
        if(aprovado == "Sim"){
            JOptionPane.showMessageDialog(null, "Resultado da Inscrição: \nNome do candidato: "+sel1.nome+"\n"+"Curso: "+sel1.curso+"\n"
                            +"RG: "+sel1.RG+"\n"
                            +"CPF: "+sel1.CPF+"\n"+"Inscrição deferida: "+aprovado+"\n");
        }
        else{
            if(ok==false && ok1==false && ok2==false){
                JOptionPane.showMessageDialog(null, "Resultado da Inscrição: \nNome do candidato: "+sel1.nome+"\n"+"Curso: "+sel1.curso+"\n"
                                +"RG: "+sel1.RG+"\n"
                                +"CPF: "+sel1.CPF+"\n"+"incrição deferida: "+aprovado+"\nMotivo(s) de indeferimento: Possui outra bolsa; Não está regularmente matrículado nesse semestre; Não possui lattes.");
            }
            else if(ok==false && ok1==false){
                JOptionPane.showMessageDialog(null, "Resultado da Inscrição: \nNome do candidato: "+sel1.nome+"\n"+"Curso: "+sel1.curso+"\n"
                                +"RG: "+sel1.RG+"\n"
                                +"CPF: "+sel1.CPF+"\n"+"incrição deferida: "+aprovado+"\nMotivo(s) de indeferimento: Possui outra bolsa; Não está regularmente matrículado nesse semestre.");
            }
            else if(ok==false && ok2==false){
                JOptionPane.showMessageDialog(null, "Resultado da Inscrição: \nNome do candidato: "+sel1.nome+"\n"+"Curso: "+sel1.curso+"\n"
                                +"RG: "+sel1.RG+"\n"
                                +"CPF: "+sel1.CPF+"\n"+"incrição deferida: "+aprovado+"\nMotivo(s) de indeferimento: Possui outra bolsa; Não possui lattes.");
            }
            else if(ok1==false && ok2==false){
                JOptionPane.showMessageDialog(null, "Resultado da Inscrição: \nNome do candidato: "+sel1.nome+"\n"+"Curso: "+sel1.curso+"\n"
                                +"RG: "+sel1.RG+"\n"
                                +"CPF: "+sel1.CPF+"\n"+"incrição deferida: "+aprovado+"\nMotivo(s) de indeferimento:  Não está regularmente matrículado nesse semestre; Não possui lattes.");
            }
            else if(ok==false){
                JOptionPane.showMessageDialog(null, "Resultado da Inscrição: \nNome do candidato: "+sel1.nome+"\n"+"Curso: "+sel1.curso+"\n"
                                +"RG: "+sel1.RG+"\n"
                                +"CPF: "+sel1.CPF+"\n"+"incrição deferida: "+aprovado+"\nVer Motivo(s) de indeferimento: Possui outra bolsa.");
            }
            else if(ok1==false){
                JOptionPane.showMessageDialog(null, "Resultado da Inscrição: \nNome do candidato: "+sel1.nome+"\n"+"Curso: "+sel1.curso+"\n"
                                +"RG: "+sel1.RG+"\n"
                                +"CPF: "+sel1.CPF+"\n"+"incrição deferida: "+aprovado+"\nMotivo(s) de indeferimento:  Não está regularmente matrículado nesse semestre.");
            }
            else if(ok2==false){
                JOptionPane.showMessageDialog(null, "Resultado da Inscrição: \nNome do candidato: "+sel1.nome+"\n"+"Curso: "+sel1.curso+"\n"
                                +"RG: "+sel1.RG+"\n"
                                +"CPF: "+sel1.CPF+"\n"+"incrição deferida: "+aprovado+"\nMotivo(s) de indeferimento: Não possui lattes.");
            }
        }
    }
}


public class Estudante {
    String nome, RG, CPF, curso, estado, reg, l;
    boolean outraBolsa, lattes, matriculado;

    public String getNome(){
        return nome;
    }

    public void setNome(String n){
        nome = n;
    }

    void outroVinculo(){ // outroVinculo será usado para ver se aluno tem outra bolsa
        outraBolsa = false;
    }


    void regularmente(){ // regurlamente será usado para ver se aluno está regurlamente matriculado
        matriculado = true;
    }

    void lattes(){
        lattes = true;
    }

    
}

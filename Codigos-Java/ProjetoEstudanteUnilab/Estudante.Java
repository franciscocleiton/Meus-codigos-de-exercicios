public abstract class Estudante{
    private String nome, matricula, cpf, endereço, curso, disciplina, email, telefone, cidade;
    private float renda, ide; 

    public String getNome(){
        return nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

}
public abstract class Aluno{
    private String nome, matricula, cpf, curso, email, telefone, cidade;
    private float renda, ide; 
    private int disciplina;

    public Aluno(){
        
    }

    public Aluno(String nome, String matricula, String cpf, String curso, String email, String telefone, String cidade, float renda, float ide, int disciplina){
        setNome(nome);
        setMatricula(matricula);
        setCpf(cpf);
        setCurso(curso);
        setEmail(email);
        setTelefone(telefone);
        setCidade(cidade);
        setRenda(renda);
        setIde(ide);
        setDisciplina(disciplina);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String mat){
        this.matricula = mat;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cp){
        this.cpf = cp;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String c){
        this.curso = c;
    }

    public int getDisciplina(){
        return disciplina;
    }

    public void setDisciplina(int dis){
        this.disciplina = dis;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String em){
        this.email = em;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String tel){
        this.telefone = tel;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String city){
        this.cidade = city;
    }

    public float getRenda(){
        return renda;
    }

    public void setRenda(float Ren){
        this.renda = Ren;
    }

    public float getIde(){
        return ide;
    }

    public void setIde(float Id){
        this.ide = Id;
    }

    // Métodos - Esse metodos abstratos, precisarao ser sobrescritos

    public abstract void bolsistas(String nome, String matricula, String cpf, String curso, String email, String telefone, String cidade, float ide, int disciplina, int disciplinasemestre, int pos);

    public abstract void alimentacao(int pos, int tipo);

    public abstract void transporte(int pos, int quantcity);

    public abstract void informacoes();
}

public abstract class FranciscoCleiton_Superclasse {
    private String jogador, posicao;
    private float salario, mensalidade;
    private int bolsista, idadejunior;

    public FranciscoCleiton_Superclasse() {

    }

    public FranciscoCleiton_Superclasse(String nome, String posicao, float salario, float mensalidade, int bolsista) {
        setJogador(jogador);
        
        setSalario(salario);
        setMensalidade(mensalidade);
        setJogador(jogador);
    }
    
    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getBolsista() {
        return bolsista;
    }

    public void setBolsista(int bolsista) {
        this.bolsista = bolsista;
    }

    public int getIdadejunior() {
        return idadejunior;
    }

    public void setIdadejunior(int idadejunior) {
        this.idadejunior = idadejunior;
    }

    // Métodos abstratos
    public abstract void profissional(int pos, String nome, String posicao, float salario);

    public abstract void juniorII(int pos, String nome, int idade, String posicao);

    public abstract void juniorI(int pos, String nome, int idade, String posicao);

    public abstract void infantil();

    public abstract void informações(int tipo);
}
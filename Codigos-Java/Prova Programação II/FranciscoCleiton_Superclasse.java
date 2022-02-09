public abstract class FranciscoCleiton_Superclasse {
    private String nome, cpf, nacionalidade, empresa, destino;
    private float preco;
    private int status;

    // Método construtor da classe

    public FranciscoCleiton_Superclasse(){
   
    }

    public FranciscoCleiton_Superclasse(String nome, String cpf, String nacionalidade, String empresa, float preco, int Status, String destino){
        setNome(nome);
        setCpf(cpf);
        setNacionalidade(nacionalidade);
        setEmpresa(empresa);
        setPreco(preco);
        setStatus(status);
        setDestino(destino);
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public int getStatus() {
        return status;
    }

    public void setStatus(int st) {
        this.status = st;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf1) {
        this.cpf = cpf1;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nac) {
        this.nacionalidade = nac;
    }
 
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String emp) {
        this.empresa = emp;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float p) {
        this.preco = p;
    }

    // Métodos - Esses são os metodos abstratos, que poderão ser sobrescritos (polimorfismo)

    public abstract void vooexecutivo(int i, int mes, int v);// fazer agendamendo de vaga no voo

    public abstract void vooeb185(int i, int mes, int v, int qualav); // fazer agendamendo de vaga no voo
    
    public abstract void vooeb195(int i, int mes, int v, int qualav); // fazer agendamendo de vaga no voo

    public abstract void testvaga(int i, int mes, int v, int qualav); // testar disponibilidade de vagas

    public abstract void comprovante(int i, int mes, int v, int qualav); // retornar voo agendado

    public abstract void cancelar(int i, int mes, String cpf, int qualav); // 
}

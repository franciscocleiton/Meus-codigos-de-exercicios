
public class Estudante {
    private String nome, RG, CPF, curso, estado, reg, l;
    private boolean outraBolsa, lattes, matriculado;

    public String getNome(){
        return nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        this.RG = rG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        this.CPF = cPF;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public boolean isOutraBolsa() {
        return outraBolsa;
    }

    public void setOutraBolsa(boolean outraBolsa) {
        this.outraBolsa = outraBolsa;
    }

    public boolean isLattes() {
        return lattes;
    }

    public void setLattes(boolean lattes) {
        this.lattes = lattes;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }
    
}

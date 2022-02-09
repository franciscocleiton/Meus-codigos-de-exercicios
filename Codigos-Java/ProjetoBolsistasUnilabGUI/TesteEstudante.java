import javax.swing.*;

public class TesteEstudante {
    public static void main(String[] args) {

        Selecao e1 = new Selecao();
        // String firstNumber = JOptionPane.showInputDialog( "Digite o 1 numero inteiro"
        // );

        String inputNome = JOptionPane
                .showInputDialog("Digite as informações do Estudante candidato a bolsa: \nNome: ");
        e1.sel1.nome = inputNome;

        String inputRG = JOptionPane.showInputDialog("RG ou RNE: ");
        e1.sel1.RG = inputRG;

        String inputCPF = JOptionPane.showInputDialog("CPF: ");
        e1.sel1.CPF = inputCPF;

        String inputCurso = JOptionPane.showInputDialog("Curso: ");
        e1.sel1.curso = inputCurso;

        String inputOutraBolsa = JOptionPane.showInputDialog("Possui outra bolsa: (True/False) ");// responder com true
                                                                                                  // ou false
        e1.sel1.outraBolsa = Boolean.parseBoolean(inputOutraBolsa);

        String inputMatriculado = JOptionPane.showInputDialog("Está regularmente matriculado: (True/False) ");// responder
                                                                                                              // com
                                                                                                              // true ou
                                                                                                              // false
        e1.sel1.matriculado = Boolean.parseBoolean(inputMatriculado);

        String inputLattes = JOptionPane.showInputDialog("Possui lattes cadastrado no CNPq: (True/False) ");// responder
                                                                                                            // com true
                                                                                                            // ou false
        e1.sel1.lattes = Boolean.parseBoolean(inputLattes);

        e1.bolsa();
        e1.mat();
        e1.ll();
        e1.apr();
        e1.informacoes();
    }
}

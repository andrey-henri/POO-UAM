package exercicio03;

import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main(String[] args) {
        
        CadastrarPessoas objeto_cadastrar = new CadastrarPessoas();
        
        CadastrarPessoas vetor_cadastros [] = new CadastrarPessoas [50];
        
        for(int i = 0; i < vetor_cadastros.length; i++){
            objeto_cadastrar.setSexo(JOptionPane.showInputDialog("Por favor digite o seu sexo:"
            + "\nObs: M para Masculino ou F para Feminino").charAt(0));
            objeto_cadastrar.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Por favor digite sua altura: ")));
            objeto_cadastrar.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
            objeto_cadastrar.setCorDoOlhos(JOptionPane.showInputDialog("Agora digite a letra que corresponde a cor de seus olhos:"
            + "\n A – azuis, V – verdes ou C – castanhos").charAt(0));
            vetor_cadastros[i] = (new CadastrarPessoas (objeto_cadastrar.getSexo(),objeto_cadastrar.getAltura(),objeto_cadastrar.getIdade(),objeto_cadastrar.getCorDoOlhos()));
        }
        GerenciarPessoas objeto_pessoas_cadastradas = new GerenciarPessoas (vetor_cadastros);
        
        JOptionPane.showMessageDialog(null,objeto_pessoas_cadastradas.CalcularitemA());
        JOptionPane.showMessageDialog(null,objeto_pessoas_cadastradas.CalcularitemB());
        JOptionPane.showMessageDialog(null,objeto_pessoas_cadastradas.CalcularitemC());
        JOptionPane.showMessageDialog(null,objeto_pessoas_cadastradas.CalcularitemD());
    }
}

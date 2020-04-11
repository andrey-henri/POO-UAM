package exercio05_06;

import javax.swing.JOptionPane;

public class Exercio05_06 {
    
    public static void main(String[] args) {
        String Sair = "N";
        cadastro_alunos Aluno = new cadastro_alunos();
        cadastro_alunos vetor_Aluno [] = new cadastro_alunos [99999999];
        
        Aluno.setNomeAluno("Andrey Henrique");
        Aluno.setNumeroRA(21163712);
        Aluno.setNota1(5.5);
        Aluno.setNota2(8.5);
        vetor_Aluno[Aluno.getNumeroRA()] = (new cadastro_alunos(Aluno.getNomeAluno(),Aluno.getNumeroRA(), Aluno.getNota1(),Aluno.getNota2())); 
        
        Aluno.setNomeAluno("Milena Lima");
        Aluno.setNumeroRA(21163713);
        Aluno.setNota1(4.5);
        Aluno.setNota2(3.8);
        vetor_Aluno[Aluno.getNumeroRA()] = (new cadastro_alunos(Aluno.getNomeAluno(),Aluno.getNumeroRA(), Aluno.getNota1(),Aluno.getNota2()));        
        do{
        
            int opcaoMenu = (Integer.parseInt(JOptionPane.showInputDialog(null,"MENU DE FUNCIONALIDADES\n"
                                                                             + "\n 0 - Cadastrar novos alunos"
                                                                             + "\n 1 - Calcular e mostrar a média do Aluno"
                                                                             + "\n 2 - Mostrar a situação do Aluno"
                                                                             + "\n 3 - Imprimir os dados do Aluno"
                                                                             + "\n 9 - Sair do programa\n\n")));

            switch(opcaoMenu){

                case 0:
                    Aluno.setNomeAluno(JOptionPane.showInputDialog(null,"Por favor digite o nome do aluno que deseja cadastrar: ", "Exemplo: Lucas"));
                    Aluno.setNumeroRA(Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor digite o numero de RA do aluno: ", "Exemplo: 21163712")));
                    Aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog(null,"Agora digite a sua nota da prova N1: ", "Exemplo 7.5")));
                    Aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog(null,"Agora digite a sua nota da prova N2: ", "Exemplo 8.6")));
                    vetor_Aluno[Aluno.getNumeroRA()] = (new cadastro_alunos(Aluno.getNomeAluno(),Aluno.getNumeroRA(), Aluno.getNota1(),Aluno.getNota2()));                
                break;

                case 1:
                    Aluno.setNumeroRA(Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor, digite o numero de RA do aluno que deseja realizar a consulta: ", "21163712")));
                    JOptionPane.showMessageDialog(null,"Média do aluno: " + vetor_Aluno[Aluno.getNumeroRA()].calcularMediaAritmetica());
                break;

                case 2:
                    Aluno.setNumeroRA(Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor, digite o numero de RA do aluno que deseja realizar a consulta: ", "21163712")));                
                    JOptionPane.showMessageDialog(null,"Situação do aluno: " + vetor_Aluno[Aluno.getNumeroRA()].situacaoAluno());
                break;

                case 3:
                    Aluno.setNumeroRA(Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor, digite o numero de RA do aluno que deseja realizar a consulta: ", "21163712"))); 
                    JOptionPane.showMessageDialog(null,vetor_Aluno[Aluno.getNumeroRA()].imprimirDadosAluno());
                break;

                case 9:
                    System.exit(0);
                break;            
            }
        }while(Sair.equals(Sair));
    }  
}

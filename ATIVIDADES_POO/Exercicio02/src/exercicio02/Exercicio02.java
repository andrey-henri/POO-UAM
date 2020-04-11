package exercicio02;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        
        pesquisa_habitantes prefeitura = new pesquisa_habitantes();
        pesquisa_habitantes vetor_prefeitura [] = new pesquisa_habitantes [20];
        
        int cont = 0;
        
        for(int i = 0; i < vetor_prefeitura.length; i++){
            
            prefeitura.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor digite o salario da pessoa " + (i+1)," Ex: 1500,00 ")));
            prefeitura.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor digite a idade desta pessoa: ", " Ex: 8 ")));
            prefeitura.setNumeroDeFilhos(Integer.parseInt(JOptionPane.showInputDialog(null,"Agora a digite a quantidade de filhos que ele tem: ", "Ex: 2")));
            vetor_prefeitura[i] = (new pesquisa_habitantes(prefeitura.getSalario(),prefeitura.getIdade(),prefeitura.getNumeroDeFilhos()));
            cont++;
        }
        
        double mediaSalarios = 0, maiorSalario = 0;
        int mediaNumeroFilhos = 0;
        
        for(int i = 0; i < vetor_prefeitura.length; i++){
            mediaSalarios += vetor_prefeitura[i].getSalario();
            mediaNumeroFilhos += vetor_prefeitura[i].getNumeroDeFilhos();
            if(vetor_prefeitura[i].getSalario() > maiorSalario){
                maiorSalario = vetor_prefeitura[i].getSalario();
            }            
        }
        
        JOptionPane.showMessageDialog(null,"A media de salarios da população é: " + (mediaSalarios / cont));
        JOptionPane.showMessageDialog(null, "A media de numero de filhos da população é: " + (mediaNumeroFilhos / cont));
        JOptionPane.showMessageDialog(null, "O maior salario digitado foi: " + maiorSalario);
    }
    
}

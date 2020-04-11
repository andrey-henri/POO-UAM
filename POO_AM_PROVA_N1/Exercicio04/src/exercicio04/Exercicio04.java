package exercicio04;

import javax.swing.JOptionPane;

public class Exercicio04 {

    public static void main(String[] args) {

        int qtdAlunos = 23; //Dados informado no Exercicio
        double mediaFatiasPorPessoa = 0;
        int maiorQtdFatias = -1;
        
        for(int i = 1; i <=qtdAlunos; i++ ){
            
            int qtdPizzasPorPessoa = (Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor digite  quantidade de pizzas que a " + i + "º pessoa comeu: ", "Exemplo: 3")));
            mediaFatiasPorPessoa+= qtdPizzasPorPessoa;
            
            if(qtdPizzasPorPessoa > maiorQtdFatias){
                maiorQtdFatias = qtdPizzasPorPessoa;
            }    
        }
        JOptionPane.showMessageDialog(null, "A Média de fatias por pessoa é: " + (mediaFatiasPorPessoa/qtdAlunos));
        JOptionPane.showMessageDialog(null, "A pessoa que comeu a maior quantidade de fatias, comeu: " + maiorQtdFatias);
    }
}

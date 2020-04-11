package exercicio07;

import javax.swing.JOptionPane;

public class Exercicio07 {

    public static void main(String[] args) {

        Empregado objetoEmpregado = new Empregado();
        Empregado vetor_empregados [] = new Empregado [99];
        
        objetoEmpregado.setNomeEmpregado("Andrey Henrique");
        objetoEmpregado.setSobrenomeEmpregado("Silva");
        objetoEmpregado.setSalarioMensal(2100.00);
        vetor_empregados[0] = (new Empregado(objetoEmpregado.getNomeEmpregado(),objetoEmpregado.getSobrenomeEmpregado(),objetoEmpregado.getSalarioMensal()));
        
        objetoEmpregado.setNomeEmpregado("Milena Lima");
        objetoEmpregado.setSobrenomeEmpregado("Da Silva");
        objetoEmpregado.setSalarioMensal(1800.00);
        vetor_empregados[1] = (new Empregado(objetoEmpregado.getNomeEmpregado(),objetoEmpregado.getSobrenomeEmpregado(),objetoEmpregado.getSalarioMensal()));  
        
        //a. Crie duas instâncias da classe e exiba o salário anual de cada instância
        JOptionPane.showMessageDialog(null,"Nome do primeiro empregado: " + vetor_empregados[0].getNomeEmpregado() + "\nSalário anual: " + (vetor_empregados[0].getSalarioMensal() * 12));
        JOptionPane.showMessageDialog(null,"Nome do segundo empregado: " + vetor_empregados[1].getNomeEmpregado() + "\nSalário anual: " + (vetor_empregados[1].getSalarioMensal() * 12));
        
        //b. Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada empregado
        vetor_empregados[0].setSalarioMensal(vetor_empregados[0].getSalarioMensal() * 1.10);
        vetor_empregados[1].setSalarioMensal(vetor_empregados[1].getSalarioMensal() * 1.10);
        
        //Novo salario anual do empregado

        JOptionPane.showMessageDialog(null,"Nome do primeiro empregado: " + vetor_empregados[0].getNomeEmpregado() + "\nSalário anual atualizado: " + (vetor_empregados[0].getSalarioMensal() * 12));
        JOptionPane.showMessageDialog(null,"Nome do segundo empregado: " + vetor_empregados[1].getNomeEmpregado() + "\nSalário anual atualizado: " + (vetor_empregados[1].getSalarioMensal() * 12));

        System.exit(0);
    }    
}

package aula.pkg06;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aula06 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Executando programa principal!");   
        
        Aluno e1 = new Aluno();
        
        e1.setNome(JOptionPane.showInputDialog(null,"Digite seu nome: "));
        e1.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor digite o seu peso: ")));
        e1.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor digite a sua altura: ")));
        
        System.out.println(" Situação do aluno: " + e1.calcularIMC());
    }  
}

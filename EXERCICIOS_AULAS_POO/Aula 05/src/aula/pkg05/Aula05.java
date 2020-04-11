package aula.pkg05;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aula05 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
         
        System.out.println("Executando programa principal!");
        int anoAtual;
        Pessoa p1 = new Pessoa();
        p1.setNome(JOptionPane.showInputDialog(null,"Digite seu nome: "));
        p1.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor digite sua idade: ")));
        p1.setSexo(JOptionPane.showInputDialog("Digite a letra corresponde ao seu sexo: ").charAt(0));
        
        /*System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Sexo: " + p1.getSexo());*/
        
        //Impressão por metodo
        p1.imprimir();
        System.out.println("Ano de nascimento: "+ p1.calcularAnoNascimento(2018));

    }
}

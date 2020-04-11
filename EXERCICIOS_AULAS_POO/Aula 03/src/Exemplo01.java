import java.util.Scanner;
import javax.swing.JOptionPane.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class Exemplo01 {
    
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o numero 01: ")); //Já cria a variavel int e converte a String recebida do input para int
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o numero 02: ")); //Já cria a variavel int e converte a String recebida do input para int

        //Chamada para realizar a soma das variaveis acima (Soma)
        soma(a,b);
    }
    //procedimento soma - definição
    public static void soma(int pa, int pb){ //recebendo os valores da classe principal, os mesmos funcionam na classe principal
        System.out.println("A soma dos valores de a + b é: " + (pa + pb));        
    } 
}
 
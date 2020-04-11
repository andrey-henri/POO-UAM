import java.util.Scanner;
import javax.swing.JOptionPane.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class Exemplo02 {
    
    public static void main(String[] args) {
        
        int[] vetor = new int [3]; //Criação de vetor
        
        vetor [0] = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o numero 01: ")); //Já cria a variavel int e converte a String recebida do input para int
        vetor [1] = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o numero 02: ")); //Já cria a variavel int e converte a String recebida do input para int
        vetor [2] = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o numero 03: ")); //Já cria a variavel int e converte a String recebida do input para int

        //Chamada para realizar a soma das variaveis acima (Soma)
        for(int i = 0; i < 3; i++){
            System.out.println("\n(Antes do procedimento somaVetor) \nVetor na posição: " + i + " tem o valor: " + vetor[i]);
        }
        
        somaVetor(vetor);
        
        for(int i = 0; i < 3; i++){
            System.out.println("\n(Depois do procedimento somaVetor) \nVetor na posição: " + i + " tem o valor: " + vetor[i]);
        }
        
    }
    
    public static void somaVetor(int[] pVetor){ 
            for(int i = 0; i < 3; i++){       
                pVetor[i] = pVetor[i] + 1;
         }
    }
}
 
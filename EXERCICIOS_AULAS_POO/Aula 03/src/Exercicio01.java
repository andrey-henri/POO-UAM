import java.util.Scanner;
import javax.swing.JOptionPane.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        int[] vetor = new int [2]; //Criação de vetor
        
        vetor [0] = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o numero 01: ")); //Já cria a variavel int e converte a String recebida do input para int
        vetor [1] = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o numero 02: ")); //Já cria a variavel int e converte a String recebida do input para int   
       
        maiorNumero(vetor);
        mediaNumero(vetor);
    }
    
    public static void maiorNumero(int[] pVetor){ 
        int maiorNumero = 0;
        for(int i = 0; i < 2; i++){
            if(pVetor[i] > maiorNumero){
                maiorNumero = pVetor[i];
            }
        }
        System.out.println("O maior numero digitado foi: " + maiorNumero);
    }
     public static void mediaNumero(int[] pVetor){ 
        int somaNumeros = 0;
         for(int i = 0; i < 2; i++){        
            somaNumeros = (somaNumeros + pVetor[i]/2);       
        }
        System.out.println("O media dos numeros digitado foi: " + somaNumeros);
    }   
}
 
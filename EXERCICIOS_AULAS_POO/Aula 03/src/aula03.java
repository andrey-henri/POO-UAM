import java.util.Scanner;
import javax.swing.JOptionPane.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class aula03 {

    public static void main(String[] args) {
        Scanner entradaChar = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);
        Scanner entradaFloat = new Scanner(System.in);
        Scanner entradaDouble = new Scanner(System.in);
      
        soma();
    }
    
    //procedimento soma - definiçao
    
    public static void soma(){
        Scanner entradaInt = new Scanner(System.in);
        String nome = JOptionPane.showInputDialog(null, " Digite seu nome: "); //Criação de variavel String já recebendo valor em JOptionPane
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero 01")); //Já cria a variavel int e converte a String recebida do input para int
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero 02")); //Já cria a variavel int e converte a String recebida do input para int
        double c = Double.parseDouble(JOptionPane.showInputDialog(null,"Numero 03")); //Já cria a variavel Double e converte a String recebida do input para double
        float d = Float.parseFloat(JOptionPane.showInputDialog(null,"Numero 04")); //Já cria a variavel Float e converte a String recebida do input para Float.
        
        System.out.println("Digite os valores para a e b: ");
        System.out.println("A soma dos dois numeros digitado é: " + (a+b));
        
    }   
}

//Conversão
/* String recebe = JOptionPane.showInputDialog(null,"Entre com um valor");
    int converteRecebeInt = Integer.parseInt(recebe); // converte String para int
    float converteRecebeFloat = Float.parseFloat(recebe); //converte String para float
    double converteRecebeDouble = Double.parseDouble(recebe); //converte de String para Double*/
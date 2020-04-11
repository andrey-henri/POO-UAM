package aula02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        /*System.out.println("Por favor digite o primeiro numero Real: ");
        double numero1 = entrada.nextDouble();
        
        System.out.println("Por favor digite o segundo numero Real: ");
        double numero2 = entrada.nextDouble();
        
        System.out.println("Resultado da Soma destes valores: " + (numero1 + numero2));
        System.out.println("Resultado do produto deles: " + (numero1 * numero2));
        System.out.println("Resultado do quociente entre eles: " + (numero1 / numero2));
               
        System.out.println("Por favor digite o primeiro numero Real: ");
        double num1 = entrada.nextDouble();
        System.out.println("Por favor digite o segundo numero Real: ");
        double num2 = entrada.nextDouble();      
        System.out.println("Por favor digite o terceiro numero Real: ");
        double num3 = entrada.nextDouble();
        
        if(num1 > (num2 + num3)){
            System.out.println("O numero 01: " + num1 +  ". É maior que a soma dos outros dois numeros!");
        }
        
        else{
            System.out.println("O primeiro numero não é maior que a soma dos outros dois: " + (num2 + num3));
        }
       
        // CUSTO DO CARRO
                
        System.out.println("Por favor digite o valor de custo de fabrica do carro: ");
        double custoCarro = entrada.nextDouble(); // Ctrl + espaco para aparecer opções
        
        System.out.println("A) O valor de impostos será de: " + (custoCarro * 0.45));
        System.out.println("B) Valor de lucro do distribuidor: " + (custoCarro * 0.12));
        System.out.println("Novo preço do carro: " + (custoCarro + (custoCarro * 0.45) + (custoCarro * 0.12)));
        
        // Exercicio 02 NIVEL 02
        System.out.println("Digite o valor de A: ");
        int a = entrada.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = entrada.nextInt();

        if(a > b){
            System.out.println("O valor de A é maior que o valor de B!" + "\nA:" + a + " | B:" + b);
        }
        else if(b > a){
            System.out.println("O valor de B é maior que o valor de A!" + "\nA:" + a + " | B:" + b);     
        }
        else{
            System.out.println("Os dois valores digitados são iguais!" + "\nA:" + a + " | B:" + b);
        }
                
        */
        
        System.out.println("Por favor digite o seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.println("Por favor digite seu salario: ");
        double salario = entrada.nextDouble();
        
        if(salario <= 350.00){
            System.out.println("Salario a receber com a bonificação: " + ((salario * 0.93) + 100.00));      
        }
        else if (salario > 350.00 && salario <= 600.00){
            System.out.println("Salario a receber com a bonificação: " + ((salario * 0.93) + 75.00));          
        }
        else if(salario > 600.00 && salario <= 900.00){
            System.out.println("Salario a receber com a bonificação: " + ((salario * 0.93) + 50.00));        
        }
        else{
            System.out.println("Salario a receber com a bonificação: " + ((salario * 0.93) + 35.00));        
        }
    }
}

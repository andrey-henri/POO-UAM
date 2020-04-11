package aula02;

import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class Aula02 {
    
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    Scanner entradaChar = new Scanner(System.in);
    
    int qtdhomens = 0, qtdpessoas_item_b = 0, qtdmulheres =0;
    double altura,peso, alturamulheres = 0, mediaAlturaMulheres =0;
    
        for(int cont = 1; cont <= 3; cont++){

            System.out.println("Por favor digite o sexo da pessoa: " + cont);
            char sexo = entradaChar.nextLine().charAt(0);

            System.out.println("Por favor digite a altura da pessoa: " + cont);
            altura = entrada.nextDouble();

            System.out.println("Por favor digite o peso da pessoa: " + cont);
            peso = entrada.nextDouble();
        
            if(sexo == 'm' || sexo == 'M'){
                qtdhomens++;
            }
            else{
                qtdmulheres++;
                alturamulheres =+ altura;
                mediaAlturaMulheres = (alturamulheres /qtdmulheres);
            }
            if(peso > 90.0 && altura < 1.50){
                qtdpessoas_item_b++;
            }
         }
        
        System.out.println("a) A quantidade de homens: " + qtdhomens);
        System.out.println("b) A quantidade de pessoas com peso superior a 90 kilos e altura inferior a 1,5 metros: " + qtdpessoas_item_b);
        System.out.println("c) A média das alturas das mulheres: " +mediaAlturaMulheres );
    }
}

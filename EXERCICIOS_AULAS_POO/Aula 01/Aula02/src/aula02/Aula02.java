package aula02;

import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int a, b, c;
        
        System.out.println("Por Favor digite o 1º Numero: "); //sout
        a = entrada.nextInt();
        System.out.println("Por Favor digite o 2º Numero: "); 
        b = entrada.nextInt();
        System.out.println("Por Favor digite o 3º Numero: "); 
        c = entrada.nextInt();
        
        if(a > b && a > c){
            System.out.println("Maior eh: " + a);
        }
        else if(b > c){
            System.out.println("Maior eh: " + b);
        }
        else
        System.out.println("Maior eh: " + c);
    } 
}
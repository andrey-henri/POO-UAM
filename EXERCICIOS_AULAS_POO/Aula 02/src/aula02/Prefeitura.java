package aula02;
import java.util.Scanner;

public class Prefeitura {
    
    public static void main(String[] args) {
    
        Scanner entradaInt = new Scanner(System.in);
        Scanner entradaDouble = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        double salario = 0, salarioMaior = 0, mediaSalarios = 0;
        int qtdfilhos, mediaDeFilhos = 0, qtdPessoas = 0;
        
        while(salario >= 0){

            System.out.println("Por favor digite seu nome: ");
            String nome = entradaString.nextLine();

            System.out.println("Por favor digite o valor do seu salario: ");
            salario = entradaDouble.nextDouble();

            if(salario >= 0.0){
                System.out.println("Por favor digite a quantidade de filhos que você tem: ");
                qtdfilhos = entradaInt.nextInt();
                mediaDeFilhos = mediaDeFilhos + qtdfilhos; 
                mediaSalarios = mediaSalarios + salario;
                qtdPessoas++;
            }    
            if(salario > salarioMaior){       
                salarioMaior = salario;
            }
        }
        if(qtdPessoas> 0){
            System.out.println("a) O maior salário: " + salarioMaior);
            System.out.println("b) A média de filhos: " + mediaDeFilhos/qtdPessoas);
            System.out.println("c) A média dos salários: " + (mediaSalarios/qtdPessoas));
        }
        else{
            System.out.println("Não foi digitado nenhum salario positivo, reinicie a aplicação e tente novamente!");
        }
    }   
}

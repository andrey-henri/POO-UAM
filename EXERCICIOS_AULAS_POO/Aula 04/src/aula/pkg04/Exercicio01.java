package aula.pkg04;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String validaSairAplicacao = "N";
        
        while(validaSairAplicacao.equalsIgnoreCase("N")){
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor digite o valor do nota 01: ")); //Já cria a variavel int e converte a String recebida do input para int
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor digite o valor do nota 02: ")); //Já cria a variavel int e converte a String recebida do input para int
            double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor digite o valor do nota 03: ")); //Já cria a variavel int e converte a String recebida do input para int
            char letra = JOptionPane.showInputDialog("Digite a letra da operação que deseja realizar: ").charAt(0);

            if(letra == 'A' || letra == 'a'){
                System.out.println("A média aritmética das notas digitadas é: " + mediaaritmetica(nota1,nota2,nota3));
                System.exit(0);
            }
            else if(letra == 'P' || letra == 'p'){
                System.out.println("A média ponderada das notas digitadas é: " + mediaaponderada(nota1,nota2,nota3));       
            }     
            else{
                System.out.println("A letra digitado é invalida para realizar alguma operação\nDigite 'S' para sair ou 'N' para tentar novamente!");
                validaSairAplicacao = entrada.nextLine();
            }
        }
    }
    
    public static double mediaaritmetica (double valor1,double valor2, double valor3){
        double somaNotas = ((valor1 + valor2 + valor3) / 3);
        return somaNotas;     
    }
    
    public static double mediaaponderada (double valor1,double valor2, double valor3){
        double somaponderada = ((valor1 * 5) + (valor2 * 3) + (valor3 * 2) / 10);
        return somaponderada;     
    }
}

//variavel.equalsIgnoreCase("palavra")
package aula02_01;

import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class Aula02_01 {
     public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
	
	String validaSairAplicacao = "N";
	double velocidadeInicial = 0.0, anguloCanhao = 0.0, distancia = 0.0, tamanhoAlvo = 0.0, alturaMaxima, tempoTrajeto, alcanceHorizontal;
	double aceleracao = 9.81; // constante 9,81m/s2 ;
	
	JOptionPane.showMessageDialog(null,"UNIVERSIDADE ANHEMBI MURUMBI, PAULISTA 02 – NOTURNO\nSISTEMA DE INFORMAÇÃO\nALGORITMOS E PROGRAMAÇÃO\n"+
	"\nLançamento de Projéteis\nDesenvolvido Por: Andrey Henrique de Carvalho Silva, RA:21163712\nProfessor:Fernando Zuher");
	
	JOptionPane.showMessageDialog(null,"Devido a vários fatores, como por exemplo a falta de tempo, não foi possível realizar essa atividade em grupo. Por esse motivo" +
	"\npara não ficar sem nota, realizei esse projeto individualmente.");

	do{
		if("N".equals(validaSairAplicacao) || "n".equals(validaSairAplicacao)){
			try{
			velocidadeInicial = Integer.parseInt(JOptionPane.showInputDialog(null,"\n Por Favor digite a velocidade inicial do projétil: \n(Obs: o valor informado deve ser" +
			" positivo e maior que 0)")); 
			}
			catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null,"Erro, não foi digitado um valor numerico!"); // Caso não seja digitado um valor numerico
			}
		}
		if(velocidadeInicial <= 0.0){
		validaSairAplicacao = JOptionPane.showInputDialog("\nO valor informado é invalido. Digtite a letra 'S' para sair da aplicação ou 'N' para tentar novamente.");
		}
		if("S".equals(validaSairAplicacao) || "s".equals(validaSairAplicacao)){
			System.exit(0); // Encerra aplicação
		}
	}while(velocidadeInicial <= 0.0 && validaSairAplicacao != "S" && validaSairAplicacao != "s" && validaSairAplicacao != "N" && validaSairAplicacao != "n"); // Validação para que a velocidade inicial seja positiva	
		
	do{
		if("N".equals(validaSairAplicacao) || "n".equals(validaSairAplicacao)){
			try{
			anguloCanhao = Integer.parseInt(JOptionPane.showInputDialog(null,"\n Por Favor digite o ângulo de inclinação do canhão em graus:" +
			"\n(Obs: o valor informado deve ser maior que 0º e menor que 90º)")); 
			}
			catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null,"Erro, não foi digitado um valor numerico!"); // Caso não seja digitado um valor numerico
			}
		}
		if(anguloCanhao <= 0 || anguloCanhao >= 90){
			validaSairAplicacao = JOptionPane.showInputDialog("\nO valor informado é invalido. Digtite a letra 'S' para sair da aplicação ou 'N' para tentar novamente.");
		}
		if("S".equals(validaSairAplicacao) || "s".equals(validaSairAplicacao)){
			System.exit(0); // Encerra aplicação
		}	
	}while(anguloCanhao <= 0 || anguloCanhao >= 90 && validaSairAplicacao != "S" && validaSairAplicacao != "s" && validaSairAplicacao != "N" && validaSairAplicacao != "n"); // Validação da inclinação do ângulo do canhão

	anguloCanhao = (Math.toRadians(anguloCanhao)); // Conversete ângulo do canhão de graus para radianos
	double senoAnguloCanhao = (Math.sin(anguloCanhao)); // Seno ângulo do canhão
	double cossenoAguloCanho = (Math.cos(anguloCanhao)); // Cosseno ângulo do canhão
	
	alturaMaxima = ((Math.pow(velocidadeInicial,2) * Math.pow(senoAnguloCanhao,2)) / (2 * aceleracao));
	tempoTrajeto = ((2 * velocidadeInicial * senoAnguloCanhao) / aceleracao);
	alcanceHorizontal = ((2 * Math.pow(velocidadeInicial,2)) * ((cossenoAguloCanho * senoAnguloCanhao) / aceleracao));
		
	do{
		if("N".equals(validaSairAplicacao) || "n".equals(validaSairAplicacao)){
			try{
			distancia = Integer.parseInt(JOptionPane.showInputDialog(null,"\n Por Favor digite a distância em que se encontra o alvo: \n(Obs: o valor informado deve ser positivo" +
			" e maior que 0)")); 
			}
			catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null,"Erro, não foi digitado um valor numerico!"); // Caso não seja digitado um valor numerico
			}
		}
		if(distancia <= 0.0){
			validaSairAplicacao = JOptionPane.showInputDialog("\nO valor informado é invalido. Digtite a letra 'S' para sair da aplicação ou 'N' para tentar novamente.");
		}	
		if("S".equals(validaSairAplicacao) || "s".equals(validaSairAplicacao)){
			System.exit(0); // Encerra aplicação			
		}
	}while(distancia <= 0.0 && validaSairAplicacao != "S" && validaSairAplicacao != "s" && validaSairAplicacao != "N" && validaSairAplicacao != "n"); // Validação para que a ditância seja positiva

	do{
		if("N".equals(validaSairAplicacao) || "n".equals(validaSairAplicacao)){
			try{
			tamanhoAlvo = Integer.parseInt(JOptionPane.showInputDialog(null,"\n Por Favor digite o tamanho do alvo: \n(Obs: Tamanho minimo é 5, e o maximo até 50.)")); 
			}
			catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null,"Erro, não foi digitado um valor numerico!"); // Caso não seja digitado um valor numerico
			}
		}
		if(tamanhoAlvo < 5.0 || tamanhoAlvo > 50){
			validaSairAplicacao = JOptionPane.showInputDialog("\nO valor informado é invalido. Digtite a letra 'S' para sair da aplicação ou 'N' para tentar novamente.");
		}
		if("S".equals(validaSairAplicacao) || "s".equals(validaSairAplicacao)){
			System.exit(0); // Encerra aplicação
		}
	}while(tamanhoAlvo < 5.0 || tamanhoAlvo > 50 && validaSairAplicacao != "S" && validaSairAplicacao != "s" && validaSairAplicacao != "N" && validaSairAplicacao != "n"); // Validação do tamanho do alvo

	if(alcanceHorizontal <= distancia){
		JOptionPane.showMessageDialog(null, "De acordo com os valores informados o alvo não foi antingido.\n O projétil caiu antes!");
	}
	else if(alcanceHorizontal >= (distancia + tamanhoAlvo)){
		JOptionPane.showMessageDialog(null, "De acordo com os valores informados o alvo não foi antingido.\n O projétil caiu depois!");
	}
	else if(alcanceHorizontal > distancia && alcanceHorizontal < (distancia + tamanhoAlvo)){
		JOptionPane.showMessageDialog(null, "De acordo com os valores informados o projétil antingiu o alvo!");
	}
	else{
		JOptionPane.showMessageDialog(null, "Não foi possível realizar nenhum calculo com os valores do projétil informado!");
	}
    DecimalFormat df = new DecimalFormat("###,##0.00");
	JOptionPane.showMessageDialog(null,"\nA altura maxima atingida pela bala será de aproximadamente: " + (df.format(alturaMaxima)) + " Metros");
	JOptionPane.showMessageDialog(null,"\nO tempo do trajeto da bala será de aproximadamente: " + (df.format(tempoTrajeto)) + " Segundos");
	JOptionPane.showMessageDialog(null,"\nO alcance horinzontal da bala será de aproximadamente: " + (df.format(alcanceHorizontal))+ " Metros");
	System.exit(0); // Encerra aplicação
     }
}

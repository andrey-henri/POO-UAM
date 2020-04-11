package aula.pkg04;
import javax.swing.JOptionPane;

public class Exercicio02 {
    
    public static void main(String[] args) {
    
    int horaInicio = -1, minutoInicio = -1, horaFim = -1, minutoFim = -1;
    String tempoInicio = null, tempoFim = null;
        
    do{
        try{
            tempoInicio = JOptionPane.showInputDialog(null,"Por favor digite a hora de inicio do jogo:\nObs: Padrão a ser digitado: HH:MM");
            horaInicio = Integer.parseInt(tempoInicio.substring(0, 2));
            minutoInicio = Integer.parseInt(tempoInicio.substring(3, 5));
        }
	catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,"Erro, não foi digitado um formato de hora valida!"); // Caso não seja digitado um valor numerico
	}              
    }while(horaInicio <0 || horaInicio > 24 || minutoInicio <0 || minutoInicio > 60);
    
    int tempoInicial = calcularTempoInicial(horaInicio, minutoInicio);
    
    do{
        try{
            tempoFim = JOptionPane.showInputDialog(null,"Por favor digite a hora de termino do jogo:\nObs: Padrão a ser digitado: HH:MM");
            horaFim = Integer.parseInt(tempoFim.substring(0, 2));
            minutoFim = Integer.parseInt(tempoFim.substring(3, 5));
        }
	catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,"Erro, não foi digitado um formato de hora valida!"); // Caso não seja digitado um valor numerico
	}          
    }while(horaInicio <0 || horaInicio > 24 || minutoInicio <0 || minutoInicio > 60);
    
    int tempoFinal = calcularTempoFinal(horaFim, minutoFim);
   
    System.out.println("A partida digitada, durou: " + calcularTempoJogo(tempoInicial,tempoFinal) + " Minutos");
    
    }
    public static int calcularTempoInicial (int horaInicio,int minutoInicio){   
    int tempoInicialEmMinutos = ((horaInicio * 60) + minutoInicio);
    return tempoInicialEmMinutos;  
    } 
    
    public static int calcularTempoFinal (int horaFim,int minutoFim){  
    int tempoFinalEmMinutos = ((horaFim * 60) + minutoFim);
    return tempoFinalEmMinutos;
    } 
    
    public static int calcularTempoJogo (int tempoInicial,int tempoFinal){  
        
        if(tempoFinal > tempoInicial){
            int tempoJogo = (tempoFinal - tempoInicial);
            return tempoJogo;
        }
        else{
            int tempoJogo = (tempoInicial - tempoFinal);
            return tempoJogo;
        }
    }    
}

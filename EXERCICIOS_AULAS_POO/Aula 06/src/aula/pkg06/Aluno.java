package aula.pkg06;

public class Aluno {
    
    private double pesoDigitado, alturaDigitada, valorImc;
    String nomeDigitado,classificao;
    
    public String getNome(){
        return nomeDigitado;
    }
    public void setNome(String nome){
        nomeDigitado = nome;
    }
    
    public double getPeso(){
        return pesoDigitado;
    }
    public void setPeso(double peso){
        pesoDigitado = peso;
    }
    
    public double getAltura(){
        return alturaDigitada;
    }
    
    public void setAltura(double altura){
        alturaDigitada = altura;
    }
    public String calcularIMC(){
        valorImc = (pesoDigitado/(alturaDigitada*alturaDigitada));
        
        if(valorImc < 18.5){
            return classificao = "Abaixo do peso ideal";
        }
        else if(valorImc >= 18.0 && valorImc <= 24.9){
            return classificao = "Peso normal";
        }
        else if(valorImc >= 25.0 && valorImc <= 29.9){
            return classificao = "Acima do peso (sobrepeso)";
        }
        else if(valorImc >= 30.0 && valorImc <=34.9){
            return classificao = "Obesidade grau I";
        }
        else if(valorImc >= 35.0 && valorImc <=39.9){
            return classificao = "Obesidade grau II";
        }
        else{
            return classificao = "Obesidade grau III";
        }            
    }  
}

package exercicio07;

public class Empregado {
    
    private String nomeEmpregado, sobrenomeEmpregado;
    private double salarioMensal;
    
    public Empregado () { } // construtor Vazio
    
    public Empregado (String nomeEmpregado, String sobrenomeEmpregado, double salarioMensal){ //construtor de todos os atributos da classe        
        this.nomeEmpregado = nomeEmpregado;
        this.sobrenomeEmpregado = sobrenomeEmpregado;
        this.salarioMensal = salarioMensal;        
    }

    public String getNomeEmpregado() {
        return nomeEmpregado;
    }

    public void setNomeEmpregado(String nomeEmpregado) {
        this.nomeEmpregado = nomeEmpregado;
    }

    public String getSobrenomeEmpregado() {
        return sobrenomeEmpregado;
    }

    public void setSobrenomeEmpregado(String sobrenomeEmpregado) {
        this.sobrenomeEmpregado = sobrenomeEmpregado;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if(salarioMensal > 0.0){
            this.salarioMensal = salarioMensal;
        }
        else{
            this.salarioMensal = 0.0;
        }
    }
    
        
    
}

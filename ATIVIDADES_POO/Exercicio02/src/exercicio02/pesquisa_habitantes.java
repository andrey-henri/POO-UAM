package exercicio02;

public class pesquisa_habitantes {
    
    private double salario;
    private int idade, numeroDeFilhos, cont;
    
    public pesquisa_habitantes (){ } //Construtor Vazio
    
    public pesquisa_habitantes (double salario, int idade, int numeroDeFilhos){
        
        this.salario = salario;
        this.idade = idade;
        this.numeroDeFilhos = numeroDeFilhos;
        cont++;
        
    }

    public int getCont() {
        return cont;
    }
  
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroDeFilhos() {
        return numeroDeFilhos;
    }

    public void setNumeroDeFilhos(int numeroDeFilhos) {
        this.numeroDeFilhos = numeroDeFilhos;
    }
     
    
}

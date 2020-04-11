package exercicio03;

public class CadastrarPessoas {
    
    private char sexo,corDoOlhos;
    private double altura;
    private int idade;
    
    CadastrarPessoas () {} // Constrtuor Vazio;
    
    CadastrarPessoas(char sexo, double altura, int idade, char corDoOlhos){ 
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
        this.corDoOlhos = corDoOlhos;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getCorDoOlhos() {
        return corDoOlhos;
    }

    public void setCorDoOlhos(char corDoOlhos) {
        this.corDoOlhos = corDoOlhos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
}

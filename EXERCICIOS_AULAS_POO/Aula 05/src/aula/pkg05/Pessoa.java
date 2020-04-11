package aula.pkg05;

public class Pessoa {
    
    //Atributos
    private String nome;
    private int idade;
    private char sexo;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String novoNome){
        nome = novoNome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int novaIdade){
        idade = novaIdade;
    }   
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char novoSexo){
        sexo = novoSexo;
    }    
    
    //Metodos
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);   
    } 
        
    public int calcularAnoNascimento(int anoAtual){
        int anoNascimento;
        anoNascimento = anoAtual - idade;
        return anoNascimento;
    }
}

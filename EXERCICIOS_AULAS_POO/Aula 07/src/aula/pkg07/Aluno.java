package aula.pkg07;

public class Aluno {
    
    String nome, endereco,curso;
    int idade, rg;
    char sexo;
    
    public Aluno(){ //Construtor
        nome = "";
        curso = "";
        idade = -1;
    }
    
    public Aluno(String nome, int idade){ //Construtor
        this.nome = nome;
        this.idade = idade;       
    }
    
    public Aluno (String nome, int idade, String curso){ //Construtor
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

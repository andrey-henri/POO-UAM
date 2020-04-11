package exercio05_06;

import javax.swing.JOptionPane;

public class cadastro_alunos {
    
    private String nomeAluno, turma;
    private int numeroRA;
    private double nota1, nota2;
    
    public cadastro_alunos() { }  //construtor vazio
    
    public cadastro_alunos(String nomeAluno, int numeroRA, double nota1, double nota2){
        
        this.nomeAluno = nomeAluno;
        this.numeroRA = numeroRA;
        this.turma = "POO";
        this.nota1 = nota1;
        this.nota2 = nota2;
        
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getNumeroRA() {
        return numeroRA;
    }

    public void setNumeroRA(int numeroRA) {
        this.numeroRA = numeroRA;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double calcularMediaAritmetica(){
        double mediaAritmetica;
        mediaAritmetica = ((nota1 + nota2) / 2);
        return mediaAritmetica;
    }
    
    public String situacaoAluno(){
        String validaSituacaoAluno;
        double mediaAluno = calcularMediaAritmetica();
        
        if(mediaAluno >= 5.0 && mediaAluno <= 10.0){
            validaSituacaoAluno = "Aprovado";
        }
        else if(mediaAluno >= 0.0 && mediaAluno < 5.0){
            validaSituacaoAluno = "Reprovado";
        }
        else{
            validaSituacaoAluno = "Valores digitados são invalidos";
        }
        return validaSituacaoAluno;
    }
    
    public String imprimirDadosAluno(){
        
        String dados =  "\nNome do aluno: " + nomeAluno
                       +"\nNumero do RA: " + numeroRA
                       +"\nTurma: " + turma 
                       +"\nNota 1: " + nota1
                       +"\nNota 2: " + nota2
                       +"\nMédia do aluno: " + calcularMediaAritmetica() 
                       +"\nSituação: " + situacaoAluno() +"\n";
        return dados;
    }
}

package gerenciamento_de_alunos;

public class cadastro_alunos {

    private String aluno, nome_disciplina;
    private int numero_ra;
    private double nota_N1, nota_N2, media_final;
    
    public cadastro_alunos () { } // construtor vazio
    
    public cadastro_alunos (String aluno, String nome_disciplina, int numero_ra,double nota_N1, double nota_N2, double media_final){ //construtor aluno  
       this.aluno = aluno;
       this.nome_disciplina = nome_disciplina;
       this.numero_ra = numero_ra;
       this.nota_N1 = nota_N1;
       this.nota_N2 = nota_N2;    
       this.media_final = ((nota_N1 * 0.4) + (nota_N2 * 0.6));
    } 
     
    public String getAluno() {
        return this.aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getNome_disciplina() {
        return this.nome_disciplina;
    }

    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }

    public int getNumero_ra() {
        return this.numero_ra;
    }

    public void setNumero_ra(int numero_ra) {
        this.numero_ra = numero_ra;
    }

    public double getNota_N1() {
        return this.nota_N1;
    }

    public void setNota_N1(double nota_N1) {
        this.nota_N1 = nota_N1;
    }

    public double getNota_N2() {
        return this.nota_N2;
    }

    public void setNota_N2(double nota_N2) {
        this.nota_N2 = nota_N2;
    }
    
    public double getMedia_final() {
        return this.media_final;
    }
    
    public void setMedia_final(double media_final) {
        this.media_final = media_final;
    }
  
    public String imprimirDados(){
    
        String imprimir = "Numero do RA: " + this.getNumero_ra() + "\n" +
                          "Nome do Aluno: " + this.getAluno() + "\n" +
                          "Disciplina Matriculada: " + this.getNome_disciplina() + "\n" +
                          "Nota da prova N1: " + this.getNota_N1() + "\n" +
                          "Nota da prova N2: " + this.getNota_N2() + "\n" +
                          "Media final do aluno: " + this.media_final + "\n";
        return imprimir;    
    }    
    
    public String imprimirAlunoMaiorMedia(){
    
        String imprimir = this.getAluno() + "\n" +
                          "Numero do RA: " + this.getNumero_ra() + "\n" +
                          "Disciplina Matriculada: " + this.getNome_disciplina() + "\n" +
                          "Media final do aluno: " + this.media_final + "\n";
        return imprimir;    
    }  
    
    public String imprimirAlunoMaiorMediaN1(){
    
        String imprimir = this.getAluno() + "\n" +
                          "Numero do RA: " + this.getNumero_ra() + "\n" +
                          "Disciplina Matriculada: " + this.getNome_disciplina() + "\n" +
                          "Nota da prova N1: " + this.getNota_N1() + "\n";
        return imprimir;    
    } 
    
    public String imprimirAlunoMaiorMediaN2(){
    
        String imprimir = this.getAluno() + "\n" +
                          "Numero do RA: " + this.getNumero_ra() + "\n" +
                          "Disciplina Matriculada: " + this.getNome_disciplina() + "\n" +
                          "Nota da prova N2: " + this.getNota_N2() + "\n";
        return imprimir;    
    }  
    
        public String imprimirDadosDesenvolvedor(){
    
        String imprimir = "\nUniversidade Anhembi Morumbi"  +
                          "\nCampus: Paulista 02" +
                          "\nNome: Andrey H. De C. Silva" +
                          "\nRA: 21163712" +
                          "\nCurso: Sistemas de Informação / Semestre: 2º" +
                          "\nDisciplina: Programação Orientada a Objetos" +
                          "\nProfessor: Luciano Freire" +
                          "\n\n";
        return imprimir;    
    }   
}

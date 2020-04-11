package atividade03;

import java.text.DecimalFormat;

public class Cadastro_Produtos {
    
    private String nome, descricao;
    private double precoDeCusto, valorImposto,lucro, valorLucro, pecroDeVenda;
    private int codigoDoProduto;
    
    DecimalFormat df = new DecimalFormat("###,##0.00");
    
    public Cadastro_Produtos () { } // construtor vazio
    
    public Cadastro_Produtos(int codigoDoProduto, String nome, String descricao, double precoDeCusto, double lucro){   
        this.codigoDoProduto = codigoDoProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.precoDeCusto = precoDeCusto;
        this.lucro = lucro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String Descricao) {
        this.descricao = Descricao;
    }

    public Double getPrecoDeCusto() {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(Double precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }

    public int getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(int codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }   
    
    public double calcularLucro(){
        valorLucro = (precoDeCusto * (lucro/100));
        return valorLucro;  
    }
    
    public double calcularImposto(){
        if(precoDeCusto > 500.00){
            valorImposto = (precoDeCusto * 0.15);
        }
        else if(precoDeCusto <= 500.00){
            valorImposto = (precoDeCusto * 0.10);
        }
        return this.valorImposto;
    } 
        
    public double calcularPrecoVenda(){
        pecroDeVenda = (precoDeCusto + valorImposto + valorLucro);
        return this.pecroDeVenda;
    }
    
    public String imprimirDados(){
        
        double valorCusto = getPrecoDeCusto();
        
        String imprimir = "\nNome do produto: " + this.getNome()
                        + "\nDescrição do produto: " + this.getDescricao()
                        + "\nPreço de custo do produto: " + (df.format(valorCusto)) + "\n\n";
        return imprimir;
    }
     
    public String imprimirTodosDados(){
        
        double valorCusto = getPrecoDeCusto();
        double valorImpostos = calcularImposto();
        double valorLucro = calcularLucro();
        double valorPrecoVenda = calcularPrecoVenda();
    
        String imprimir = "\nNome do produto: " + this.getNome()
                        + "\nDescrição do produto: " + this.getDescricao()
                        + "\nPreço de custo do produto: " + (df.format(valorCusto))
                        + "\nValor de impostos: " + (df.format(valorImpostos))
                        + "\nValor de lucro: " + (df.format(valorLucro))
                        + "\nValor preço de venda: " + (df.format(valorPrecoVenda))
                        + "\n\n";
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

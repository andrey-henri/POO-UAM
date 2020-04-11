package atividade02;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ContaCorrente {
    
    private int numeroConta, numeroAgencia;
    private double saldo;
    private String nomeCorrentista, tipo;
    
    public ContaCorrente (String nomeCorrentista, String tipo ,int numeroConta, int numeroAgencia){
        this.saldo = 100;
        this.nomeCorrentista = nomeCorrentista;
        this.tipo = tipo;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
    }
    
    public ContaCorrente(){
    
    }
        
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    public String exibirSaldo(){
      DecimalFormat df = new DecimalFormat("###,##0.00");
      return "Saldo atual: " +df.format(saldo);
     
    }

    public void setDeposito(double valorDeposito){   
        saldo = saldo + valorDeposito;
    }
        
    public void setSaque(double valorSacado){
    
        if(saldo >= valorSacado){
            saldo = saldo - valorSacado;
        }
        else if(saldo < valorSacado && tipo.equals("especial") || tipo.equals("Especial")){
            saldo = saldo - valorSacado;
        }
        else{
            JOptionPane.showMessageDialog(null,"Operação não autorizada, para esse cliente!");
        }
        
    }
}

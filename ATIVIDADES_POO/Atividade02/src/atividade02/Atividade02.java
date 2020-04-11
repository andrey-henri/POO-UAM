package atividade02;

import javax.swing.JOptionPane;

public class Atividade02 {

    public static void main(String[] args) {
        
        String validaSairAplicacao = "N";
                
        ContaCorrente cliente = new ContaCorrente();
        
        cliente.setNomeCorrentista(JOptionPane.showInputDialog(null,"Digite o nome do correntista a ser cadastrado: "));
        cliente.setTipo(JOptionPane.showInputDialog(null,"Digite o tipo da conta a ser criada: " +"\n'comum' e 'especial'"));
        cliente.setNumeroAgencia(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero da agência: ")));
        cliente.setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero da conta: ")));
        cliente.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do saldo inicial da conta a ser aberta: ")));
        
            do{
            int operacao = (Integer.parseInt(JOptionPane.showInputDialog(null,"### MENU DE OPERAÇÕES ###\n"
                                                                             + " 1 - Visualizar Saldo\n"
                                                                             + " 2 - Realizar Deposito\n"
                                                                             + " 3 - Realizar Saque\n"
                                                                             + " 4 - Sair do programa")));
            switch(operacao){
            case 1:
                String mostrarSaldo;
                mostrarSaldo = cliente.exibirSaldo();
                JOptionPane.showMessageDialog(null,mostrarSaldo);
            break;
            
            case 2:
                cliente.setDeposito((Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor a ser depositado em sua conta: "))));
            break;
            
            case 3:
                cliente.setSaque((Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor a ser sacado em sua conta: "))));
            break;
            
            case 4:
                System.exit(0); // Encerra aplicação
            break;
            
            }
            
            validaSairAplicacao = JOptionPane.showInputDialog(null,"Deseja realizar outra operação? " + "Digite 'S' para Sim e 'N' para Não");
            
        }while("s".equals(validaSairAplicacao) || "S".equals(validaSairAplicacao));
    }
}
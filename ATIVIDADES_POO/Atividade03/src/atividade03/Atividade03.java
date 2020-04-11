package atividade03;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Atividade03 {

    public static void main(String[] args) {
        
        String validaSairAplicacao = "N";

        Cadastro_Produtos Produtos = new Cadastro_Produtos();
        Cadastro_Produtos vetor_Produtos [] = new Cadastro_Produtos [999999];
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        JOptionPane.showMessageDialog(null,Produtos.imprimirDadosDesenvolvedor());
        
        Produtos.setCodigoDoProduto(123);
        Produtos.setNome("Calculadora");
        Produtos.setDescricao("HP XP 360");
        Produtos.setPrecoDeCusto(59.90);
        Produtos.setLucro(15);
        
        vetor_Produtos[Produtos.getCodigoDoProduto()] = (new Cadastro_Produtos(Produtos.getCodigoDoProduto(),Produtos.getNome(),Produtos.getDescricao(), Produtos.getPrecoDeCusto(),Produtos.getLucro()));
        
        do{
            try{
                int operacao = (Integer.parseInt(JOptionPane.showInputDialog(null,"### MENU DE FUNCIONALIDADES DO SISTEMA ###\n\n"
                                                                                + "Digite 1 - Cadastrar produtos\n"
                                                                                + "Digite 2 - Imprimir dados de um determinado produto\n"
                                                                                + "Digite 3 - Calcular e mostrar o preço de venda do produto\n"
                                                                                + "Digite 4 - Calcular e mostrar margem de lucro do produto\n"
                                                                                + "Digite 5 - Calcular e mostrar valor do imposto do produto\n"
                                                                                + "Digite 6 - Imprimir dados do produto após todos os calculos\n"
                                                                                + "Digite 9 - Sair do programa\n\n"))); 

                switch(operacao){
                    
                    case 1:
                        Produtos.setCodigoDoProduto(Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor, digite o codigo do produto a ser cadastrado: ")));
                        Produtos.setNome(JOptionPane.showInputDialog(null,"Por favor, digite o nome do produto a ser cadastrado: "));
                        Produtos.setDescricao(JOptionPane.showInputDialog(null,"Por favor, digite a descrição do produto a ser cadastrado: "));
                        Produtos.setPrecoDeCusto(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de custo do produto a ser cadastrado: ")));
                        Produtos.setLucro(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor(percentual) que deseja obter de lucro:\n Obs: Não digite o simbolo de Percentual (%)! ")));
                        vetor_Produtos[Produtos.getCodigoDoProduto()] = (new Cadastro_Produtos(Produtos.getCodigoDoProduto(),Produtos.getNome(),Produtos.getDescricao(), Produtos.getPrecoDeCusto(),Produtos.getLucro()));
                    break;

                    case 2:
                        Produtos.setCodigoDoProduto(Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor, digite o codigo do produto que seja imprimir os dados: ")));
                        JOptionPane.showMessageDialog(null,vetor_Produtos[Produtos.getCodigoDoProduto()].imprimirDados());
                    break;

                    case 3:
                        Produtos.setCodigoDoProduto(Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor, digite o codigo do produto que seja calcular e mostrar o preço de venda: ")));
                        vetor_Produtos[Produtos.getCodigoDoProduto()].calcularImposto();
                        vetor_Produtos[Produtos.getCodigoDoProduto()].calcularLucro();
                        JOptionPane.showMessageDialog(null,"Preço de venda do produto: " + (df.format(vetor_Produtos[Produtos.getCodigoDoProduto()].calcularPrecoVenda())));                        
                    break;

                    case 4:
                        Produtos.setCodigoDoProduto(Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor, digite o codigo do produto que seja calcular e mostrar o valor de lucro: ")));
                        JOptionPane.showMessageDialog(null,"Margem de lucro do produto: " + (df.format(vetor_Produtos[Produtos.getCodigoDoProduto()].calcularLucro())));                        
                    break;

                    case 5:
                        Produtos.setCodigoDoProduto(Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor, digite o codigo do produto que seja calcular e mostrar o valor de impostos: ")));
                        JOptionPane.showMessageDialog(null,"Valor de impostos do produto: " + (df.format(vetor_Produtos[Produtos.getCodigoDoProduto()].calcularImposto())));                        
                    break;

                    case 6:
                        Produtos.setCodigoDoProduto(Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor, digite o codigo do produto que seja imprimir os dados: ")));
                        JOptionPane.showMessageDialog(null,vetor_Produtos[Produtos.getCodigoDoProduto()].imprimirTodosDados());
                    break;
                    
                    case 9:
                        JOptionPane.showMessageDialog(null,"A aplicação será encerrada!");
                        validaSairAplicacao = "S";
                    break;                
                }
            }
            catch (NullPointerException erro) {
                JOptionPane.showMessageDialog(null,"Não foi digitado um valor numerico (Ex: 5)"
                + "\nOperação não pode ser concluida, tente novamente!\n"); // Caso não seja digitado um valor numerico
            }
            catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null,"Não foi digitado um valor numerico no formato correto (Ex: 7)"
                + "\nOperação não pode ser concluida, tente novamente!\n"); // Caso não seja digitado um valor numerico
            }              
        }while("n".equals(validaSairAplicacao) || "N".equals(validaSairAplicacao));
        
        System.exit(0); // Encerra aplicação
    }
}

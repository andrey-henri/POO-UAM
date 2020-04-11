package exercicio01;

import javax.swing.JOptionPane;

public class Exercicio01 {
    
    public static void main(String[] args) {

        Vinhos cadastro_vinhos = new Vinhos();
        Vinhos vetor_cadastro_vinhos [] = new Vinhos [10];
        
        vetor_cadastro_vinhos[0] = (new Vinhos("Vinho Refinado", "Safra 90", 2001, 89.70));
        vetor_cadastro_vinhos[1] = (new Vinhos("Vinho Tinto", "Safra 87", 1999, 59.80));
        
        cadastro_vinhos.setNomeVinho(JOptionPane.showInputDialog(null,"Por favor, digite o nome do vinho que você deseja cadastrar: \n\n"," Ex: Vinho Tinto ")); 
        cadastro_vinhos.setTipo(JOptionPane.showInputDialog(null,"Por favor, digite o tipo deste vinho: \n\n"," Ex: Safra de 12 anos ")); 
        cadastro_vinhos.setAnoDeFabricacao(Integer.parseInt(JOptionPane.showInputDialog(null,"Agora digite o ano de fabricação deste Vinho: "," Ex: 1997 ")));
        cadastro_vinhos.setPrecoVinho(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço do vinho que deseja cadastrar: "," Ex: 159,90 ")));
        vetor_cadastro_vinhos[2] = (new Vinhos(cadastro_vinhos.getNomeVinho(),cadastro_vinhos.getTipo(),cadastro_vinhos.getAnoDeFabricacao(),cadastro_vinhos.getPrecoVinho()));
        
            double validaPreco = 0.0;
            String nomeVinhoMaiorPreco = null, nomeVinhoMaisVelho = null;
            int ValidaAnoVinho = 99999;
        
            for (int i = 0; i < vetor_cadastro_vinhos.length; i++){
                if (vetor_cadastro_vinhos[i] != null) {
                    if (vetor_cadastro_vinhos[i].getPrecoVinho() > validaPreco){
                        validaPreco = vetor_cadastro_vinhos[i].getPrecoVinho();
                        nomeVinhoMaiorPreco = vetor_cadastro_vinhos[i].getNomeVinho();
                    }
                }
            }
            
            for (int i = 0; i < vetor_cadastro_vinhos.length; i++){
                if (vetor_cadastro_vinhos[i] != null) {
                    if (vetor_cadastro_vinhos[i].getAnoDeFabricacao() < ValidaAnoVinho){
                        ValidaAnoVinho = vetor_cadastro_vinhos[i].getAnoDeFabricacao();
                        nomeVinhoMaisVelho = vetor_cadastro_vinhos[i].getNomeVinho();
                    }
                }
            }
        JOptionPane.showMessageDialog(null,"O vinho mais caro é: " + nomeVinhoMaiorPreco + "\n Valor do vinho: " + validaPreco);
        JOptionPane.showMessageDialog(null,"O vinho mais velho é: " + nomeVinhoMaisVelho + "\n Ano dele: " + ValidaAnoVinho);
    }  
}

package people.management;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Gerenciar {
    
    private ArrayList <Cadastro_pessoas> Array_Pessoas = new ArrayList <Cadastro_pessoas>(); 
    
    public void adicionarPessoas(Cadastro_pessoas NovaPessoa){
        Array_Pessoas.add(NovaPessoa);
    }
    
    public void imprimirDadosPessoa(){
        String dadosPessoa = "";
        for(int i = 0; i < Array_Pessoas.size(); i++){
        dadosPessoa = Array_Pessoas.get(i).consultaPessoa()
                    + Array_Pessoas.get(i).consultaEnderecos()
                    + Array_Pessoas.get(i).consultaTelefones(); 
        JOptionPane.showMessageDialog(null,dadosPessoa);
        }
    }
    
}

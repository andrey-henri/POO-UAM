package contatos;

import java.util.ArrayList;

public class Gerenciar_contatos {
    
    ArrayList <Cadastro_contatos> Array_cadastro_contatos = new ArrayList();
    
    public void addContatosArray (Cadastro_contatos addContatos){
        Array_cadastro_contatos.add(addContatos);
    }
    
    public void dadosContatos(){
        for(Cadastro_contatos contatos : Array_cadastro_contatos ){
            System.out.println("\nNome: " + contatos.getNome()
                              +"\nEndereço: " + contatos.getEndereco()
                              +"\n" + contatos.consultaTelefones());
        }
    }
}

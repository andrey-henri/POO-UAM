package contatos;

import java.util.ArrayList;

public class Contatos {

    public static void main(String[] args) {
        
        Cadastro_contatos addContatos = new Cadastro_contatos();
        Cadastro_telefones addTelefones = new Cadastro_telefones();
        Gerenciar_contatos Array = new Gerenciar_contatos();

        addContatos.setNome("Andrey henrique");
        addContatos.setEndereco("Rua Vênus, Nº330");
        
        addTelefones.setCodigo_de_area(11);
        addTelefones.setNumero_telefone(40511444);
        addTelefones.setCod_tipo_telefone(1);
        addContatos.setArray_telefones(new ArrayList<>());
        addContatos.getArray_telefones().add(new Cadastro_telefones(addTelefones));
        
        addTelefones.setCodigo_de_area(11);
        addTelefones.setNumero_telefone(991147895);
        addTelefones.setCod_tipo_telefone(2);
        addContatos.getArray_telefones().add(new Cadastro_telefones(addTelefones));
        Array.addContatosArray(new Cadastro_contatos(addContatos));
                                
        addContatos.setNome("Rosana de Souza");
        addContatos.setEndereco("Rua Vênus, Nº330 - Diadema SP");
        
        addContatos.setArray_telefones(new ArrayList<>());
        addTelefones.setCodigo_de_area(11);
        addTelefones.setNumero_telefone(991345521);
        addTelefones.setCod_tipo_telefone(2);
        
        addContatos.getArray_telefones().add(new Cadastro_telefones(addTelefones));
        Array.addContatosArray(new Cadastro_contatos(addContatos));

        Array.dadosContatos();        
    }
    
}

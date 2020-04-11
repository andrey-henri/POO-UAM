package pessoas;

import javax.swing.JOptionPane;

public class Menu_contatos {
    
    int sairMenuContatos = 0;
    Cadastro_contatos cContatos = new Cadastro_contatos();
    Cadastro_telefones cTelefones = new Cadastro_telefones();
    Gestao cadastrar_pesssoa = new Gestao();

    Object[] menu_contatos = {"1 - Cadastrar Contato",
                              "2 - Buscar Contato pelo nome e exibir seus dados",
                              "3 - Modificar dados do Contato",
                              "4 - Excluir Contato",
                              "5 - Visualizar todos Contatos",
                              "6 - Cancelar operação"};

    public void executaMenuContatos(){
    do{    
        String menu_contato = (String) JOptionPane.showInputDialog(null,"Selecione alguma das opções abaixo:\n\n","MENU DE CONTATOS",JOptionPane.QUESTION_MESSAGE,null,menu_contatos,null);
        menu_contato = menu_contato.substring(0,1);
        int opcaoMenu_contatos = Integer.parseInt(menu_contato);
        
            switch(opcaoMenu_contatos){
                case 1:
                    cContatos.setNome_contato("Rosana de Souza");
                    cContatos.setEndereco("Rua vênus, Nº 330");
                    cContatos.setEmails("rosanacarvalhosilva@hotmail.com");
                    Cadastro_telefones tel = new Cadastro_telefones();
                    tel.setCodigo_de_area(11);
                    tel.setNumero_telefone(40515635);
                    tel.setCod_tipo_telefone(1);
                    cContatos.setTelefone_fixo(tel);
                    System.out.println("(" + cContatos.getTelefone_fixo().getCodigo_de_area() + ") " + cContatos.getTelefone_fixo().getNumero_telefone());
                    //cContatos.setTelefone_fixo(new Cadastro_telefones(cTelefones.getCodigo_de_area(),cTelefones.getNumero_telefone(),cTelefones.getCod_tipo_telefone()));
                    cadastrar_pesssoa.adicionarContato(cContatos);

                    cContatos.setNome_contato("Yuri Gabriel");
                    cContatos.setEndereco("Rua vênus, Nº 330");
                    cContatos.setEmails("yuri.gabriel@hotmail.com");
                    cTelefones.setCodigo_de_area(11);
                    cTelefones.setNumero_telefone(40515635);
                    cTelefones.setCod_tipo_telefone(2);
                    cContatos.setTelefone_fixo(new Cadastro_telefones(cTelefones.getCodigo_de_area(),cTelefones.getNumero_telefone(),cTelefones.getCod_tipo_telefone()));
                    cadastrar_pesssoa.adicionarContato((new Cadastro_contatos(cContatos.getNome_contato(),cContatos.getEndereco(),cContatos.getEmails(),cContatos.getTelefone_fixo())));                      
                break;

                case 2:
                    String buscarContato = (JOptionPane.showInputDialog(null,"Por digite o nome do contato que deseja localizar:: ", "Rosana de Souza"));
                    JOptionPane.showMessageDialog(null, cadastrar_pesssoa.buscarContato(buscarContato));
                break;

                case 3:
                    String modificarContato = (JOptionPane.showInputDialog(null,"Por digite o nome do contato que deseja atualizar os dados: ", "Rosana de Souza"));
                    cContatos.setNome_contato("Yuri Gabriel de Carvalho Silva");
                    cContatos.setEndereco("Rua vênus, Nº 330 - Casa: 01");
                    cContatos.setEmails("yuri.gabriel@hotmail.com");
                    cTelefones.setCodigo_de_area(11);
                    cTelefones.setNumero_telefone(40515635);
                    cTelefones.setCod_tipo_telefone(2);
                    cContatos.setTelefone_fixo(cTelefones);                  
                    JOptionPane.showMessageDialog(null, cadastrar_pesssoa.modificarContato(modificarContato, cContatos.getNome_contato(), cContatos.getEndereco(), cContatos.getEmails(), cContatos.getTelefone_fixo()));
                break;

                case 4:
                    String excluirContato = (JOptionPane.showInputDialog(null,"Por digite o nome do contato que deseja excluir: ", "Yuri Gabriel"));
                    JOptionPane.showMessageDialog(null, cadastrar_pesssoa.excluirContato(excluirContato));
                break;

                case 5:
                    JOptionPane.showMessageDialog(null, cadastrar_pesssoa.VisualizarContatos());
                break;

                case 6:
                    sairMenuContatos = 6;
                break;                    
            } 
            
        }while(sairMenuContatos != 6);
    }
}

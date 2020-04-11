package people.management;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class PeopleManagement {

    public static void main(String[] args) {  
        
        String validaSairAplicacao = "N"; //Valida o encerramento da aplicação
        int validarConfirmacaoEndereco = 0;
        int validarConfirmacaoTelefone = 0;
        
        UIManager.put("OptionPane.cancelButtonText", "Cancelar");
        UIManager.put("OptionPane.yesButtonText", "Sim");  
        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.okButtonText", "Confirmar");
        
        Object[] opcoes = { "Sim", "Não" };
        
        Object[] menu_geral = {"1 - Cadastrar novo cliente",
                               "2 - Gerenciar contatos",
                               "3 - Imprimir dados dos clientes: ",
                               "9 - Sair da aplicação\n"};      
        
        Object[] tipoEndereco = {"1 - Rua",
                                 "2 - Avenida",
                                 "3 - Travessa ",
                                 "9 - Cancelar operação\n"};     
        
        Object[] tipoTelefone = {"1 - Residencial",
                                 "2 - Celular",
                                 "3 - Comercial ",
                                 "9 - Cancelar operação\n"};         
        
        Cadastro_pessoas Pessoa = new Cadastro_pessoas(); //Objeto da classe Cadastro_Pessoas
        Enderecos Endereco = new Enderecos(); // Objeto da classe Enderecos
        Telefones Telefone = new Telefones(); // Objeto da classe Telefones
        Gerenciar ArrayPessoa = new Gerenciar(); // Objeto da classe Gerenciar
        
        //Cadastro teste
        Pessoa.setTipoPessoa('F');
        Pessoa.setNomeFantasia("Andrey Henrique");
        Pessoa.setNr_cpf_cnpj("414.313.368-74");
        Pessoa.setEmail("Andrey.28091997@gmail.com");
        
        //Endereco 1 do arrayList do cadastro teste
        Pessoa.setArray_Enderecos(new ArrayList<>());
        Endereco.setCep("09990-010");
        Endereco.setTipoEndereco(1);
        Endereco.setEndereco("Vênus");
        Endereco.setNumeroEndereco(330);
        Endereco.setCidade("Diadema");
        Endereco.setEstado("São Paulo");
        Endereco.setPaís("Brasil");
        Pessoa.getArray_Enderecos().add(new Enderecos(Endereco));
        
        //Telefone 1 do arrayList do cadastro teste
        Pessoa.setArray_Telefones(new ArrayList<>());
        Telefone.setCod_tipo_telefone(2);
        Telefone.setCodigo_de_area(11);
        Telefone.setNumero_telefone(998101997);
        Pessoa.getArray_Telefones().add(new Telefones(Telefone));
        
        //Passa o objeto cadastro teste para classe Gerenciar, onde o mesmo é adicionado em um ArrayList
        ArrayPessoa.adicionarPessoas(new Cadastro_pessoas(Pessoa));
        
        //imprimir dados cadastro teste
        //ArrayPessoa.imprimirDadosPessoa();
        //JOptionPane.showMessageDialog(null,ArrayPessoa.imprimirDadosPessoa());
        
        do{
            String menu_Geral = (String) JOptionPane.showInputDialog(null,"Selecione alguma das opções abaixo:\n\n","MENU DE FUNCIONALIDADES DO SISTEMA",JOptionPane.QUESTION_MESSAGE,null,menu_geral,null);
            int opcaoMenu_Geral = Integer.parseInt(menu_Geral.substring(0,1));

            switch(opcaoMenu_Geral){
                
                case 1:
                    
                    Pessoa.setTipoPessoa(JOptionPane.showInputDialog(null, "Por favor digite o tipo de cliente a ser cadastrado: "
                    + "\n 'F' para pessoa Fisica"
                    + "\n  J' para pessoa Juridica", "F").charAt(0));
                    Pessoa.setNomeFantasia(JOptionPane.showInputDialog(null,"Por favor digite o nome de seu cliente: ", "Milena Lima"));
                    if(Pessoa.getTipoPessoa() == 'F'){
                        Pessoa.setNr_cpf_cnpj(JOptionPane.showInputDialog(null,"Agora digite o CPF: ", "414.313.456-85"));
                    }
                    else if(Pessoa.getTipoPessoa() == 'J'){
                        Pessoa.setNr_cpf_cnpj(JOptionPane.showInputDialog(null,"Agora digite o CNPJ: ", "58.408.108/0001-58")); 
                    }
                    Pessoa.setEmail(JOptionPane.showInputDialog(null,"Digite seus e-mails, os separando por virgula (,): ", "milena.lima.silva@hotmail.com"));                                           

                    //validarConfirmacaoEndereco = JOptionPane.showOptionDialog(null, "Deseja cadastrar um endereço para este cliente? ", "Cadastro de Endereços", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
                    validarConfirmacaoEndereco = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um endereço para este cliente? ", "Cadastro de Endereços",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    Pessoa.setArray_Enderecos(new ArrayList<>());
                    while(validarConfirmacaoEndereco == JOptionPane.YES_OPTION){
                        Endereco.setCep(JOptionPane.showInputDialog(null,"Digite o CEP do endereço: ", "09990-040"));                      
                        String menu_Endereco = (String) JOptionPane.showInputDialog(null,"Selecione alguma das opções de tipo de endereço abaixo:\n\n","MENU DE TIPOS DE ENDEREÇO",JOptionPane.QUESTION_MESSAGE,null,tipoEndereco,null);
                        menu_Endereco = menu_Endereco.substring(0,1);
                        Endereco.setTipoEndereco(Integer.parseInt(menu_Endereco));
                        Endereco.setEndereco(JOptionPane.showInputDialog(null,"Digite o seu endereço: ", "Serra da Bocaina"));
                        Endereco.setNumeroEndereco(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero de seu endereço: ", "175")));
                        Endereco.setCidade(JOptionPane.showInputDialog(null,"Digite o nome de sua cidade: ", "Diadema"));
                        Endereco.setEstado(JOptionPane.showInputDialog(null,"Digite o nome de seu estado: ", "São Paulo"));
                        Endereco.setPaís(JOptionPane.showInputDialog(null,"Digite o país aonde o cliente reside: ", "Brazil"));
                        Pessoa.getArray_Enderecos().add(new Enderecos(Endereco));
                        validarConfirmacaoEndereco = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro endereço para este cliente? ", "Cadastro de Endereços",JOptionPane.YES_NO_OPTION);
                    }
                    
                    validarConfirmacaoTelefone = JOptionPane.showOptionDialog(null, "Deseja cadastrar um telefone para este cliente? ", "Cadastro de Telefones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
                    Pessoa.setArray_Telefones(new ArrayList<>());
                    while(validarConfirmacaoTelefone == JOptionPane.YES_OPTION){ //Caso precise: JOptionPane.NO_OPTION ou JOptionPane.CANCEL_OPTION
                        String menu_telefone = (String) JOptionPane.showInputDialog(null,"Selecione alguma das opções de tipo de telefone abaixo:\n\n","MENU DE TIPOS DE TELEFONE",JOptionPane.QUESTION_MESSAGE,null,tipoTelefone,null);
                        menu_telefone = menu_telefone.substring(0,1);
                        Telefone.setCod_tipo_telefone(Integer.parseInt(menu_telefone));
                        Telefone.setCodigo_de_area(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o codigo de área de seu estado: ", "11")));
                        Telefone.setNumero_telefone(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero de seu telefone: ", "40884075")));
                        validarConfirmacaoTelefone = JOptionPane.showOptionDialog(null, "Deseja cadastrar outro telefone para este cliente? ", "Cadastro de Telefones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
                        Pessoa.getArray_Telefones().add(new Telefones(Telefone));
                    }
                    ArrayPessoa.adicionarPessoas(new Cadastro_pessoas(Pessoa));
                break;
                
                case 3:
                   ArrayPessoa.imprimirDadosPessoa(); 
                break;
                
            }
            
        }while("n".equals(validaSairAplicacao) || "N".equals(validaSairAplicacao));
                
    } 
      
}
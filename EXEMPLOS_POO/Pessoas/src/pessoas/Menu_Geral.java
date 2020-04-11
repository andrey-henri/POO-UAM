package pessoas;

import javax.swing.JOptionPane;

public class Menu_Geral {
    
    public static void main(String[] args) {
        
        String validaSairAplicacao = "N";
        
        Cadastro_inicial cadastro = new Cadastro_inicial();
        Cadastro_endereco cEndereco = new Cadastro_endereco();
        Cadastro_telefones cTelefones = new Cadastro_telefones();
        Menu_contatos Menu_contatos = new Menu_contatos();
        Gestao cadastrar_pesssoa = new Gestao();
        
        Object[] menu_geral = {"1 - Cadastrar novo cliente",
                               "2 - Gerenciar contatos",
                               "3 - Imprimir dados do cliente: ",
                               "9 - Sair da aplicação\n"};
        
        do{
            String menu_Geral = (String) JOptionPane.showInputDialog(null,"Selecione alguma das opções abaixo:\n\n","MENU DE FUNCIONALIDADES DO SISTEMA",JOptionPane.QUESTION_MESSAGE,null,menu_geral,null);
            menu_Geral = menu_Geral.substring(0,1);
            int opcaoMenu_Geral = Integer.parseInt(menu_Geral);

            switch(opcaoMenu_Geral){
                
                case 1:
                    cadastro.setNome(JOptionPane.showInputDialog(null,"Por digite seu nome: ", "Andrey"));
                    cadastro.setTipo_pessoa(JOptionPane.showInputDialog(null,"Por digite 'F' para pessoa Fisica ou 'J' para pessoa Juridica: ", "F").charAt(0));

                    if(cadastro.getTipo_pessoa() == 'F'){
                        cadastro.setNr_cpf_cnpj(JOptionPane.showInputDialog(null,"Por favor digite seu CPF: ","41431336874"));
                        cTelefones.setCodigo_de_area(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o DDD de seu telefone: ", "011")));
                        cTelefones.setNumero_telefone(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero do telefone: ", "40515635")));
                        cTelefones.setCod_tipo_telefone(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite '1' para telefone Residencial\n Digite '2' para telefone celular\n Digite '3' para telefone comercial ", "1"))); 
                        cadastro.setTelefones(cTelefones);
                        
                    }
                    else if(cadastro.getTipo_pessoa() == 'J'){
                        cadastro.setNr_cpf_cnpj(JOptionPane.showInputDialog(null,"Por favor digite seu CNPJ: "));
                        cadastro.setNr_IE(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de sua inscrição Estadual: ")));
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Informação digitada no tipo de pessoa é invalida!");
                    }
                    cadastro.setTelefones(cTelefones);
                    cadastrar_pesssoa.adicionarNoArray((new Cadastro_inicial(cadastro.getNome(),cadastro.getTipo_pessoa(),cadastro.getNr_cpf_cnpj(),cadastro.getNr_IE(),cadastro.getTelefones())));
                    //cadastrar_pesssoa.adicionarTelefones(new Cadastro_telefones(cTelefones.getTelefone_fixo(),cTelefones.getTelefone_celular(),cTelefones.getTelefone_comercial()));                     
                break;
                
                case 2:
                    Menu_contatos.executaMenuContatos();
                break;
                
                case 9:
                    JOptionPane.showMessageDialog(null,"A aplicação será encerrada!");
                    validaSairAplicacao = "S";   
                break;
            }
            
        }while("n".equals(validaSairAplicacao) || "N".equals(validaSairAplicacao));
    }    
}

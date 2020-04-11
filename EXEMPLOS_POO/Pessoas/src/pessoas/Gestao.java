package pessoas;

import java.util.ArrayList;

public class Gestao {
    
    Cadastro_contatos contatos = new Cadastro_contatos();
    
    ArrayList <Cadastro_inicial> Array_cadastro_pessoas = new ArrayList <Cadastro_inicial>();
    ArrayList <Cadastro_contatos> Array_cadastro_contatos = new ArrayList <Cadastro_contatos>();
    
       
    public void adicionarNoArray(Cadastro_inicial adicionarNovaPessoa){
        Array_cadastro_pessoas.add(adicionarNovaPessoa);
    }
 
    public void adicionarContato(Cadastro_contatos addContato){
        Array_cadastro_contatos.add(addContato);
    }    
    
    public int pessoasFisicas(){
        int qtdpessoasFisicas = 0;
        for(Cadastro_inicial BuscarPessoasF: Array_cadastro_pessoas){
            if(BuscarPessoasF.getTipo_pessoa() == 'F'){
                qtdpessoasFisicas++;
            }
        }
        return qtdpessoasFisicas;
    }
    
public String buscarContato(String nomedigitado){
        String dadosContato = "";
        for(int i = 0; i <Array_cadastro_contatos.size(); i++){            
            if(Array_cadastro_contatos.get(i).getNome_contato().equals(nomedigitado)){
                dadosContato = Array_cadastro_contatos.get(i).imprimirDadosContato();
            }
            else if("".equals(dadosContato)){
                dadosContato = "Nome do contato não localizado!";
            }
        }
        return dadosContato;
    }

    public String excluirContato(String nomedigitado){
        String dadosContato = null;
        for(int i = 0; i <Array_cadastro_contatos.size(); i++){            
            if(Array_cadastro_contatos.get(i).getNome_contato().equals(nomedigitado)){
                Array_cadastro_contatos.remove(i);
                dadosContato = "Contato: " + nomedigitado + " excluido com sucesso!";
            }  
            else if("".equals(dadosContato)){
                dadosContato = "Nome do contato não localizado!";
            }           
        }
        return dadosContato;
    }    
    
        public String modificarContato(String nomedigitado, String novo_nome, String novo_endereco, String novos_emails, Cadastro_telefones novo_telefone){
        String dadosContato = "";
            for(int i = 0; i <Array_cadastro_contatos.size(); i++){            
                if(Array_cadastro_contatos.get(i).getNome_contato().equals(nomedigitado)){
                    Array_cadastro_contatos.get(i).setNome_contato(novo_nome);
                    Array_cadastro_contatos.get(i).setEndereco(novo_endereco);
                    Array_cadastro_contatos.get(i).setEmails(novos_emails);
                    Array_cadastro_contatos.get(i).setTelefone_fixo(novo_telefone);
                    dadosContato = "Dados atualizados com sucesso!" + Array_cadastro_contatos.get(i).imprimirDadosContato();
                }
                else if("".equals(dadosContato)){
                    dadosContato = "Nome do contato não localizado!";
                }   
            }
            return dadosContato;    
        }    

    public String VisualizarContatos(){
        String dadosContatos = "";
        for(Cadastro_contatos buscarContato: Array_cadastro_contatos){
            if (Array_cadastro_contatos != null) {
                dadosContatos += buscarContato.imprimirDadosContatos();
            }
        }
        return dadosContatos;
    }
    
}

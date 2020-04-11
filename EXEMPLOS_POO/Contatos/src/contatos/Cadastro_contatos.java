package contatos;

import java.util.ArrayList;

public class Cadastro_contatos {
    
    private String nome;
    private String endereco; 
    private ArrayList <Cadastro_telefones> Array_telefones = new ArrayList <Cadastro_telefones>();

    public Cadastro_contatos() {
    }
    
    public Cadastro_contatos(Cadastro_contatos objeto_Cadastro_contatos) {
        this.nome = objeto_Cadastro_contatos.getNome();
        this.endereco = objeto_Cadastro_contatos.getEndereco();
        this.Array_telefones = objeto_Cadastro_contatos.Array_telefones;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public ArrayList <Cadastro_telefones> getArray_telefones() {
        return Array_telefones;
    }

    public void setArray_telefones(ArrayList <Cadastro_telefones> Array_telefones) {
        this.Array_telefones = Array_telefones;
    }   

    public String consultaTelefones(){
        String telefones = "";
        
        for(int i = 0; i < Array_telefones.size(); i++){
            telefones += "" + Array_telefones.get(i).imprimirTelefones();
        }

        return telefones;
    }  
    
    public void limparArrayTelefones(){
        Array_telefones.clear();
    }
    
}

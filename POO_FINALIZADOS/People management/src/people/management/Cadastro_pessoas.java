package people.management;
import java.util.ArrayList;

public class Cadastro_pessoas {
    
    private char tipoPessoa; //Tipo de pessoa 'F' para fisica e 'J' para juridica
    private String pessoa; //Conversão da variavel tipoPessoa em texto
    private String nr_cpf_cnpj; // numero do CPF / CNPJ de acordo com o tipo
    private String nomeFantasia; //Nome da pessoa ou fantasia em caso de empresa
    private String email; // armazenar email e caso de mais de um separar por virgula ","
    private ArrayList <Enderecos> Array_Enderecos = new ArrayList <Enderecos>();
    private ArrayList <Telefones> Array_Telefones = new ArrayList <Telefones>();
    
    public Cadastro_pessoas(){ } // Contrutor vazio para declarar um objeto na classe principal
        
    //Contrutor para passar um objeto do tipo da propria classe
    public Cadastro_pessoas(Cadastro_pessoas objetoCadastrarPessoa){
        this.tipoPessoa = objetoCadastrarPessoa.getTipoPessoa(); 
        this.pessoa = objetoCadastrarPessoa.getPessoa();
        this.nr_cpf_cnpj = objetoCadastrarPessoa.getNr_cpf_cnpj();
        this.nomeFantasia = objetoCadastrarPessoa.getNomeFantasia();
        this.email = objetoCadastrarPessoa.getEmail();   
        this.Array_Enderecos = objetoCadastrarPessoa.getArray_Enderecos();
        this.Array_Telefones = objetoCadastrarPessoa.getArray_Telefones();
    }
    
    //Metodos Get e set dos atributos da classe    

    public char getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(char tipoPessoa) {
        this.tipoPessoa = tipoPessoa;    
    }

    public String getPessoa() {
        return pessoa;
    }
 
    public String getNr_cpf_cnpj() {
        return nr_cpf_cnpj;
    }

    public void setNr_cpf_cnpj(String nr_cpf_cnpj) {
        this.nr_cpf_cnpj = nr_cpf_cnpj;  
        
        if(this.tipoPessoa == 'F'){
            pessoa = "Física / CPF: " + nr_cpf_cnpj;
        }
        else if(this.tipoPessoa == 'J'){
            pessoa = "Juridica / CNPJ: " + nr_cpf_cnpj;
        }
        else{
            pessoa = null; //pegar possível falha de retorno
        }          
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Enderecos> getArray_Enderecos() {
        return Array_Enderecos;
    }

    public void setArray_Enderecos(ArrayList<Enderecos> Array_Enderecos) {
        this.Array_Enderecos = Array_Enderecos;
    }

    public ArrayList<Telefones> getArray_Telefones() {
        return Array_Telefones;
    }

    public void setArray_Telefones(ArrayList<Telefones> Array_Telefones) {
        this.Array_Telefones = Array_Telefones;
    }
    
    public String consultaEnderecos(){
        String enderecos = "";
        
        for(int i = 0; i < Array_Enderecos.size(); i++){
            enderecos += "" + Array_Enderecos.get(i).imprimirEndereco();
        }
        return enderecos;
    }     
    
    public String consultaTelefones(){
        String telefones = "";
        
        for(int i = 0; i < Array_Telefones.size(); i++){
            telefones += "" + Array_Telefones.get(i).imprimirTelefones();
        }
        return telefones;
    }    
    
    public String consultaPessoa(){
        String dadosPessoa;
        dadosPessoa = "\nNome: " + nomeFantasia
                    + "\nTipo: " + pessoa
                    + "\nEmail(s): " + email + "\n\n";
        return dadosPessoa;
    }
    
}
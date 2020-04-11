package pessoas;

public class Cadastro_inicial {
    
    private String nome, nr_cpf_cnpj;
    private char tipo_pessoa;
    private int nr_IE;
    private Cadastro_telefones telefones;
    
    
    public Cadastro_inicial() {
    
    }
    
    public Cadastro_inicial(String nome, char tipo_pessoa, String nr_cpf_cnpj, int nr_IE, Cadastro_telefones telefones){
        this.nome = nome;
        this.tipo_pessoa = tipo_pessoa;
        this.nr_cpf_cnpj = nr_cpf_cnpj;
        this.nr_IE = nr_IE;    
        this.telefones = new Cadastro_telefones();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNr_cpf_cnpj() {
        return nr_cpf_cnpj;
    }

    public void setNr_cpf_cnpj(String nr_cpf_cnpj) {
        this.nr_cpf_cnpj = nr_cpf_cnpj;
    }

    public char getTipo_pessoa() {
        return tipo_pessoa;
    }

    public void setTipo_pessoa(char tipo_pessoa) {
        this.tipo_pessoa = tipo_pessoa;
    }

    public int getNr_IE() {
        return nr_IE;
    }

    public void setNr_IE(int nr_IE) {
        this.nr_IE = nr_IE;
    }

    public Cadastro_telefones getTelefones() {
        return telefones;
    }

    public void setTelefones(Cadastro_telefones telefones) {
        this.telefones = telefones;
    }
        
    public String imprimirDados(){

        String dados = "Nome: " + nome +
                       "Telefones: " + telefones ;
        return dados;
        
    }
       
}

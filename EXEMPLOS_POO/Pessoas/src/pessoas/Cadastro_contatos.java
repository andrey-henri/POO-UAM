package pessoas;

public class Cadastro_contatos {
    
    private String nome_contato, endereco, emails;
    private Cadastro_telefones telefone_fixo;

    public Cadastro_contatos() {
    }

    public Cadastro_contatos(String nome_contato, String endereco, String emails) {
        this.nome_contato = nome_contato;
        this.endereco = endereco;
        this.emails = emails;
    }
    
    public Cadastro_contatos(String nome_contato, String endereco, String emails, Cadastro_telefones cTelefones) {
        this.nome_contato = nome_contato;
        this.endereco = endereco;
        this.emails = emails;
        this.telefone_fixo = new Cadastro_telefones();
    }    

    public String getNome_contato() {
        return nome_contato;
    }

    public void setNome_contato(String nome_contato) {
        this.nome_contato = nome_contato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public Cadastro_telefones getTelefone_fixo() {
        return telefone_fixo;
    }

    public void setTelefone_fixo(Cadastro_telefones telefone_fixo) {
        this.telefone_fixo = telefone_fixo;
    }
   
    public String imprimirDadosContato(){
        String dados = "\nNome do contato: " + nome_contato
                     + "\nEndereço: " + endereco 
                     + "\nE-mails: " + emails
                     + "\nTelefone: " + telefone_fixo.getNumero_telefone();
        return dados;
    }
    
    public String imprimirDadosContatos(){
        String dados = "\nNome do contato: " + nome_contato
                     + "\nEndereço: " + endereco 
                     + "\nE-mails: " + emails
                     + "\nTelefone: " + telefone_fixo.getNumero_telefone() + "\n\n";
        return dados;
    }
    
}

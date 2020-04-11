package people.management;

public class Enderecos {
    
    private String cep; // Cadastrar cep por pessoa / contatos (Futuramente fazer a busca por cep)
    private int tipoEndereco; //Na classe principal terá um menu para usuario digitar o tipo do campo endereco (Ex: Rua, Avenida)
    private String endereco; //Cadastrar rua, avenida, etc por pessoa / contatos
    private int numeroEndereco; // Cadastrar numero da rua, avenida por pessoa / contatos 
    private String cidade; //Cadastrar cidade por pessoa / contatos
    private String estado; //Cadastrar UF por pessoa / contatos
    private String país; //Cadastrar país por pessoa / contatos
    
    public Enderecos(){ } // Contrutor vazio para declarar um objeto na classe principal

    //Contrutor para passar parâmetro a parâmetro dos atributos da classe
    public Enderecos(String cep, int tipoEndereco, String endereco, int numeroEndereco, String cidade, String estado, String país) {
        this.cep = cep;
        this.tipoEndereco = tipoEndereco;
        this.endereco = endereco;
        this.numeroEndereco = numeroEndereco;
        this.cidade = cidade;
        this.estado = estado;
        this.país = país;
    }
    
    //Contrutor para passar um objeto do tipo da propria classe
    public Enderecos(Enderecos objetoEndereco){
        this.cep = objetoEndereco.getCep();
        this.tipoEndereco = objetoEndereco.getTipoEndereco(); 
        this.endereco = objetoEndereco.getEndereco();
        this.numeroEndereco = objetoEndereco.getNumeroEndereco();
        this.cidade = objetoEndereco.getCidade();
        this.estado = objetoEndereco.getEstado();
        this.país = objetoEndereco.getPaís();    
    }

    //Metodos Get e set dos atributos da classe

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(int tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(tipoEndereco == 1){
            this.endereco = "Rua:" + endereco; 
        }
        else if(tipoEndereco == 2){
            this.endereco = "Avenida:" + endereco; 
        }
        else if(tipoEndereco == 3){
            this.endereco = "Travessa:" + endereco; 
        }
        else{
            this.endereco = endereco; 
        }        
    }

    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }
    
    //Função para realizar a impressão de todos os atributos da classe    
    public String imprimirEndereco(){
        String dadosEndereco;
        
        dadosEndereco = endereco + " Nº" + numeroEndereco
                      + "\nCidade: " + cidade + " Estado: " + estado 
                      + "\nCep: " + cep + " / País: " + país + "\n\n";        
        return dadosEndereco;
    }

}
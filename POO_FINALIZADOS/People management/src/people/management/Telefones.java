package people.management;

public class Telefones {
    
    private int codigo_de_area; // codigo de DDD da pessoa / contato
    private int numero_telefone; // numero de telefone da pessoa / contato
    private int cod_tipo_telefone; // será exibido um menu na classe principal para pessoa digitar o codigo do tipo de telefone (Exemplo: Celular, fixo)
    private String tipo_telefone; // informacao preenchida automaticamente de acordo com a variavel cod_tipo_telefone
    
    public Telefones(){ } // Contrutor vazio para declarar um objeto na classe principal

    //Contrutor para passar parâmetro a parâmetro dos atributos da classe
    public Telefones(int codigo_de_area, int numero_telefone, int cod_tipo_telefone) {
        this.codigo_de_area = codigo_de_area;
        this.numero_telefone = numero_telefone;
        this.cod_tipo_telefone = cod_tipo_telefone;        
    }
    
    //Contrutor para passar um objeto do tipo da propria classe
    public Telefones(Telefones objetoTelefone) {
        this.codigo_de_area = objetoTelefone.getCodigo_de_area();
        this.numero_telefone = objetoTelefone.getNumero_telefone();
        this.cod_tipo_telefone = objetoTelefone.getCod_tipo_telefone(); 
        this.tipo_telefone = objetoTelefone.getTipo_telefone();
    } 
    
    //Metodos Get e set dos atributos da classe    

    public int getCodigo_de_area() {
        return codigo_de_area;
    }

    public void setCodigo_de_area(int codigo_de_area) {
        this.codigo_de_area = codigo_de_area;
    }

    public int getNumero_telefone() {
        return numero_telefone;
    }

    public void setNumero_telefone(int numero_telefone) {
        this.numero_telefone = numero_telefone;
        
        if(this.cod_tipo_telefone == 1){
            this.tipo_telefone = "Residencial";
        }
        else if(this.cod_tipo_telefone == 2){
            this.tipo_telefone = "Celular";
        }
        else if(this.cod_tipo_telefone == 3){
            this.tipo_telefone = "Comercial";
        }
        else{
            this.tipo_telefone = "Nenhum";  
        }         
    }

    public int getCod_tipo_telefone() {
        return cod_tipo_telefone;
    }

    public String getTipo_telefone() {
        return tipo_telefone;
    }

    public void setCod_tipo_telefone(int cod_tipo_telefone) {
        this.cod_tipo_telefone = cod_tipo_telefone;
    }

    public String imprimirTelefones(){
        String telefones = "";
        telefones +=  "Telefone: (" + codigo_de_area + ") " + numero_telefone + "\nTipo: " + tipo_telefone + "\n\n";
        return telefones;
    }  
    
}

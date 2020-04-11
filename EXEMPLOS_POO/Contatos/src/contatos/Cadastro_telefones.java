package contatos;

public class Cadastro_telefones {
    
    private int codigo_de_area , numero_telefone, cod_tipo_telefone;
    private String tipo_telefone;

    public Cadastro_telefones() {
    }
    
    public Cadastro_telefones(Cadastro_telefones objeto_Cadastro_telefones) {
        this.codigo_de_area = objeto_Cadastro_telefones.getCodigo_de_area();
        this.numero_telefone = objeto_Cadastro_telefones.getNumero_telefone();
        this.cod_tipo_telefone = objeto_Cadastro_telefones.getCod_tipo_telefone();
        
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
    }

    public int getCod_tipo_telefone() {
        return cod_tipo_telefone;
    }

    public void setCod_tipo_telefone(int cod_tipo_telefone) {
        this.cod_tipo_telefone = cod_tipo_telefone;
    }

    public String getTipo_telefone() {
        return tipo_telefone;
    }
    
    public String imprimirTelefones(){
        String telefones = "";
        telefones +=  "Telefone: (" + codigo_de_area + ") " + numero_telefone + "\nTipo: " + tipo_telefone + "\n";
        return telefones;
    }

}

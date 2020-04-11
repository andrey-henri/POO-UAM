package pessoas;

public class Cadastro_telefones {
    
    private int codigo_de_area , numero_telefone, cod_tipo_telefone;
    private String tipo_telefone;
    
    public Cadastro_telefones () {}

    public Cadastro_telefones(int codigo_de_area, int numero_telefone, int cod_tipo_telefone) {
        this.codigo_de_area = codigo_de_area;
        this.numero_telefone = numero_telefone;
        this.cod_tipo_telefone = cod_tipo_telefone;
        
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

    public void setTipo_telefone(String tipo_telefone) {
        this.tipo_telefone = tipo_telefone;
    }
    
    public String imprimirTelefones(){
        String dadosTelefone = "(" + codigo_de_area + ") " + numero_telefone + "\n" + tipo_telefone;
        return dadosTelefone;
    }
}

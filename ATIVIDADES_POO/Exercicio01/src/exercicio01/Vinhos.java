package exercicio01;

public class Vinhos {
    
    private String nomeVinho, tipo;
    private int anoDeFabricacao;
    private double precoVinho;
    
    public Vinhos () { } // construtor vazio
    
    public Vinhos (String nomeVinho, String tipo, int anoDeFabricacao, double precoVinho){
        
        this.nomeVinho = nomeVinho;
        this.tipo = tipo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.precoVinho = precoVinho;
    
    }

    public String getNomeVinho() {
        return nomeVinho;
    }

    public void setNomeVinho(String nomeVinho) {
        this.nomeVinho = nomeVinho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public double getPrecoVinho() {
        return precoVinho;
    }

    public void setPrecoVinho(double precoVinho) {
        this.precoVinho = precoVinho;
    }
    
    
}

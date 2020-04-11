package exercicio03;

public class GerenciarPessoas {   
       
    public GerenciarPessoas () {}
    CadastrarPessoas vetor_pessoas [];
    
    public GerenciarPessoas (CadastrarPessoas vetor_pessoas []){
        this.vetor_pessoas = vetor_pessoas;  
    }
    
    public String CalcularitemA(){
        int qtdPessoas = 0;
        for(int i = 0; i < vetor_pessoas.length; i++){
            if(vetor_pessoas[i] != null && vetor_pessoas[i].getCorDoOlhos() == 'C' && vetor_pessoas[i].getAltura() > 1.60){
                    qtdPessoas++;
            }
        }
        String qtdPessoasItemA = "A média de idade das pessoas com olhos castanhos e altua superior a 1,60: " + qtdPessoas;
        return qtdPessoasItemA;
    }

    public String CalcularitemB(){
        int maiorIdade = 0;

        for(int i = 0; i < vetor_pessoas.length; i++){
            if(vetor_pessoas[i] != null && vetor_pessoas[i].getIdade() > maiorIdade){
                maiorIdade = vetor_pessoas[i].getIdade();
            }
        }
        String maiorIdadeHabitantes = " A maior idade entre os habitantes: " + maiorIdade;
        return maiorIdadeHabitantes;
    }    
    
    public String CalcularitemC(){
        int qtdHomens = 0;
        for(int i = 0; i < vetor_pessoas.length; i++){
            if(vetor_pessoas[i] != null && vetor_pessoas[i].getSexo() == 'M'){
                qtdHomens++;
            }
        }
        String percentualHomens = "O percentual de homens: " + ((qtdHomens * 100) /vetor_pessoas.length) + "%";
        return percentualHomens;
    }
    
    public String CalcularitemD(){
        int qtdMulheres = 0;
        for(int i = 0; i < vetor_pessoas.length; i++){
            if(vetor_pessoas[i] != null && vetor_pessoas[i].getSexo() == 'F' && vetor_pessoas[i].getIdade() >= 20 && vetor_pessoas[i].getIdade() <= 45 && vetor_pessoas[i].getCorDoOlhos() == 'V'){
                qtdMulheres++;
            }
        }
        String qtdMulheresItemD = "A quantidade de individuos do sexo feminino com idade entre 20 e 45 anos que tenham olhos verdes: " + qtdMulheres;
        return qtdMulheresItemD;        
    }
}

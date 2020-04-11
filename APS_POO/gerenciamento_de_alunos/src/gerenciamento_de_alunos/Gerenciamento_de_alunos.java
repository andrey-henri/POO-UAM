package gerenciamento_de_alunos;
import javax.swing.JOptionPane;

public class Gerenciamento_de_alunos {

    public static void main(String[] args) {
    
    String validaSairAplicacao = "N";
    cadastro_alunos alunos = new cadastro_alunos(); 
    cadastro_alunos vetor_alunos[] = new cadastro_alunos [99999999]; // Declaração do vetor que será criado baseado no RA do aluno
    double aluno_maior_media_final = 0.0;
    int alunoMaiorMedia = 0, qtdAlunosNaTurma = 0;
    String validaMateriaDigitada = null;
    
    Object[] opcoes = {"1 - Cadastrar dados de um Aluno",
                       "2 - Alterar a nota N1 ou N2 de um determinado aluno",
                       "3 - Listagem dos dados de um aluno por RA",
                       "4 - Listagem de todos os alunos",
                       "5 - Média da Turma",
                       "6 - Maior média Final",
                       "7 - Dados do aluno com maior Média Final",
                       "8 - Dados do aluno com maior N1 / N2",
                       "9 - Sair do programa"};
    
    JOptionPane.showMessageDialog(null,alunos.imprimirDadosDesenvolvedor());
    
    while(validaMateriaDigitada == null || validaMateriaDigitada.equals("") || validaMateriaDigitada.equals(" ")){
        validaMateriaDigitada = (JOptionPane.showInputDialog(null,"Por favor, digite o nome da disciplina que será utilizada durante a execução do programa!\n\n"," Ex: Calculo I "));  
        alunos.setNome_disciplina(validaMateriaDigitada);
        if (validaMateriaDigitada == null || validaMateriaDigitada.equals("") || validaMateriaDigitada.equals(" ")){
            JOptionPane.showMessageDialog(null,"Digite um nome valido, para o campo disciplina!","Disciplina",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    alunos.setAluno("Andrey");
    alunos.setNumero_ra(21163712);
    alunos.setNota_N1(8.0);
    alunos.setNota_N2(6.0);
    vetor_alunos[alunos.getNumero_ra()] = (new cadastro_alunos(alunos.getAluno(),alunos.getNome_disciplina(),alunos.getNumero_ra(),alunos.getNota_N1(),alunos.getNota_N2(),alunos.getMedia_final()));
    qtdAlunosNaTurma++;
    
    alunos.setAluno("William");
    alunos.setNumero_ra(28187717);
    alunos.setNota_N1(6.0);
    alunos.setNota_N2(9.0);
    vetor_alunos[alunos.getNumero_ra()] = (new cadastro_alunos(alunos.getAluno(),alunos.getNome_disciplina(),alunos.getNumero_ra(),alunos.getNota_N1(),alunos.getNota_N2(),alunos.getMedia_final()));
    qtdAlunosNaTurma++;
    
        
        do{
            try{
                /*int operacao = (Integer.parseInt(JOptionPane.showInputDialog("### MENU DE FUNCIONALIDADES DO SISTEMA ###\n\n"
                                                                                + "Digite 1 - Cadastrar dados de um Aluno\n"
                                                                                + "Digite 2 - Alterar a nota N1 ou N2 de um determinado aluno\n"
                                                                                + "Digite 3 - Listagem dos dados de um aluno por RA\n"
                                                                                + "Digite 4 - Listagem de todos os alunos\n"
                                                                                + "Digite 5 - média da Turma\n"
                                                                                + "Digite 6 - Maior média Final\n"
                                                                                + "Digite 7 - Dados do aluno com maior Média Final\n"
                                                                                + "Digite 8 - Dados do aluno com maior N1 / N2\n"
                                                                                + "Digite 9 - Sair do programa\n\n", " Ex: 4 ")));*/
              
                String menu = (String) JOptionPane.showInputDialog(null,"Selecione alguma das opções abaixo:\n\n","MENU DE FUNCIONALIDADES DO SISTEMA",JOptionPane.QUESTION_MESSAGE,null,opcoes,null);
                String opcaoMenu = menu.substring(0,1);
                int operacao = Integer.parseInt(opcaoMenu);
                switch(operacao){
                    case 1:
                        String validaNomeDigitado = null;
                        int validaNumeroRaDigitado = 00000000;
                        double validaValorNotaN1 = 0.0, validaValorNotaN2 = 0.0;
                        
                        if(qtdAlunosNaTurma < 50){
                            
                            while(validaNomeDigitado == null || validaNomeDigitado.equals("") || validaNomeDigitado.equals(" ")){
                                validaNomeDigitado = (JOptionPane.showInputDialog("Por favor, digite o nome do aluno a ser cadastrado: "," Ex: Maria "));
                                alunos.setAluno(validaNomeDigitado);
                                if (validaNomeDigitado == null || validaNomeDigitado.equals("") || validaNomeDigitado.equals(" ")){
                                    JOptionPane.showMessageDialog(null,"Digite um valor valido, para o campo nome do aluno!");
                                }
                            }
                            
                            while(validaNumeroRaDigitado <= 00000000 || validaNumeroRaDigitado > 99999999){
                                validaNumeroRaDigitado = (Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o numero de RA do aluno a ser cadastrado: "                                                                                      
                                + "\nObs: Digite apenas numeros, entre o intervalo de 00000001 á 99999999", "Ex: 21163712 ")));
                                alunos.setNumero_ra(validaNumeroRaDigitado); 
                                    if(validaNumeroRaDigitado <= 00000000 || validaNumeroRaDigitado > 99999999){
                                        JOptionPane.showMessageDialog(null,"Digite um valor valido, para o campo numero do RA!"
                                        + "\nObs: Digite apenas numeros, entre o intervalo de 00000001 á 99999999 " + "(" + validaNumeroRaDigitado + ")");
                                    }
                                for (cadastro_alunos vetor_aluno : vetor_alunos) {
                                    if (vetor_aluno != null) {
                                        if (vetor_aluno.getNumero_ra() == validaNumeroRaDigitado) {
                                            JOptionPane.showMessageDialog(null,"RA já cadastrado! " + "(" + validaNumeroRaDigitado + ")" + "\n Digite um numero ainda não cadastrado!","Cadastro de RA",JOptionPane.WARNING_MESSAGE);
                                            validaNumeroRaDigitado = 00000000;
                                        }
                                    }
                                }
                            }
                            
                            //alunos.setNome_disciplina(JOptionPane.showInputDialog(null,"Por favor, digite o nome da disciplina desse aluno: "));
                            
                            while(validaValorNotaN1 <= 0.0 || validaValorNotaN1 > 10.0){
                                validaValorNotaN1 = (Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de sua nota da prova N1: "                                                                           
                                + "\nObs: Digite penas numeros, entre o intervalo de 0.1 á 10.0", " Ex: 7.55 ")));
                                alunos.setNota_N1(validaValorNotaN1);
                                if(validaValorNotaN1 <= 0.0 || validaValorNotaN1 > 10.0){
                                    JOptionPane.showMessageDialog(null,"Digite um valor valido, para o campo nota da prova N1!"
                                    + "\nObs: Digite penas numeros, entre o intervalo de 0.1 á 10.0");                                    
                                }
                            }
                            while(validaValorNotaN2 <= 0.0 || validaValorNotaN2 > 10.0){
                                validaValorNotaN2 = (Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de sua nota da prova N2: "
                                                                                                       + "\nObs: Digite penas numeros, entre o intervalo de 0.1 á 10.0", "Ex: 8.59 ")));                            
                            alunos.setNota_N2(validaValorNotaN2);
                                if(validaValorNotaN2 <= 0.0 || validaValorNotaN2 > 10.0){
                                    JOptionPane.showMessageDialog(null,"Digite um valor valido, para o campo nota da prova N2!"
                                                                     + "\nObs: Digite penas numeros, entre o intervalo de 0.1 á 10.0");                                     
                                }
                            }                           
                            vetor_alunos[alunos.getNumero_ra()] = (new cadastro_alunos(alunos.getAluno(),alunos.getNome_disciplina(),alunos.getNumero_ra(),alunos.getNota_N1(),alunos.getNota_N2(),alunos.getMedia_final()));
                            qtdAlunosNaTurma++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Quantidade maxima de alunos por disciplina, já atingido: " + qtdAlunosNaTurma); 
                        }
                    break;            

                    case 2:

                        int alteracao_nota = (Integer.parseInt(JOptionPane.showInputDialog(" ALTERAÇÃO DE NOTAS \n\n"
                                                                                              + "Digite 0 - Alteração notas da N1 e N2\n"
                                                                                              + "Digite 1 - Alterar apenas a nota da N1\n"
                                                                                              + "Digite 2 - Alterar apenas a nota da N2\n"
                                                                                              + "Digite 3 - Para cancelar a operação\n\n", "3")));
                        switch(alteracao_nota){
                            case 0:           
                                alunos.setNumero_ra(Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o numero de RA do aluno que deseja alterar a nota(s): ", "Ex: 21163712 ")));
                                alunos.setNota_N1(Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor para a nota da prova N1: "," Ex: 7.5 ")));
                                alunos.setNota_N2(Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor para a nota da prova N2: "," Ex: 6.7 ")));
                                vetor_alunos[alunos.getNumero_ra()].setNota_N1(alunos.getNota_N1());
                                vetor_alunos[alunos.getNumero_ra()].setNota_N2(alunos.getNota_N2());
                                vetor_alunos[alunos.getNumero_ra()].setMedia_final((alunos.getNota_N1() * 0.4) + (alunos.getNota_N2() * 0.6));
                            break;

                            case 1:
                                alunos.setNumero_ra(Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o numero de RA do aluno que deseja alterar a nota(s): ","Ex: 21163712 ")));
                                alunos.setNota_N1(Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor para a nota da prova N1: "," Ex: 7.5 ")));
                                vetor_alunos[alunos.getNumero_ra()].setNota_N1(alunos.getNota_N1()); 
                                vetor_alunos[alunos.getNumero_ra()].setMedia_final((alunos.getNota_N1() * 0.4) + (alunos.getNota_N2() * 0.6));
                            break;

                            case 2:
                                alunos.setNumero_ra(Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o numero de RA do aluno que deseja alterar a nota(s): ","Ex: 21163712 ")));
                                alunos.setNota_N2(Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor para a nota da prova N2: "," Ex: 6.7 ")));
                                vetor_alunos[alunos.getNumero_ra()].setNota_N2(alunos.getNota_N2());  
                                vetor_alunos[alunos.getNumero_ra()].setMedia_final((alunos.getNota_N1() * 0.4) + (alunos.getNota_N2() * 0.6));
                            break;

                            case 3:
                                 //Volta para o menu de inicio apenas
                            break;       

                            default: JOptionPane.showMessageDialog(null,"Opção invalida, tente novamente ou digite '3' para voltar ao menu principal!"); 
                        }

                    break;

                    case 3:
                        int primeiraVezNaoEncontrado = 0;
                        validaNumeroRaDigitado = (Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o numero de RA do aluno que deseja imprimir os dados: ","Ex: 21163712 ")));
                        alunos.setNumero_ra(validaNumeroRaDigitado);

                        if(validaNumeroRaDigitado <= 00000000 || validaNumeroRaDigitado > 99999999){
                            JOptionPane.showMessageDialog(null,"Digite um valor valido, para o campo numero do RA!"
                            + "\nObs: Digite apenas numeros, entre o intervalo de 00000001 á 99999999 " + "(" + validaNumeroRaDigitado + ")");
                            primeiraVezNaoEncontrado++;
                        }
                        for (cadastro_alunos vetor_aluno : vetor_alunos) {
                            if (vetor_aluno != null) {
                                if (vetor_aluno.getNumero_ra() == validaNumeroRaDigitado) {
                                    JOptionPane.showMessageDialog(null,vetor_alunos[alunos.getNumero_ra()].imprimirDados());
                                    primeiraVezNaoEncontrado++;
                                }
                            }                       
                        }
                        if(primeiraVezNaoEncontrado == 0){
                           JOptionPane.showMessageDialog(null,"Numero de RA digitado não foi encontrado \nTente novamente! " + "(" + validaNumeroRaDigitado + ")","Busca por RA",JOptionPane.WARNING_MESSAGE);
                        }
                    break; 

                    case 4: 
                        for (cadastro_alunos vetor_aluno : vetor_alunos) {
                            if (vetor_aluno != null) {
                                JOptionPane.showMessageDialog(null, vetor_aluno.imprimirDados());
                            }
                        }
                    break;  

                    case 5:
                        double media_turma = 0.0;
                        int qtdalunos = 0;
                        for (cadastro_alunos vetor_aluno : vetor_alunos) {
                            if (vetor_aluno != null) {
                                qtdalunos++;
                                media_turma += (vetor_aluno.getMedia_final());
                            }
                        }
                        JOptionPane.showMessageDialog(null,"Média da turma: " + (media_turma/qtdalunos));
                    break;  

                    case 6:
                        for (cadastro_alunos vetor_aluno : vetor_alunos) {
                            if (vetor_aluno != null) {
                                while (aluno_maior_media_final < vetor_aluno.getMedia_final()) {
                                    aluno_maior_media_final = vetor_aluno.getMedia_final();
                                }
                            }
                        }
                        JOptionPane.showMessageDialog(null,"Maior média final da sala: " + aluno_maior_media_final);
                        aluno_maior_media_final = 0.0; // Zerando variavel para que ela possa ser utilizada em outro case
                    break;    

                    case 7:
                        for (cadastro_alunos vetor_aluno : vetor_alunos) {
                            if (vetor_aluno != null) {
                                while (aluno_maior_media_final < vetor_aluno.getMedia_final()) {
                                    aluno_maior_media_final = vetor_aluno.getMedia_final();
                                    alunoMaiorMedia = vetor_aluno.getNumero_ra();
                                }
                            }
                        }
                        JOptionPane.showMessageDialog(null,"Aluno com a maior média final da sala: " + vetor_alunos[alunoMaiorMedia].imprimirAlunoMaiorMedia());
                        aluno_maior_media_final = 0.0; // Zerando variavel para que ela possa ser utilizada em outro case
                        alunoMaiorMedia = 0; // Zerando variavel para que ela possa ser utilizada em outro case
                    break;    

                    case 8:
                        int maiorMediaN1_N2 = 0;
                        while(maiorMediaN1_N2 != 1 && maiorMediaN1_N2 != 2 && maiorMediaN1_N2 !=3){
                            maiorMediaN1_N2 = (Integer.parseInt(JOptionPane.showInputDialog(" ALUNO COM MAIOR NOTA N1 / N2 \n\n"
                                                                                          + "Digite 1 - Para saber o aluno com a maior nota N1\n"
                                                                                          + "Digite 2 - Para saber o aluno com a maior nota N2\n"
                                                                                          + "Digite 3 - Para cancelar a operação\n\n", "3")));
                            double aluno_maior_nota_N1 = 0, aluno_maior_nota_N2 = 0;

                            if(maiorMediaN1_N2 == 1){
                                for (cadastro_alunos vetor_aluno : vetor_alunos) {
                                    if (vetor_aluno != null) {
                                        while (aluno_maior_nota_N1 < vetor_aluno.getNota_N1()) {
                                            aluno_maior_nota_N1 = vetor_aluno.getNota_N1();
                                            alunoMaiorMedia = vetor_aluno.getNumero_ra();
                                        }
                                    }  
                                }
                                JOptionPane.showMessageDialog(null,"Aluno com a maior nota N1 da sala: " + vetor_alunos[alunoMaiorMedia].imprimirAlunoMaiorMediaN1());
                                alunoMaiorMedia = 0; // Zerando variavel para que ela possa ser utilizada em outro case
                            }
                            else if(maiorMediaN1_N2 == 2){
                                for (cadastro_alunos vetor_aluno : vetor_alunos) {
                                    if (vetor_aluno != null) {
                                        while (aluno_maior_nota_N2 < vetor_aluno.getNota_N2()) {
                                            aluno_maior_nota_N2 = vetor_aluno.getNota_N2();
                                            alunoMaiorMedia = vetor_aluno.getNumero_ra();
                                        }
                                    }
                                }
                                JOptionPane.showMessageDialog(null,"Aluno com a maior nota N2 da sala: " + vetor_alunos[alunoMaiorMedia].imprimirAlunoMaiorMediaN2());
                                alunoMaiorMedia = 0; // Zerando variavel para que ela possa ser utilizada em outro case
                            }
                            else if(maiorMediaN1_N2 == 3){
                               //Volta para o menu Principal 
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Opção invalida, Tente novamente! " + "(" + maiorMediaN1_N2 + ")");
                            } 
                        }
                    break;  

                    case 9:
                        JOptionPane.showMessageDialog(null,"A aplicação será encerrada!");
                        validaSairAplicacao = "S";
                    break;  

                    default: JOptionPane.showMessageDialog(null,"Opção invalida, tente novamente ou digite '9' para Encerrar a aplicação!"); 
                }
            }
            catch (NullPointerException erro) {
                JOptionPane.showMessageDialog(null,"Não foi digitado um valor numerico (Ex: 5)"
                + "\nOperação não pode ser concluida, tente novamente!\n","Erro na digitação",JOptionPane.ERROR_MESSAGE); // Caso não seja digitado um valor numerico
            }
            catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null,"Não foi digitado um valor numerico no formato correto (Ex: 7)"
                + "\nOperação não pode ser concluida, tente novamente!\n","Erro na digitação",JOptionPane.ERROR_MESSAGE); // Caso não seja digitado um valor numerico
            }                 
        }while("n".equals(validaSairAplicacao) || "N".equals(validaSairAplicacao));
        
        
        
        System.exit(0); // Encerra aplicação
    }  
}

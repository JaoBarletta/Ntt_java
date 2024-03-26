
import java.util.ArrayList;

import java.util.Scanner;

public class Main {

     public static ArrayList cadastroAtor(){
         Scanner ler = new Scanner(System.in);

             while(true){
                 ArrayList<Atores> atores = new ArrayList<>();
                 System.out.println("Informe o nome do ator ");
                 String nomeAtor = ler.next();
                 System.out.println("Informe a idade ");
                 int idadeAtor = ler.nextInt();
                 System.out.println("Informe a nacionalidade");
                 String nacionalidadeAtor = ler.next();
                 System.out.println("Informe o personagem que ele irá fazer");
                 String personagem = ler.next();
                 System.out.println("deseja adicionar mais um ator ? [1] - Sim\n[2]-Não");
                 Atores a = new Atores(nomeAtor,idadeAtor,nacionalidadeAtor,personagem);
                 atores.add(a);
                 int interacao2 = ler.nextInt();

                 if (interacao2 == 2){
                     return  atores;
                 }
                 else if (interacao2 ==1 ) {
                     System.out.println("********************************************");
                 }
                 else {
                     System.out.println("opção invalida");
                 }
             }



    }


    public static ArrayList cadastroDiretor(){
        Scanner ler = new Scanner(System.in);


        while(true){
            ArrayList<Diretor> diretors = new ArrayList<>();
            System.out.println("********************************************");
            System.out.println("Informe o nome do Diretor");
            String nomeDiretor = ler.next();
            System.out.println("Informe a idade ");
            int idadeDiretor = ler.nextInt();
            System.out.println("Informe a nacionalidade");
            String nacionalidadeDiretor = ler.next();
            System.out.println("Principal filme desse Diretor ");
            String principalFilme  = ler.next();
            Diretor d = new Diretor(nomeDiretor,idadeDiretor,nacionalidadeDiretor,principalFilme);
            diretors.add(d);
            System.out.println("deseja adicionar mais um ator ? [1] - Sim\n[2]-Não");
            int interacao2 = ler.nextInt();

            if (interacao2 == 2){

                return diretors;
            }

            else if (interacao2 ==1 ) {
                System.out.println("********************************************");
            }
            else {
                System.out.println("opção invalida");
            }
        }


    }


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<ArrayList>diretores = new ArrayList<>();
        ArrayList<ArrayList>atores = new ArrayList<>();
        ArrayList<Filme>filmes = new ArrayList<>();

        Mainloop:{
            while(true){
                System.out.println("********************************************");
                System.out.println("Seja bem vindo ao cadastro de filmes \nPor favor digite o que você deseja fazer\n[1]- Cadastrar Filme\n[2]- Exibir filmes cadastrados\n[3]- Sair da aplicação");
                System.out.println("********************************************");
                int interacao = ler.nextInt();
                if (interacao == 1){
                    cadastroloop:{
                        while(true){

                            System.out.println("********************************************");
                            diretores.add(cadastroDiretor());
                            atores.add(cadastroAtor());
                            System.out.println("Digite o nome do filme ");
                            String nomeFilme = ler.next();
                            System.out.println("Qual o local de gravação ? ");
                            String enderecoGravacao = ler.next();
                            System.out.println("Qual foi o tempo de filmagem 'dias-horas'");
                            String tempoFilmagem = ler.next();
                            System.out.println("Data de inicio da gravação 'dd/MM/yyyy'");
                            String dataInicio = ler.next();
                            System.out.println("Data de finalização da filamgem 'dd/MM/yyyy'");
                            String dataFinal = ler.next();
                            Filme filme = new Filme(nomeFilme,enderecoGravacao,tempoFilmagem,dataInicio,dataFinal,diretores,atores);
                            filmes.add(filme);
                            System.out.println("Deseja cadastrar mais filmes ? [1]-Sim\n[2]-Não");
                            int interacao2 = ler.nextInt();
                            if (interacao2 == 1){
                                System.out.println("*****************************************");
                            }
                            else if(interacao2 == 2){
                                break cadastroloop;
                            }
                            else{
                                System.out.println("Não consegui entender");
                                System.out.println("*****************************************");
                            }

                        }

                    }
                } else if (interacao == 2) {
                    System.out.println("Filmes cadastrados: ");
                    for(Filme filme : filmes){
                        System.out.println("Nome do filme: "+ filme.getNome());
                        System.out.println("Local da gravação: "+filme.getEnderecoGravacao());
                        System.out.println("Tempo de filmagem: "+ filme.getTempoFilmagem());
                        System.out.println("Data de início da gravação: "+filme.getGravacaoFilmeInicio());
                        System.out.println("Data de finalização da filmagem: "+filme.getGravacaoFilmeFinal());
                        System.out.println("Diretores do filme ");
                        for(ArrayList<Diretor>listaDiretores : filme.getDiretores().toArray(new ArrayList[0])){
                            for (Diretor diretor : listaDiretores){
                                System.out.println("Nome: "+diretor.getNome()+"\nIdade : "+diretor.getIdade()+"Nacionalidade: "+diretor.getNacionalidade()+"\nPrincipal Filme : "+diretor.getPricipalFilme());
                            }
                        }
                        System.out.println("Atores do filme : ");
                        for (ArrayList<Atores> listaAtores : filme.getAtores()){
                            for(Atores ator : listaAtores){
                                System.out.println("Nome: "+ator.getNome()+"\nIdade: "+ator.getIdade()+"\nNacionalidade : "+ator.getNacionalidade()+"\nPersonagem: "+ator.getPersonagem());
                                System.out.println("**************************************");
                            }
                        }
                    }

                } else if (interacao == 3) {
                    System.out.println("Obrigado por usar nosso sistema !!!");
                    break Mainloop;

                }else {
                    System.out.println("Não consegui identificar sua ação ");
                    System.out.println("*********************************");
                }


            }
        }
    }




}




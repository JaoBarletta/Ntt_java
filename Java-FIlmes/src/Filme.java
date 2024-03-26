import java.util.ArrayList;

public class Filme {
    private String nomeFilme;
    private String enderecoGravacao;

    private ArrayList<ArrayList> diretores = new ArrayList<>();
    
    private ArrayList<ArrayList> atores = new ArrayList<>();
    private String tempoFilmagem;
    private String gravacaoFilmeInicio ;
    private String gravacaoFilmeFinal ;

    public Filme(String nomeFilme,String enderecoGravacao, String tempoFilmagem, String gravacaoFilmeInicio,String gravacaoFilmeFinal,ArrayList diretores,ArrayList atores){
        this.setNome(nomeFilme);
        this.setEnderecoGravacao(enderecoGravacao);
        this.setTempoFilmagem(tempoFilmagem);
        this.setGravacaoFilmeFinal(gravacaoFilmeFinal);
        this.setGravacaoFilmeInicio(gravacaoFilmeInicio);

        }


    public String getNome(){
        return nomeFilme;}
    public String getEnderecoGravacao(){
        return enderecoGravacao;}
    public String getTempoFilmagem(){
        return tempoFilmagem;}
    public String getGravacaoFilmeInicio(){
        return gravacaoFilmeInicio;}
    public String getGravacaoFilmeFinal(){
        return gravacaoFilmeFinal;}

    public void setNome(String nome){
         nomeFilme = nome ;}
    public void setEnderecoGravacao(String endereco){
        enderecoGravacao = endereco;}
    public void setTempoFilmagem(String tempo){
         tempoFilmagem = tempo;}
    public void setGravacaoFilmeInicio(String GravacaoInicio){
         gravacaoFilmeInicio = GravacaoInicio;}
    public void setGravacaoFilmeFinal(String GravacaoFinal){
        gravacaoFilmeFinal = GravacaoFinal;}

    public ArrayList<ArrayList> getDiretores() {
        return diretores;
    }

    public void setDiretores(ArrayList<ArrayList> diretores) {
        diretores.add(diretores);
    }

    public ArrayList<ArrayList> getAtores() {
        return atores;
    }

    public void setAtores(ArrayList<ArrayList> atores) {
        atores.add(atores);
    }

}

public class Diretor extends Pessoa {

    private String pricipalFilme;


    Diretor(String nome,int idade ,String nacionalidade,String principalFilme){
        super(nome,idade,nacionalidade);
        this.pricipalFilme = principalFilme;
    }

    public String getPricipalFilme() {
        return pricipalFilme;
    }

    public void setPricipalFilme(String pricipalFilme) {
        this.pricipalFilme = pricipalFilme;
    }
}

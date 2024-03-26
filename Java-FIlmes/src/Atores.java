public class Atores extends Pessoa {
    private String personagem;

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getPersonagem() {
        return personagem;
    }

    Atores(String nome, int idade , String nacionalidade, String personagem){
        super(nome,idade,nacionalidade);
        this.setPersonagem(personagem);
    }
}

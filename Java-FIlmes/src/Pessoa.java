public class Pessoa {
    private String nome;
    private int idade;
    private String nacionalidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    Pessoa(String nome, int idade , String nacionalidade){
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;

    }
}


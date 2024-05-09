public class Animais {
    public static String nome;
    public int idade;
    public String habitat;

    public Animais(String habitat, int idade, String nome) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
    }





    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}

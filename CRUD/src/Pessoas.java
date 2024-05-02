public class Pessoas {
    private String nome;
    private String altura;
    private String peso;

    public Pessoas(String nome, String altura, String peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Altura: " + altura + ", Peso: " + peso;
    }

}

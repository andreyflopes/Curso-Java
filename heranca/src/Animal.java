public class Animal extends Animais {
    public String caracteristica;
    public String descricao;

    // Construtor para quando caracteristica e descricao são fornecidos
    public Animal(String nome, int idade, String habitat, String caracteristica, String descricao) {
        super(habitat, idade, nome);
        this.caracteristica = caracteristica;
        this.descricao = descricao;
    }


}
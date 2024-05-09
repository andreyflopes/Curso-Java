public class Elefante extends Animal{
    private String caracteristica;
    private String som;

    public Elefante(String nome, int idade, String habitat) {
        super(nome, idade, habitat);
        this.caracteristica = "Tromba";
        this.som = "Som de trombeta";
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCaracterística: " + caracteristica + "\nSom: " + som;
    }
}

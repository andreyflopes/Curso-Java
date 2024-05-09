//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Animal a = new Animal("gato", 4, "domestico", "miado", "miau");
        System.out.println("Nome: " + a.nome);
        System.out.println("Idade: " + a.idade);
        System.out.println("Habitat: " + a.habitat);
        System.out.println("Caracteristica: "+ a.caracteristica + "("+ a.descricao+")"  );



    }
}
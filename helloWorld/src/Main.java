//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numeroInteiro = 22;
        float numeroReal = 3.14456789f; // use o "f" sempre para indicar que é uma variavel float
        char letra = 'A';
        boolean terminou = false;

        // use "sout", atalho para escrever System.out.println();
        System.out.println("Inteiro: " + numeroInteiro);
        System.out.println("Numero Real: " + numeroReal);
        System.out.println("Letra: " + letra);
        System.out.println("Lógico: " + terminou);
        System.out.println("▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖");

        System.out.printf("O valor do float: %.2f\n", numeroReal);

        System.out.println("▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖▖");
        String nome = "Java";
        float media = 8.9f;
        System.out.printf("A nota de %s é %.2f\n", nome, media);
        System.out.format("A nota de %s é %.2f\n", nome, media);



    }
}

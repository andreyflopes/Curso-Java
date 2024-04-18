//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;

public class Main {
//    static void escrever( String t){
//        JOptionPane.showMessageDialog(null, t);
//    }
//
//    static float media(int a, int b){
//        float soma = (float) a+b;
//        return soma/2;
//    }
//
//    public static void main(String[] args) {
//        escrever("Oi gente boa");
//        System.out.println(media(3, 8));
//    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Andrey", 22);

        System.out.println("O(A) " + p.getNome() + " tem " + p.getIdade() + " Anos");

   }
}

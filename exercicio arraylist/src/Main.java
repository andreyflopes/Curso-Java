import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public static void main(String[] args) {
            for(int i = 0; i<3; i++){
                String nome = JOptionPane.showInputDialog("Informe o nome: ");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade de "+nome+": "));
                Pessoa p = new Pessoa(nome, idade);

                pessoas.add(p);
            }
        System.out.println(pessoas);
        }
    }

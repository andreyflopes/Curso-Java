
import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Nome: ");
//        String nome = teclado.nextLine();
//
//        System.out.print("Nota: ");
//        float nota = teclado.nextFloat();
//
//        System.out.printf("A nota do aluno %s foi %.1f", nome, nota);
//===============================================================================================
//        Scanner teclado = new Scanner(System.in);
//
//        System.out.print("Qual o seu nome?: ");
//        String nome = teclado.nextLine();
//
//        System.out.print("Primeira nota: ");
//        float nota1 = teclado.nextFloat();
//
//        System.out.print("Segunda nota: ");
//        float nota2 = teclado.nextFloat();
//
//        System.out.print("Terceira nota: ");
//        float nota3 = teclado.nextFloat();
//
//
//        float media = ( nota1 + nota2 + nota3) / 3;
//
//        if(media >= 7){
//            System.out.println("PASSOUUU");
//        }else{
//            System.out.println("REPROVOOUUU");
//        }
//
//        System.out.printf("\n%s, sua media é de %.2f", nome, media);

//===============================================================================================
//        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Sua idade"));
//        JOptionPane.showMessageDialog(null, idade);
//        System.out.println(JOptionPane.showConfirmDialog(null, "Tem certeza?"));
//===============================================================================================


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //                          EXERCICIOS IF/ELSE

//Escreva um programa que determine se um número é positivo, negativo ou zero.
//        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
//
//        if(numero < 0){
//            JOptionPane.showMessageDialog(null, "O numero digitado é negativo!!");
//        }else if(numero == 0){
//            JOptionPane.showMessageDialog(null, "O numero digitado é zero!!");no
//        }else{
//            JOptionPane.showMessageDialog(null, "O numero digitado é positivo!!");
//        }
//     =========================================================================================
//        Crie um programa que verifique se um ano é bissexto.

        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um ano para verificar se é bissexto"));

        if(ano % 400 == 0){
            JOptionPane.showMessageDialog(null, "O ano de " + ano + " é bissexto");
        }else{
            JOptionPane.showMessageDialog(null, "O ano de " + ano + " não é bissexto");
        }













    }
}
import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String nome, nomeUsuario;
//        nome= JOptionPane.showInputDialog("Nome: ");
//        nomeUsuario=JOptionPane.showInputDialog("Nome de Usuario: ");
//
//
//        if(nome.equals(nomeUsuario)){
//            System.out.println("iguais");
//        }else{
//            System.out.println("Diferentes");

        int numero;
        int maior=0;
        int cont;
        Scanner teclado = new Scanner(System.in);

        for(int i=1; i<10; i++){
            System.out.printf("\nDigite 10 numeros(%d): ", i);
            numero = Integer.parseInt(teclado.nextLine());

            if(numero > maior){
                maior = numero;
            }

        }

        System.out.printf("O maoir numero digitado é: %d", maior);

        }
    }


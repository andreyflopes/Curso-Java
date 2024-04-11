import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

//=======================    ATIVIDADES=======================================================
//        int numero;
//        int maior=0;
//
//        Scanner teclado = new Scanner(System.in);
//
//        for(int i=1; i<10; i++){
//            System.out.printf("\nDigite 10 numeros(%d de 10): ", i);
//            numero = Integer.parseInt(teclado.nextLine());
//            System.out.print("=======================================");
//
//            if(numero > maior){
//                maior = numero;
//            }
//
//        }
//        System.out.print("=======================================");
//        System.out.printf("O maoir numero digitado é: %d", maior);
//        System.out.print("=======================================");
        //==============================================================================




//        int[] idades = new int[5];
//
//        for(int i=0; i<5; i++){
//            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + (i+1) + "a idade:"));
//        }
//
//        String texto = "";
//        for(int idade : idades){
//            texto += "Idade: " + idade + ";\n";
//        }
//        JOptionPane.showMessageDialog(null, texto);
//        System.out.println(texto);




//        int[] idades = {14,12,25,44,11,8};
//        Arrays.sort(idades);
//        for (int n : idades){
//            System.out.print(n + " ");
//        }
//        System.out.println("");
//        int i= Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
//        int pos = Arrays.binarySearch(idades,i);
//        System.out.println("Valor na encontrado na posição: "+pos);


        ArrayList<String> dinos = new ArrayList<String>();

        dinos.add("Angaturama");
        dinos.add("Uberabatitan");
        dinos.add("Irritator");
        dinos.add("Oxalaia Quilombensis");

        System.out.println("Arraylist original: " + dinos);

        String dino = dinos.get(1);
        System.out.println("Dino selecionado: " + dino);

        dinos.set(1, "Santanarraptor");
        System.out.println("Modificado: " + dinos);

        dinos.remove(2);
        System.out.println("Removeu o 2: " + dinos);

        int tamanho = dinos.size();
        System.out.println("Tamanho: " + tamanho);

        System.out.println("--= Percorrendo com for =--");
        for (int i= 0; i<dinos.size(); i++){
            System.out.println("Dino: " + dinos.get(i));
        }

        System.out.println("--= Percorrendo com 'forEach' =--");
        for (String d : dinos){
            System.out.println("Dino: " + d);
        }

        Collections.sort(dinos);
        System.out.println("Organizado: " + dinos);

        int indice = dinos.indexOf("Santanarraptor");
        System.out.println("indexOf: " + indice);





    }
    }


import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Float> salarios = new ArrayList<>();

        float salarioInfo;

       do{
           salarioInfo=Float.parseFloat(JOptionPane.showInputDialog("Informe o salario: "));

            salarios.add(salarioInfo);

       }while(salarioInfo!= 0);

        System.out.println(salarios);


        for(float salario : salarios){
            if(salario<2500){

                salario= salario*1,10;
            }
        }





    }
}
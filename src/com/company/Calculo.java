package com.company;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculo {
    public static void main(String[] args ){
        Scanner entrada = new Scanner(System.in);

        System.out.println("elige una opcion \n1: cuadrado \n2: rectangulo \n3: triangulo \n4: circulo ");

        int numero = entrada.nextInt();

        switch (numero){
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("ingrese un lado"));
                System.out.println("el area del cuadrado es : "+ Math.pow(lado,2));
                break;
            case 2:
                int lado2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un la altura"));
                int base = Integer.parseInt(JOptionPane.showInputDialog("ingrese un una base"));
                System.out.println("el area del rectangulo es : "+ base*lado2);
                break;
            case 3:
                int lado3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un la altura"));
                int base2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un una base"));
                System.out.println("el area del triangulo es : "+ (base2*lado3)/2);
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("ingrese un el radio"));
                System.out.print("el area del circlo es: ");
                System.out.printf("%1.2f",Math.PI*(Math.pow(radio,2)));
                break;
            default:
                System.out.println("no existe esta opcion");
        }




    }
}

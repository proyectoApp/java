package com.company;
import javax.swing.*;

public class Entrada_ejemplo2 {
        public static void main(String[] args) {

            String nombre = JOptionPane.showInputDialog("escribe tu nombre");
            String edad = JOptionPane.showInputDialog("ingresa tu edad");
            int Edad = Integer.parseInt(edad);


            System.out.println("tu nombre es : " + nombre + " y su edad es : " + edad + " dentro de un año su edad sera : " + (Edad+1));


    }
}

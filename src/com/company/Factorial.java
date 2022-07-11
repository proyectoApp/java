package com.company;

import javax.swing.*;


public class Factorial {
    public static void main(String[] args){

        int entrada = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        long resultado = 1l;

        for(int i = entrada; i > 0;i-- ){
            resultado = resultado*i;

        }

        System.out.println("el resultado es" + resultado);


    }
}

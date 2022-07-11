package com.company;
import javax.swing.JOptionPane;



public class Entrada_numeros {
    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog("INGRESE UN VALOR DOUBLE");

        double s = Double. parseDouble(x);

        System.out.println(Math.sqrt(s));
        System.out.printf("%1.2f" ,Math.sqrt(s));

    }
}

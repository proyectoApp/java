package com.company;
import javax.swing.JOptionPane;

public class Peso_persona {
    public static void main(String[] args){
        String genero = "";
        int altura;
        do{
            genero = JOptionPane.showInputDialog("introduce tu genero (H/M)");
            if(genero != "H" || genero != "M" ){
                genero = JOptionPane.showInputDialog("lo que acaba de introducir no es un genero por fabor marque (H = hombre/M = mujer)");
            }

        }while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

        if (genero.equalsIgnoreCase("H")){
            altura = Integer.parseInt(JOptionPane.showInputDialog("igrese su altura en cm "));
            System.out.println("su peso ideal es " + (altura - 110));
        }else if(genero.equalsIgnoreCase("M")){
            altura = Integer.parseInt(JOptionPane.showInputDialog("igrese su altura en cm "));
            System.out.println("su peso ideal es " + (altura - 120));
        }
    }

}

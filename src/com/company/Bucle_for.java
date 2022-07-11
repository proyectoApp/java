package com.company;

import java.lang.*;
import javax.swing.JOptionPane;

public class Bucle_for {
    public static void main(String[] args){
    int arroba = 0;
    boolean punto = false;

    String mail = JOptionPane.showInputDialog("ingresa tu correo");
    for (int i=0; i < mail.length();i++){
        if(mail.charAt(i) == '@'){
            arroba++;
        }
        if(mail.charAt(i) == '.'){
            punto = true ;
        }

    }
        if (arroba == 1 && punto == true){
            System.out.println("el mail es correcto");
        }else if(arroba >= 2 && punto == false){
            System.out.println("el mail es incorrecto");
        }else{
            System.out.println("el mail es incorrecto");
        }
    }

}

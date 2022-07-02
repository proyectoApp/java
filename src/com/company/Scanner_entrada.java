package com.company;

import java.util.*;


public class Scanner_entrada {

    public static void main( String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingresa tu nombre: ");
        String dato = entrada.nextLine();
        System.out.println(dato);
        System.out.println("ingresa tu edad");
        int edad = entrada.nextInt();
        System.out.println(edad);

        System.out.println("su nombre es : " + dato + " y su edad es : " + edad );
    }
}

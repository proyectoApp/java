package com.company;

public class Manipula_cadenas {

    public static void main( String[] args){
        String nombre = "yolanda";
        System.out.println("mi nombre es " + nombre);
        System.out.println("mi nombre tiene " + nombre.length() + " letras");
        System.out.println("la primera letra de mi nombre es " + nombre.charAt(0));
        int ultima_letra;

        ultima_letra = nombre.length();

        System.out.println("la ultima letra de mi nombre es " + nombre.charAt(ultima_letra-1));
    }
}

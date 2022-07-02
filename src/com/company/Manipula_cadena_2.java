package com.company;

public class Manipula_cadena_2 {
    public static void main(String[] args){

        String frace = "hoy es un dia perfecto";
        int totalFrace = frace.length();

        String fraceSubString = frace.substring(4,totalFrace);
        System.out.println(frace.contains("hoy"));
        System.out.println(fraceSubString);

    }
}

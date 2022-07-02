package com.company;

public class Calculos_con_Math {

    public static void main(String[] args) {

        double base = 3;
        double exponente = 4;

        int total = (int)Math.pow(base,exponente);

        System.out.println("el resultado de "+base+ " elevado a "+ exponente+ " es "+ total);

    }
}

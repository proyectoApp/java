package com.company;

import java.util.*;
import javax.swing.*;

public class Adivina_numero {
    public static void main(String[]  args){
        int aleatorio = (int)(Math.random()*(10-120)+120);
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int intentos =0;

        do {
                System.out.println("introduce unb numero");
                numero = entrada.nextInt();
                if(aleatorio < numero){
                    System.out.println("un numero mas bajo");
                }else if(aleatorio > numero){
                    System.out.println("un numero mas alto");
                }
                intentos++;
        }while (numero!=aleatorio);

        System.out.println("correcto");
        System.out.println("el numero de intentos que usted ha echo es " + intentos);
        }
}

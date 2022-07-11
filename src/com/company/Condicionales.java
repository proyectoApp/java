package com.company;
import java.util.*;

public class Condicionales {
    public static void main(String[] args){
        Scanner dato = new Scanner(System.in);

        System.out.println("ingrese su edad ");

        int edad = dato.nextInt();

        if(edad >= 18){
            System.out.println("usted es mayor de edad");
        }else if(edad < 18){
            System.out.println("usted es menor de edad");
        }else{
            System.out.println("CUIDATE");
        }

    }
}

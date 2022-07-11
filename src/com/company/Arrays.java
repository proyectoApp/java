package com.company;

public class Arrays {
    public static void main(String[] args){

/*        int[] nuevo = new int[10];

        nuevo[0] =23;
        nuevo[1] =24;
        nuevo[2] =25;
        nuevo[3] =26;
        nuevo[4] =27;
        nuevo[5] =28;
        nuevo[6] =29;
        nuevo[7] =30;
        nuevo[8] =31;
        nuevo[9] =32;
*/
        int [] nuevo = {23,24,25,26,27,28,29,30,31,32};


       for (int i =0; i < nuevo.length;i++){
           if (nuevo[i] == 25){
               System.out.println("el numero es: " + nuevo[3]);
           }else {
               System.out.println(nuevo[i]);
           }



       }
    }
}

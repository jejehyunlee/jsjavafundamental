package com.juaracoding.jsjavafundamental.master.daydelapan;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
@Author JEJE a.k.a Jefri S
Java Developer
Createrd On 1/12/2023 18:53
@Last Modified 1/12/2023 18:53
Version 1.0
*/

import java.util.Scanner;

public class CobaArray {
    public static void main(String[] args) {
        int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};


        // looping standard
        System.out.println(arrayAngka[3]);
        for(int i = 0; i < 10; i++){
            System.out.println("index ke-"+i+" adalah = " + arrayAngka[i]);
        }

        // looping dengan properti array
        System.out.println("looping dengan properti length");
        for(int i = 0; i < arrayAngka.length; i++){
            System.out.println("index ke-"+i+" adalah = " + arrayAngka[i]);
            System.out.println(arrayAngka.length);

        }

        // looping khususon untuk collection <- array
        System.out.println("looping for each");
        for( int angka : arrayAngka){
            System.out.println("angka pada looping ini = " + angka);
        }

        String [][]cars = {
                {"Volvo", "BMW", "Ford", "Mazda"},
                {"HONDA","TOYOTA","DAIHATSU"}
        };


        for (int i=0;i<cars.length;i++)
        {
            for(int j=0;j<cars[i].length;j++)
            {
//                System.out.print("ISI DARI INDEX KE ["+i+"]["+j+"] ADALAH "+cars[i][j]+" ,");
                System.out.print(cars[i][j]+" ,");
            }
            System.out.println();
        }

        /* Sample Char Array Dari String*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Kata : " );
        String strInput = sc.nextLine();

        /*
        int intX = charYgTadi;
        if((intX>=65 && intX<=90) || (intX>=97 && intX<=122) || (intX>=48 && intX<=57)){
        true
        }

         */
        char chX = 'I';
        int intX = 0;
        int intJumlah =0;
        for (int i=0;i<strInput.length();i++)
        {
            chX =strInput.charAt(i);
            intX = chX;
            if(intX>=65 && intX<=97)
            {
                intJumlah=intJumlah+intX;
            }
            System.out.println("INDEX KE"+i+" ADALAH HURUF "+strInput.charAt(i));
        }



    }
}

package com.juaracoding.jsjavafundamental.cobacoba;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Createrd On 1/13/2023 22:3Pra
@Last Modified 1/13/2023 22:36
Version 1.0
*/


import java.util.Random;

public class CobaCoba {

    /*

    Mohon koreksi nya Pak Paul

     */


    public static final String red = "\u001b[31m";


    public static final String cyan = "\u001b[36m";


    public static void main(String[] args) {

        Random generate = new Random();
        int acak = generate.nextInt(12, 26);
        String strGede = "";
        String result = "";

        //Looping antara min : 12 | max : 26 karakter
        for (int i = 0; i < acak; i++)
        {
            //Merubah string awal menjadi upperCase
            if (i==0)
            {
                //Range 97 s/d 122 adalah kode ASCII untuk abjad kapital
                int konson = generate.nextInt(97, 122);
                char konsonA = (char) konson;
                strGede += konsonA;
                result = strGede.toUpperCase();
                System.out.print(red+result+" ");
            }
            //Panjang karakter berpola max 7
            else if (i < 7)
            {
                    int konsonB = generate.nextInt(97, 122);
                    char konsonC = (char) konsonB;

                    //Define huruf vokal
                    String strVokal = "aiueo";
                    char charB = strVokal.charAt(generate.nextInt(strVokal.length()));

                //metode ganjil genap
                if (i % 2 == 0)
                    {
                        System.out.print(red + konsonC + " ");
                    } else
                    {
                        System.out.print(red + charB + " ");
                    }
            }
            else
            {
                //setelah karakter ke-7 random sesuai max random
                int konson1 = generate.nextInt(97, 122);
                char konsonB = (char) konson1;
                generate.nextInt(97, 122);
                System.out.print(cyan + konsonB + " ");
            }
        }
     }
}









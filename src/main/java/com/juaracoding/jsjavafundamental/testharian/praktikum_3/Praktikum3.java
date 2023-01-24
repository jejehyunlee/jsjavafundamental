package com.juaracoding.jsjavafundamental.testharian.praktikum_3;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Created On 1/23/2023 00:27
@Last Modified 1/23/2023 00:27
Version 1.0
*/

import java.util.Random;

public class Praktikum3 {

        /*
	        Soal Nomor 2 Praktikum 3 Java Fundamental
        */

    public static final String red = "\u001b[31m";
    public static final String cyan = "\u001b[36m";

    public static void main(String[] args) {

        Random generate = new Random();
        int acak = generate.nextInt(12, 26);
        String strGede="";
        String result;

        //Looping antara min : 12 | max : 26 karakter
        for (int i = 0; i < acak; i++) {
            //Merubah string awal menjadi huruf kapital
            if (i==0) {
                String strKonson = "bcdfghjklmnpqrstvwxyz";
                char konsonD = strKonson.charAt(generate.nextInt(strKonson.length()));
                strGede += konsonD;
                result = strGede.toUpperCase();
                System.out.print(red+result+ " ");

            }
            //Panjang karakter berpola max 7
            else if (i < 7) {

                //Define huruf konsonan
                String strKonson = "bcdfghjklmnpqrstvwxyz";
                char konsonC = strKonson.charAt(generate.nextInt(strKonson.length()));

                //Define huruf vokal
                String strVokal = "aiueo";
                char vokalA = strVokal.charAt(generate.nextInt(strVokal.length()));

                //metode ganjil genap
                if (i % 2 == 0) {
                    System.out.print(red + konsonC + " ");
                } else {
                    System.out.print(red + vokalA + " ");
                }
            }
            else {
                //setelah karakter ke-7 random sesuai max random
                int konson1 = generate.nextInt(97, 123);
                char konsonB = (char) konson1;
                generate.nextInt(97, 123);
                System.out.print(cyan + konsonB + " ");
            }
        }
    }
}

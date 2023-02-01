package com.juaracoding.jsjavafundamental.testharian.praktikum_4;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Created On 2/2/2023 00:40
@Last Modified 2/2/2023 00:40
Version 1.0
*/

import java.util.Random;

public class Praktikum4 {

        /*
        Soal Nomor 1 Praktikum 4 Java Fundamental
        */

    public static void main(String[] args) {

        Random generate = new Random();
        StringBuilder stringBuilder =new StringBuilder();
        int acak  = generate.nextInt(25, 40);
        char konsonA;
        int kata;
        int angkaAcak = generate.nextInt(10, 99);
        String email ="gmail";
        String tanda ="_";
        String simbol ="@";
        String domain =".com";
        String tampung = "";
        String tampungB ="";

        for ( int i=0; i<acak; i++) {
            kata = generate.nextInt(97, 123);
            konsonA = (char) kata;
            if(i%2==0){
                tampung+=konsonA;
            }
        }
        tampungB+=tampung;
        stringBuilder.append(tampungB);
        stringBuilder.insert(tampungB.length()/2,tanda);
        stringBuilder.append(angkaAcak);
        stringBuilder.append(simbol);
        stringBuilder.append(email);
        stringBuilder.append(domain);
        System.out.println(stringBuilder);
    }
}

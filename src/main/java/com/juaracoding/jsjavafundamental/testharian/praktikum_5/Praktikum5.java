package com.juaracoding.jsjavafundamental.testharian.praktikum_5;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Created On 2/4/2023 21:38
@Last Modified 2/4/2023 21:38
Version 1.0
*/

import java.util.Scanner;

public class Praktikum5 {

        /*
        Soal Nomor 1 Praktikum 5 Java Fundamental
        */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int intJumlah = sc.nextInt();
        for (int i=0; i<intJumlah; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}

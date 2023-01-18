package com.juaracoding.jsjavafundamental.testharian.praktikum_2;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Created On 1/18/2023 11:26
@Last Modified 1/18/2023 11:26
Version 1.0
*/

import java.util.Scanner;

public class Praktikum2 {

    /*
	Soal Nomor 1 Praktikum 2 Java Fundamental
    */

    public static void main(String[] args) {
        System.out.println("masukan angka sepuasnya :");
        int input = 0;
        double jumlah = 0.0;
        int hasil = 0;
        Scanner sn = new Scanner(System.in);
        try {
                for (int i = 0; i >= 0; i++)
                {
                    input = sn.nextInt();
                    int[] bagi = {input};
                    hasil += bagi.length;
                    jumlah += input;

                }
            }
        catch (Exception exception)
            {
                System.out.println("Jumlah Rata rata inputan adalah " + jumlah/hasil);
                System.exit(0);
            }
    }
}

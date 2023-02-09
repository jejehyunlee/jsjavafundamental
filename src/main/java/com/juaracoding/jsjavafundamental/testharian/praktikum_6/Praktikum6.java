package com.juaracoding.jsjavafundamental.testharian.praktikum_6;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Created On 2/9/2023 13:34
@Last Modified 2/9/2023 13:34
Version 1.0
*/

import java.util.Scanner;

public class Praktikum6 {

    /*
	Soal Nomor 2 Praktikum 6 Java Fundamental
    */

    public static void main(String[] args) {

        int[] intArr = new int[100];
        int n;
        boolean ulang = true;
        boolean notFound = true;
        try {

            while (ulang){
                Scanner sc = new Scanner(System.in);
                System.out.println("Masukan angka = ");
                for (int i = 0; i < intArr.length; i++) {
                    intArr[i] = sc.nextInt();
                }
            }
        }catch (Exception e) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Angka yang dicari adalah = ");
            n = sc.nextInt();
            System.out.print("Data yang anda cari adalah " + n);
            System.out.println(" ");

                try {
                    for (int i = 0; i <= intArr.length; i++) {
                        if (n == intArr[i]) {
                            System.out.println("Angka " +n+ " sudah ditemukan , pada index ke " + i +" Urutan ke "+ (i+1));
                            break;
                        }
                    }
                }catch (Exception exception){
                    if(notFound) {
                        System.out.println("Angka  " + n + " yang anda cari tidak ditemukan !! ");
                    }
                }

            }

        }

    }


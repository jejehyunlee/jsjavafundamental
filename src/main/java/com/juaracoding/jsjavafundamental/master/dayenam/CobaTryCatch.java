package com.juaracoding.jsjavafundamental.master.dayenam;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
@Author JEJE a.k.a Jefri S
Java Developer
Createrd On 1/11/2023 18:55
@Last Modified 1/11/2023 18:55
Version 1.0
*/
import java.util.Scanner;

public class CobaTryCatch {
    public static void main(String[] args) {

                //deklarasi dan inisialisasi
                Scanner sc = new Scanner(System.in);
                int intNumber = 0, intTotal = 0;
                boolean isAgain = true;

                try {
                    System.out.println("Masukkan angka sepuasnya: ");
                    do {
                        intNumber = sc.nextInt();//input

                        intTotal += intNumber;//proses penjumlahan input
                    } while (isAgain);//perulangan utk input kembali
                } catch (Exception e) {//exception handling utk input karakter
                    System.out.println("Jumlah: " + intTotal);//output
                    System.exit(0);//keluar dari sistem
                }
            }
        }


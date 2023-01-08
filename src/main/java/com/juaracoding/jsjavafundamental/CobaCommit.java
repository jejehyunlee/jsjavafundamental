package com.juaracoding.jsjavafundamental;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
@Author JEJE a.k.a Jefri S
Java Developer
Createrd On 1/5/2023 11:22
@Last Modified 1/5/2023 11:22
Version 1.0
*/


import java.util.Scanner;

public class CobaCommit {
    public static void main(String[] args) {
//        int intX = 2 ;
//        if(intX=2){
//            System.out.println("benar");
//        } else {
//            System.out.println("Salah");
//        }
//        System.out.println(Integer.toBinaryString(10));

//    == concat (Gabungkan 2 String) ==
//        String nama1 = "jefri ";
//        String nama2 = "saputra";
//        System.out.println(nama1.concat(nama2));

//    == lenght -> Jumlah Karaker ==
//        String namaKu = "Jefri Saputra";
//        System.out.println(namaKu.length());

//    == charAt -> mengambil suatu karakter
//        String namaKu = "Jefri Saputra";
//        char huruf = namaKu.charAt(3);
//        System.out.println(huruf);

//    == equals -> bandigkan 2 / lebih string
        /*
            Jika menggunakan equals = string harus sama persis (Jefri vs Jefri)
            Jika mengguanakan equalsIgnoreCase = String besar kecil masih oke (Jefri vs jefri)
         */
//          String namaKu = "Jefri";
//          String namaTeman ="Jefri";
//          System.out.println(namaKu.equals(namaTeman));

//     == subtring -> extraksi hurus berdasrkan range index
//        String nama = "JavaProgrammer";
//        System.out.println(nama.substring(6,9));

//            int A = 2;
//            if(2 == -2){
//                System.out.println("sama");
//            } else {
//                System.out.println("beda");
//            }
//        double hasil = 75/8.0;
//        System.out.println(hasil);

        int intPanjang = 0;
        System.out.println("Sebelum diinput " + intPanjang);
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai panjang : ");
        intPanjang = sc.nextInt();
        System.out.println("Hasil nilai panjang adalah " + intPanjang);


    }
    }

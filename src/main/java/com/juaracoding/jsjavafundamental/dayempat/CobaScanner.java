package com.juaracoding.jsjavafundamental.dayempat;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
@Author JEJE a.k.a Jefri S
Java Developer
Createrd On 1/8/2023 15:32
@Last Modified 1/8/2023 15:32
Version 1.0
*/

import java.util.Scanner;

public class CobaScanner {
    public static void main(String[] args) {

//      == Scanner -> Membuat inputan pada consloe ==

        int intPanjang = 10;
        System.out.println("Sebelum diinput " + intPanjang);
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai panjang : ");
        intPanjang = sc.nextInt();
        System.out.println("Hasil input nilai panjang adalah " + intPanjang);

    }
}

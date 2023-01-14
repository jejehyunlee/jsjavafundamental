package com.juaracoding.jsjavafundamental.testharian.praktikum_1;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Createrd On 1/13/2023 22:42
@Last Modified 1/13/2023 22:42
Version 1.0
*/

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {

            /* Soal
     1. (Input)  : Jquery 1995@v1.0
        (Output} : 529

     2. (Input}  : Bebas Lepas@
        (Output) : 238

     3. (Input)  : Tid4k $@ma
        (Output) : ?????
         */

        //start convert all string to ASCII
        char chaConvert = 'I';
        int intHasil= 0;
        int intSeluruhSatu = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Percobaan pertama");
        System.out.print("Masukan kata no. 1 : ");
        String inputSatu = sc.nextLine();
        for (int i = 0; i < inputSatu.length(); i++)
        {
            chaConvert = inputSatu.charAt(i);
            intHasil = chaConvert;
            if ((intHasil >=32 && intHasil <=47) || (intHasil>=48 && intHasil<=57) || (intHasil>=58 && intHasil<=64) || (intHasil>=65 && intHasil<=90) || (intHasil>=97 && intHasil<=122) )
            {
                System.out.println("Kode ASCII dari "+inputSatu.charAt(i)+" adalah "+ intHasil);
                intSeluruhSatu += intHasil;
            }
        }
        System.out.println("Hasil dari input "+inputSatu +" adalah "+intSeluruhSatu);
        System.out.println("Jumlah belum sesuai");
        //end convert all string to ASCII

        System.out.println("");
        System.out.println("Analisa");
        //start convert string to ASCII
        int intTotalSatu = 0;
        for (int i = 0; i < inputSatu.length(); i++)
        {
            chaConvert = inputSatu.charAt(i);
            intHasil = chaConvert;
            if ((intHasil >=32 && intHasil <=47) || (intHasil>=48 && intHasil<=57) || (intHasil>=58 && intHasil<=64) || (intHasil>=65 && intHasil<=90))
            {
                System.out.println("Kode ASCII dari "+inputSatu.charAt(i)+" adalah "+ intHasil);
                intTotalSatu += intHasil;
            }
        }
        System.out.println("Hasil dari input "+inputSatu +" adalah "+intTotalSatu);
        System.out.println("Jumlah sesuai");
        //End convert string to ASCII

        System.out.println("");
        System.out.println("===========================================================");
        System.out.println("");

        //start convert all string to ASCII
        int intSeluruhDua = 0;
        System.out.println("Percobaan kedua");
        System.out.print("Masukan kata no. 2 : ");
        String inputDua = sc.nextLine();
        for (int i = 0; i < inputDua.length(); i++)
        {
            chaConvert = inputDua.charAt(i);
            intHasil = chaConvert;
            if ((intHasil >=32 && intHasil <=47) || (intHasil>=48 && intHasil<=57) || (intHasil>=58 && intHasil<=64) || (intHasil>=65 && intHasil<=90) || (intHasil>=97 && intHasil<=122) )
            {
                System.out.println("Kode ASCII dari "+inputDua.charAt(i)+" adalah "+intHasil);
                intSeluruhDua += intHasil;
            }
        }
        System.out.println("Hasil dari input "+inputDua +" adalah "+intSeluruhDua);
        System.out.println("Jumlah belum sesuai");
        //End convert all string to ASCII

        System.out.println("");
        System.out.println("Analisa");
        //start convert string to ASCII
        int intTotalDua = 0;
        for (int i = 0; i < inputDua.length(); i++)
        {
            chaConvert = inputDua.charAt(i);
            intHasil = chaConvert;
            if ((intHasil >=32 && intHasil <=47) || (intHasil>=48 && intHasil<=57) || (intHasil>=58 && intHasil<=64) || (intHasil>=65 && intHasil<=90))
            {
                System.out.println("Kode ASCII dari "+inputDua.charAt(i)+" adalah "+intHasil);
                intTotalDua += intHasil;
            }
        }
        System.out.println("Hasil dari input "+inputDua +" adalah "+intTotalDua);
        System.out.println("Jumlah sesuai");
        //End convert string to ASCII

        System.out.println("");
        System.out.println("============================================================");
        System.out.println("");

        //start convert all string to ASCII
        int intSeluruhTiga = 0;
        System.out.print("Masukan kata no. 3 : ");
        String inputTiga = sc.nextLine();
        for (int i = 0; i < inputTiga.length(); i++)
        {
            chaConvert = inputTiga.charAt(i);
            intHasil = chaConvert;
            if ((intHasil >=32 && intHasil <=47) || (intHasil>=48 && intHasil<=57) || (intHasil>=58 && intHasil<=64) || (intHasil>=65 && intHasil<=90) || (intHasil>=97 && intHasil<=122) )
            {
                System.out.println("Kode ASCII dari "+inputTiga.charAt(i)+" adalah "+intHasil);
                intSeluruhTiga += intHasil;
            }
        }
        System.out.println("Hasil dari input "+inputTiga+" adalah "+intSeluruhTiga);
        System.out.println("Jumlah belum sesuai");
        //End convert all string to ASCII

        System.out.println("");
        System.out.println("Analisa - menghilangkan karakter huruf kecil ");

        //Start convert string to ASCII
        int intTotalTiga = 0;
        for (int i = 0; i < inputTiga.length(); i++)
        {
            chaConvert = inputTiga.charAt(i);
            intHasil = chaConvert;
            if ((intHasil >=32 && intHasil <=47) || (intHasil>=48 && intHasil<=57) || (intHasil>=58 && intHasil<=64) || (intHasil>=65 && intHasil<=90))
            {
                System.out.println("Kode ASCII dari "+inputTiga.charAt(i)+" adalah "+intHasil);
                intTotalTiga += intHasil;
            }
        }
        System.out.println("Hasil dari input "+inputTiga+" adalah "+intTotalTiga);
        System.out.println("Jumlah sesuai");
        //End convert all string to ASCII
    }
}

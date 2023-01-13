package com.juaracoding.jsjavafundamental.master.daydelapan;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
@Author JEJE a.k.a Jefri S
Java Developer
Createrd On 1/12/2023 23:07
@Last Modified 1/12/2023 23:07
Version 1.0
*/

public class Coretan {
    public static void main(String[] args) {
//    int arr[] ={6, 3, 1, 2};
//
//        System.out.println(arr[3]);

        int [] array = {2, 7, 3, 5, 8, 9};

        int kuncen = array[0];

        for (int i = 0; i < array.length; i++)

        {

            if (array[i] > kuncen)

                kuncen = array[i];

        }

        System.out.print(kuncen);

        int [] tahun = new int [7];

        tahun[0] = 2004;

        tahun[1] = 2006;

        System.out.println(tahun[0] + " " + tahun[1] + " " + tahun[7]);


    }
}

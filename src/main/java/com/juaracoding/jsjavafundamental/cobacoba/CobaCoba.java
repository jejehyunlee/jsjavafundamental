package com.juaracoding.jsjavafundamental.cobacoba;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Createrd On 1/13/2023 22:3Pra
@Last Modified 1/13/2023 22:36
Version 1.0
*/


import java.util.Random;
import java.util.Scanner;

public class CobaCoba {

    /*

    Mohon koreksi nya Pak Paul

    Saya stuck dengan logic random

    thanks

     */



    public static final String RED = "\u001b[31m";

    public static final String CYAN = "\u001b[36m";

    public static void main(String[] args) {

        Random anuin = new Random();
        Scanner sc= new Scanner(System.in);
        System.out.print("Masukan jumlah :   ");
        int input = sc.nextInt();


        for (int i = 1; i <=7; i++) {

            int konson = anuin.nextInt(97, 122);
            char konsonA = (char) konson;

            String strVokal = "AIUEO";
            char charB = strVokal.charAt(anuin.nextInt(strVokal.length()));

            if (i%2==0){
                System.out.print(RED+konsonA+" ");
            } else {
                System.out.print(RED+charB+" ");
            }
        }


        for (int j=0; j<input; j++){

            int konson1 = anuin.nextInt(97, 122);
            char konsonB = (char) konson1;

            if (anuin.nextInt(97, 122) != 0){
                System.out.print(CYAN+konsonB+" ");

            }
        }



    }

}




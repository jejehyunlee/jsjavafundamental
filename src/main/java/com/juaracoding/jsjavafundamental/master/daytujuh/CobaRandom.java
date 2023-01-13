package com.juaracoding.jsjavafundamental.master.daytujuh;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
@Author JEJE a.k.a Jefri S
Java Developer
Createrd On 1/11/2023 21:12
@Last Modified 1/11/2023 21:12
Version 1.0
*/

public class CobaRandom {

        public static void main(String[] args) {
            //Generate random number
            double rand = Math.random();
            System.out.println("Random Number :" + rand);

            int max = 10;
            int min = 1;
            int range = max - min + 1;

            //generate random numbers within 1 to 10
            for(int i=0;i<10;i++)
            {
                int randInt = (int)(Math.random() * range) + min;

                //Output is different everytime this code is executed
                System.out.print(randInt+",");
            }
        }
    }




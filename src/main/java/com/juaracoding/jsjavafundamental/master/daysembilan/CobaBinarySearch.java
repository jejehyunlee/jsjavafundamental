package com.juaracoding.jsjavafundamental.master.daysembilan;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Createrd On 1/13/2023 22:13
@Last Modified 1/13/2023 22:13
Version 1.0
*/

public class CobaBinarySearch {
    public static void main(String[] args) {
        int keyword = 88;
        int [] val = {66,77,80,84,88,99,100,105,111,114,119};//DATA GANJIL
        int low  = 0;
        int high = val.length-1;
        int med  = 0;
        boolean status = false;

        while(low<=high)
        {
            med = (low+high)/2;
            if(keyword==val[med])
            {
                System.out.println(keyword+" FOUNDED in position "+(med+1)+" and INDEX "+med);
                status=true;
                break;
            }
            else
            {
                if(keyword>val[med])
                {
                    low = med + 1;

                }
                else
                {
                    high = med - 1;
                }
            }
        }//END OF WHILE PROCESS

        //IF DATA NOT FOUND
        if(!status)
        {
            System.out.println(keyword+" NOT FOUND !!");
        }

    }
}

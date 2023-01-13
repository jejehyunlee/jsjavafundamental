package com.juaracoding.jsjavafundamental.master.daysembilan;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Createrd On 1/13/2023 21:04
@Last Modified 1/13/2023 21:04
Version 1.0
*/

public class CobaBubbleSortAsc {

            static StringBuilder sBuild = new StringBuilder();

            public static void main(String[] args) {
                int val[] = {99,76,87,69,80};
                String bef = "";
                String aft = "";
                int initz = 0;
                int intContainer = 0;
                int loopNext = 0;

                sBuild.setLength(0);
                //before
                System.out.println("\n==BEFORE==");

                for (int num:val)
                {
                    bef = sBuild.append(num).append(",").toString();
                }
                System.out.print(bef.substring(0,bef.length()-1));

                //logic
                for (int i =0 ; i < val.length ; i++ )
                {
                    loopNext = 1;
                    for (int j=0 ; j < val.length-1 ; j++)
                    {
                        //if the current value is greater than the next value
                        if(val[j]>val[loopNext])
                        {
                            //then swap
                            intContainer = val[j];
                            val[j]=val[loopNext];
                            val[loopNext] = intContainer;
                        }
                        loopNext++;
                    }
                }

                sBuild.setLength(0);
                //after
                System.out.println("\n==AFTER==");
                for (int num:val)
                {
                    aft = sBuild.append(num).append(",").toString();
                }
                System.out.print(aft.substring(0,aft.length()-1));
            }
        }


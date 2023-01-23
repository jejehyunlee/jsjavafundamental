package com.juaracoding.jsjavafundamental.master.oop;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Created On 1/24/2023 01:05
@Last Modified 1/24/2023 01:05
Version 1.0
*/

public class AnakOop {

    public String nama ="jeje";
    String alamat = "Bekasi";
    protected int usia = 30;

    private String gaji;

    public static void main(String[] args) {
        AksesOop aksesOop = new AksesOop();

        System.out.println(aksesOop.getAkses());


    }


}

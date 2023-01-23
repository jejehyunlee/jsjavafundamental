package com.juaracoding.jsjavafundamental.master.oop;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Created On 1/24/2023 01:06
@Last Modified 1/24/2023 01:06
Version 1.0
*/

public class AksesOop {


    public String nama = "Jefri";

    private final String alamat = "JAKARTA";

    protected int usia = 20;

    String gaji;


    public Object getAkses(){
        System.out.println(nama);
        System.out.println(alamat);
        System.out.println(usia);
        System.out.println(gaji);
        return null;
    }

    public static void main(String[] args) {

        BapaOop bapaOop = new BapaOop();
        System.out.println(bapaOop.getData());
    }

}

package com.juaracoding.jsjavafundamental.master.oop;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Created On 1/24/2023 01:02
@Last Modified 1/24/2023 01:02
Version 1.0
*/

public class Method {

    private void cetakNama(){
        // ini method void tanpa parameter
        System.out.println("Nama : JEJE");
    }

    private void cetakAlamat(String alamat){
        // ini method void dengan parameter
        System.out.println("Alamat : "+alamat);
    }

    private String cetakJob(){
        // ini method non void tanpa parameter
        return "Programmer";
    }

    public static void main(String[] args){
        Method obj = new Method();

        obj.cetakNama();

        obj.cetakAlamat("Jakarta");

        System.out.println("Job : "+obj.cetakJob());
    }
}

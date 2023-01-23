package com.juaracoding.jsjavafundamental.master.dayduabelas.oopensapculations;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Created On 1/19/2023 20:06
@Last Modified 1/19/2023 20:06
Version 1.0
*/

public class Employe {

    private long id;
    private String nama;
    private String shift;

    public Employe() {
    }

    public Employe(long id, String nama, String shift) {
        this.id = id;
        this.nama = nama;
        this.shift = shift;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}

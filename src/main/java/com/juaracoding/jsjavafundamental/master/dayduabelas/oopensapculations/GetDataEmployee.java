package com.juaracoding.jsjavafundamental.master.dayduabelas.oopensapculations;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Created On 1/19/2023 20:08
@Last Modified 1/19/2023 20:08
Version 1.0
*/

import com.juaracoding.jsjavafundamental.master.dayduabelas.oopensapculations.Employe;

public class GetDataEmployee {
    public static void main(String[] args) {

        Employe employe = new Employe();
        System.out.println(employe);

        employe.setId(1);
        employe.getId();

        System.out.println(employe.getId());

    }

}

package com.sda.oop.person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DanePersonalne dp1 = new DanePersonalne("Marek", "Nowak", LocalDate.of(1997,02,01), "Toruń", "Włocławska", 167);
        //System.out.println("Osoba :" + dp1);
        //System.out.println("Osoba :" + dp1.osoba.imie);
        System.out.println("Osoba :" +dp1);

        OsobaReal janek = new OsobaReal("Jan", "Nowak", LocalDate.of(1992,02,01));
        Adres torunski = new Adres("Toruń", "Włocławska", 167);

        DanePersonalne dp2 = new DanePersonalne(janek,torunski);
        System.out.println("Osoba 2: "+dp2);
        System.out.println("Tylko dane adresowe Osoaba2 " + dp2.adres);
    }

}

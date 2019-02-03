package com.sda.oop.person;

import java.time.LocalDate;

public class DanePersonalne {
    OsobaReal osoba;
    Adres adres;

    public DanePersonalne(String imie, String nazwisko, LocalDate dataUr, String miasto, String ulica, int nr_domu) {
        osoba = new OsobaReal(imie, nazwisko, dataUr);
        adres = new Adres(miasto, ulica, nr_domu);
    }

    public DanePersonalne(OsobaReal osoba, Adres adres) {
        this.osoba = osoba;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return this.osoba.imie+" "+this.osoba.nazwisko;
    }
}

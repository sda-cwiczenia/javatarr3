package com.sda.oop.person;

import java.time.LocalDate;

public class OsobaReal implements Osoba {

    String imie;
    String nazwisko;
    LocalDate dataUr;

    public OsobaReal(String imie, String nazwisko, LocalDate dataUr) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUr = dataUr;
    }

    @Override
    public String getImie() {
        return imie;
    }

    @Override
    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public LocalDate getDataUr() {
        return dataUr;
    }

    @Override
    public void setDataUr(LocalDate dataUr) {
        this.dataUr = dataUr;

    }

    @Override
    public String toString() {
        return "OsobaReal{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUr=" + dataUr +
                '}';
    }
}

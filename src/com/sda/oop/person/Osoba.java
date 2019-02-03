package com.sda.oop.person;

import java.time.LocalDate;

public interface Osoba {

    String getImie();
    void setImie(String imie);
    String getNazwisko();
    void setNazwisko(String nazwisko);
    LocalDate getDataUr();
    void setDataUr(LocalDate dataUr);
}

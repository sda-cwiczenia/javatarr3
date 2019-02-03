package com.sda.oop.person;

public class Adres {
    String miasto;
    String ulica;
    int nr_domu;

    public Adres(String miasto, String ulica, int nr_domu) {
        this.miasto = miasto;
        this.ulica = ulica;
        this.nr_domu = nr_domu;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                ", nr_domu=" + nr_domu +
                '}';
    }
}

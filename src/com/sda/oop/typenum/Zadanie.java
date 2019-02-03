package com.sda.oop.typenum;

public class Zadanie {
    enum Zespol { ADAM, ROMAN, KAROLINA;}

    public static void main(String[] args) {
        Zespol osoba = Zespol.KAROLINA;

        System.out.println(osoba.name());
        System.out.println(osoba.ordinal());
        System.out.println(osoba.compareTo(Zespol.ROMAN));
        System.out.println(osoba.getDeclaringClass());
    }
}

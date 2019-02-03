package com.sda.oop.typenum;

public class Tshirt {

    public enum TshirtSize {
        S,
        M,
        L,
        XL
    }

    private TshirtSize size;

    private String manufacturer;

    public Tshirt(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public Tshirt(String manufacturer) {
        size = TshirtSize.M;
        this.manufacturer = manufacturer;
    }

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(TshirtSize.L, "Boss");
        Tshirt tshirt2 = new Tshirt("Vistula");
        System.out.println("Tshirt "+tshirt.manufacturer+", rozmiar "+tshirt.size);
        System.out.println("Tshirt "+tshirt2.manufacturer+", rozmiar "+tshirt2.size);
        //System.out.println("A powinienies nosic rozmiar " + tshirt.size2);
    }

}





package com.sda.oop.zadanie5a.ciasto;

public class PrzygotujPizze implements PizzaDough{

    String pizzaName;

    public PrzygotujPizze(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    @Override
    public void preparePizzaDough() {

        System.out.println("Przygotowuję ciasto dla pizza "+pizzaName);

    }
}

package com.sda.oop.zadanie5a.ciasto;

public class PrzygotujCiasto implements PizzaDough{

    String pizzaName;

    public PrzygotujCiasto(PizzaType pizzaName) {

        this.pizzaName = pizzaName.name();
    }

    @Override
    public void preparePizzaDough() {

        System.out.println("Przygotowuję ciasto dla pizza "+pizzaName);

    }
}

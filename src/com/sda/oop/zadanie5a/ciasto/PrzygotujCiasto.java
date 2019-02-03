package com.sda.oop.zadanie5a.ciasto;

public class PrzygotujCiasto implements PizzaDough{

    String pizzaName;

    public PrzygotujCiasto(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    @Override
    public void preparePizzaDough() {

        System.out.println("Przygotowujê ciasto dla pizza "+pizzaName);

    }
}

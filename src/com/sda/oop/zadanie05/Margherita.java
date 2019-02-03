package com.sda.oop.zadanie05;

import java.util.ArrayList;
import java.util.List;

public class Margherita implements Pizza, Ingredients {

    List<String> ingredients = new ArrayList<String>();
    private PizzaDough ciasto;

    public Margherita() {
    }

    public Margherita(PizzaDough ciasto, String...skladniki) {

        for(String skladnik : skladniki){
            ingredients.add(skladnik);
        }
        this.ciasto = ciasto;
    }

    @Override
    public void preparePizza() {
        System.out.println("Przygotowywanie pizza Margherita:");
        ciasto.preparePizzaDough();
        for(String skladnik :ingredients){
            System.out.println("Dodajê sk³adnik: "+skladnik);
        }
        System.out.println("-----------------------------");
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }
}

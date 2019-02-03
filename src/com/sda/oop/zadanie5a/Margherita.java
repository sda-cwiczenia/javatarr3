package com.sda.oop.zadanie5a;

import com.sda.oop.zadanie5a.ciasto.Ingredients;
import com.sda.oop.zadanie5a.ciasto.PizzaDough;

import java.util.ArrayList;
import java.util.List;

public class Margherita implements Pizza,Ingredients {

    List<String> skladniki = new ArrayList<String>();
    private PizzaDough ciasto;

    public Margherita() {
    }

    public Margherita(PizzaDough ciasto,String...skladniki) {
        for(String skladnik : skladniki) {
            this.skladniki.add(skladnik);
            this.ciasto = ciasto;
        }
    }
    @Override
    public void preparePizza() {
        ciasto.preparePizzaDough();
        for (String skladnik : skladniki) {
            System.out.println("Dodajê " + skladnik);
        }
        System.out.println("------------------------");
    }

    @Override
    public List<String> getIngredients() {
        return skladniki;
    }
}

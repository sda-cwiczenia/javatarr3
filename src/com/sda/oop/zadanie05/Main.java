package com.sda.oop.zadanie05;

import com.sda.oop.zadanie05.doughs.AllAmericanThin;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pizza> menu = new ArrayList<Pizza>();
        menu.add(new Margherita(new AllAmericanThin(), "Ser","Pieczarki","Sos"));
        menu.add(new Margherita(new AllAmericanThin(), "Ser","Pieczarki"));

        for (Pizza pizza : menu) {
            pizza.preparePizza();
         }
    }
}

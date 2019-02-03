package com.sda.oop.zadanie5a;

import com.sda.oop.zadanie5a.ciasto.PizzaType;
import com.sda.oop.zadanie5a.ciasto.PrzygotujCiasto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pizza> menu = new ArrayList<>();
        menu.add(new Margherita(new PrzygotujCiasto(PizzaType.MARGHERITA),"ser","sos","oregano"));
        menu.add(new Veggie(new PrzygotujCiasto(PizzaType.VEGGIE),"szpinak","sos","pomidory"));

        for (Pizza pizza : menu) {
            pizza.preparePizza();

        }
    }
}

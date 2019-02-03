package com.sda.oop.typenum;

import java.util.Scanner;

public class KoloryKart {
    enum Suits {
        SPADES(40),
        HEARTS(30),
        DIMAONDS(20),
        CLUBS(10);

        private int points;

        private Suits(int points) {
            this.points = points;
        }

        public int getPoints() {
            return points;
        }

        public static boolean contains(String name) {
            for (Suits c : Suits.values()) {
                if (name.equals(c.name()))
                    return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Wpisz jedną z nazw poniższych kolorów ");
        for(Suits c: Suits.values()){
            System.out.print(c+" ");
        }
        System.out.print(": ");
        String cName = scan.next();
        Suits card;
        if (Suits.contains(cName)) {
            card = Suits.valueOf(cName);
            System.out.println(card.getPoints());
        } else {
            System.out.println("Wpisałeś niepoprawny kolor");
        }

    }

}
